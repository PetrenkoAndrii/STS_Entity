//package springboot.web.controller;
//
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayInputStream;
//import java.io.File;
//import java.io.IOException;
//
//import javax.imageio.ImageIO;
//
//import org.apache.commons.io.FileUtils;
//import org.apache.tomcat.util.codec.binary.Base64;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//import springboot.web.entity.UploadFile;
//import springboot.web.servic.UploadFileService;
//
//@Controller
//@RequestMapping("/file")
//public class UploadFileController {
//
//	@Autowired
//	private UploadFileService uploadFileService;
//	
//	@GetMapping("/upload")
//	public String showUploadForm() {
//		return "file/upload";
//	}
//	
//	@PostMapping("/upload")
//	public String saveFileDatabase(
//			@RequestParam("fileUpload") MultipartFile file) throws IOException {
//		if(file != null) {
//			UploadFile uploadFile = new UploadFile();
//			uploadFile.setFileName(file.getOriginalFilename());
//			uploadFile.setFileData(file.getBytes());
//			uploadFileService.saveFile(uploadFile);
//		}
//		return "redirect:/file/upload";
//	}
//	
//	@GetMapping("/preview")
//	public String showImageFromDB(Model model) {
//		UploadFile uploadFile = uploadFileService.findFileById(1);
//		String encodedFile = new String(Base64.encodeBase64(uploadFile.getFileData()));
//		model.addAttribute("imageSrc", encodedFile);
//		return "file/preview";
//	}
//	
//	@PostMapping("/upload/to-project-directory")
//	public String saveFileToProjectDirectory(
//			@RequestParam("fileUpload") MultipartFile file) throws IOException {
//		String rootPath = System.getProperty("user.dir");
//		File uploadDir = new File(rootPath + File.separator
//				+ "src" + File.separator + "main" + File.separator
//				+ "webapp" + File.separator + "upload");
//		if(!uploadDir.exists()) uploadDir.mkdir();
//		
//		if(file != null &&!file.isEmpty()) {
//			BufferedImage bufferedImahe = ImageIO.read(
//					new ByteArrayInputStream(file.getBytes()));
//		
//			File destination = new File(uploadDir.getAbsolutePath() 
//					+ File.separator + file.getOriginalFilename());
//			ImageIO.write(bufferedImahe, "png", destination);
//		}
//		return "redirect:file/preview";
//	}
//	
//	@GetMapping("/file-from-project")
//	public String showImageFromProjectDirectory(Model model) throws IOException {
//		String rootPath = System.getProperty("user.dir");
//		File uploadDir = new File(rootPath + File.separator
//				+ "src" + File.separator + "main" + File.separator
//				+ "webapp" + File.separator + "upload" + File.separator 
//				+ "Agnes_Unicorn.png");
//		byte[] fileToByteArray = Base64.encodeBase64(
//				FileUtils.readFileToByteArray(uploadDir));
//		String encodedByte = new String(fileToByteArray);
//		
//		model.addAttribute("imageFromProject", encodedByte);
//		return "file/preview";
//	}
//}
