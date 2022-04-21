package com.tushar.springjpaexample;

import com.tushar.springjpaexample.OneToManyUnidirectional.model.Student;
import com.tushar.springjpaexample.OneToManyUnidirectional.model.University;
import com.tushar.springjpaexample.OneToManyUnidirectional.repository.StudentRepository;
import com.tushar.springjpaexample.OneToManyUnidirectional.repository.UniversityRepository;
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

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication @Slf4j
public class SpringjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(SpringjpaexampleApplication.class, args);

		StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);
		UniversityRepository universityRepository = configurableApplicationContext.getBean(UniversityRepository.class);

		Student std1 = new Student("1111");
		Student std2 = new Student("1112");
		List<Student> students = Arrays.asList(std1,std2);

		University university = new University("Tushar", students);

		universityRepository.save(university);


	}

}
