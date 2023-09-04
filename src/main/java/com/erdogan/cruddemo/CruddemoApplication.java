package com.erdogan.cruddemo;

import com.erdogan.cruddemo.dao.StudentDAO;
import com.erdogan.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
	 return runner -> {
		 // createStudent(studentDAO);
		 createMultipleStudents(studentDAO);
	 };
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple student

		System.out.println("Creating new student object.");
		Student tempStudent1 = new Student ( "DOGAN", "AKPOLAT", "dogan98@gmail.com");
		Student tempStudent2 = new Student ( "VEYSEL", "AKPOLAT", "veysel98@gmail.com");
		Student tempStudent3 = new Student ( "MERYEM ", "AKPOLAT", "meryem98@gmail.com");

		// save the student objects

		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object

		System.out.println("Creating new student object.");
		Student tempStudent = new Student ( "Erdogan", "AKPOLAT", "erdoganakpolat98@gmail.com");

		// save the student object
		System.out.println("Saving the student.");
		studentDAO.save(tempStudent);


		// display id of the saved student
		System.out.println("Saved student . Generated id: " + tempStudent.getId());
	}
}



