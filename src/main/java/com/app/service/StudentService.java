package com.app.service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repository;

    @Autowired
    public void setStudentRepository(StudentRepository repository) {
        this.repository = repository;
    }

    public void save(Student student) {
        repository.save(student);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
}
