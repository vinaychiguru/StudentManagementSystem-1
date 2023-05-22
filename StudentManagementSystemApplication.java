package com.edubridge.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.edubridge.springboot.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
			Student student1 = new Student("Chaitanya","Tribhuwan","chaitanya.tribhuwan100@gmail.com");
			studentRepository.save(student1);
			
			Student student2 = new Student("Saurabh","Bhagwat","saurabh.bhagwat007@gmail.com");
			studentRepository.save(student2);
			
			Student student3 = new Student("Nikhil","Kulkarni","nikhil.kul001@gmail.com");
			studentRepository.save(student3);
			
			Student student4 = new Student("Sanket","Shilimkar","sanketshilimkar9@gmail.com");
			studentRepository.save(student4); */
	}

}
