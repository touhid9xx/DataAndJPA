package com.tushar.springjpaexample;

import com.tushar.springjpaexample.OneToOneBidirectional.Models.Car;
import com.tushar.springjpaexample.OneToOneBidirectional.Models.Owner;
import com.tushar.springjpaexample.OneToOneBidirectional.Repository.CarRepository;
import com.tushar.springjpaexample.OneToOneBidirectional.Repository.OwnerRepository;
import com.tushar.springjpaexample.OneToOneUnidirectional.model.Address;
import com.tushar.springjpaexample.OneToOneUnidirectional.model.User;
import com.tushar.springjpaexample.OneToOneUnidirectional.repository.AddressRepository;
import com.tushar.springjpaexample.OneToOneUnidirectional.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication @Slf4j
public class SpringjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(SpringjpaexampleApplication.class, args);

//		CarRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
//		OwnerRepository ownerRepository = configurableApplicationContext.getBean(OwnerRepository.class);
//
//		Car car = new Car("m001");
//		carRepository.save(car);
//
//		Owner owner = new Owner("Tushar");
//		owner.setCar(car);
//		ownerRepository.save(owner);
//
//
//		Optional<Car> optionalCar = carRepository.findById(1L);
//		Optional<Owner> optionalOwner = ownerRepository.findById(2L);
//
//		if(optionalCar.isPresent() && optionalOwner.isPresent()) {
//			log.info(optionalCar.get() + " is ownd by" + optionalCar.get().getOwner());
//			log.info(optionalOwner.get()+ " has a car" + optionalOwner.get().getCar());
//		}

		AddressRepository addressRepository = configurableApplicationContext.getBean(AddressRepository.class);
		UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);

		Address address = new Address("street");
		addressRepository.save(address);

		User user = new User("tushar",address);
		userRepository.save(user);

	}

}
