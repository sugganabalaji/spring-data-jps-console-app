package com.app.repository;

import com.app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // JPQL
    // @Query("SELECT s FROM Student s WHERE s.sName = :name ") // way 1: namedParameter
    @Query("SELECT s FROM Student s WHERE s.sName = ?1") // way 2: positionalParameter
    List<Student> findByName(String name);
    // JPQL
    List<Student> findByMarks(int marks);
    // JPQL
    List<Student> findByMarksGreaterThanEqual(int marks);
}
