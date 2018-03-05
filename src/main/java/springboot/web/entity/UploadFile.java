//package springboot.web.entity;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Lob;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "upload_file")
//public class UploadFile extends BaseEntity {
//
//	@Column(name = "file_name")
//	private String fileName;
//
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	@Column(name = "file_data", columnDefinition = "MEDIUMBLOB")
//	private byte[] fileData;
//
//	public UploadFile() {
//	}
//
//	public String getFileName() {
//		return fileName;
//	}
//
//	public void setFileName(String fileName) {
//		this.fileName = fileName;
//	}
//
//	public byte[] getFileData() {
//		return fileData;
//	}
//
//	public void setFileData(byte[] fileData) {
//		this.fileData = fileData;
//	}
//
//}
