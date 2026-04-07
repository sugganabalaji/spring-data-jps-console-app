package com.app;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaConsoleAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaConsoleAppApplication.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);

		Student s1 = context.getBean(Student.class);
		s1.setSName("Balaji");
		s1.setMarks(78);

		Student s2 = context.getBean(Student.class);
		s2.setSName("Rudvik");
		s2.setMarks(98);

		Student s3 = context.getBean(Student.class);
		s3.setSName("Vasundhara");
		s3.setMarks(80);

		// save the student

		// repository.save(s1);
		// repository.save(s2);
		// repository.save(s3);

		// fetch all students
		// repository.findAll().forEach(System.out::println);

		// fetch student by id
		Optional<Student> studentOptional = repository.findById(1);
        studentOptional.ifPresent(System.out::println);




	}

}
