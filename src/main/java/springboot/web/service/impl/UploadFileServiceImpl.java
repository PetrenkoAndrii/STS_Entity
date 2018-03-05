//package springboot.web.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import springboot.web.entity.UploadFile;
//import springboot.web.repository.UploadFileRepository;
//import springboot.web.servic.UploadFileService;
//
//@Service
//public class UploadFileServiceImpl implements UploadFileService {
//
//	@Autowired 
//	private UploadFileRepository uploadRepository;
//	
//	@Override
//	public void saveFile(UploadFile file) {
//		uploadRepository.save(file);
//	}
//
//	@Override
//	public UploadFile findFileById(int id) {
//		return uploadRepository.findOne(id);
//	}
//
//}
