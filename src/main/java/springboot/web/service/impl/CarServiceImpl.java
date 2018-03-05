//package springboot.web.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import springboot.web.entity.Car;
//import springboot.web.repository.CarRepository;
//import springboot.web.servic.CarService;
//
//@Service
//public class CarServiceImpl implements CarService{
//
//	@Autowired
//	private CarRepository carRepository;
//	
//	@Override
//	public void saveCar(Car car) {
//		carRepository.save(car);
//	}
//
//	@Override
//	public List<Car> findAllCars() {
//		return carRepository.findAll();
//	}
//
//}
