package com.app;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaConsoleAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaConsoleAppApplication.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);

		Student s1 = context.getBean(Student.class);
		s1.setSId(1);
		s1.setSName("Balaji");
		s1.setMarks(60);// earlier 50

		Student s2 = context.getBean(Student.class);
		s2.setSId(2);
		s2.setSName("Rudvik");
		s2.setMarks(70);

		Student s3 = context.getBean(Student.class);
		s3.setSId(3);
		s3.setSName("Vasundhara");
		s3.setMarks(80);

		// save the student

		// repository.save(s1);
		// repository.save(s2);
		// repository.save(s3);

		// fetch all students
		// repository.findAll().forEach(System.out::println);

		// fetch student by id
		// Optional<Student> studentOptional = repository.findById(1);
        // studentOptional.ifPresent(System.out::println);

		// JPQL custom query
		// List<Student> students = repository.findByName("Balaji");
		// students.forEach(System.out::println);

		// JPQL  In built query
		// repository.findByMarks(75).forEach(System.out::println);
		// repository.findByMarksGreaterThanEqual(80).forEach(System.out::println);

		// save() is used to update the student (s1)
		Student updated = repository.save(s1);
		System.out.println(updated);

		repository.delete(s3);


	}

}
