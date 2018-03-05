//package springboot.web.entity;
//
//import javax.persistence.Entity;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//import org.hibernate.validator.constraints.NotEmpty;
//
//@Entity
//
//public class Car extends BaseEntity {
//
//	@NotNull(message = "1Can't be empty")
//	@NotEmpty(message = "2Can't be empty")
//	@Size(min = 2, max = 10)
//	private String make;
//	
//	@NotNull(message = "1Can't be empty")
//	@NotEmpty(message = "3Can't be empty")
//	@Size(min = 2, max = 5)
//	private String model;
//	
//	private String color;
//	
//	public Car() {
//	}
//
//	public String getMake() {
//		return make;
//	}
//
//	public void setMake(String make) {
//		this.make = make;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//}
