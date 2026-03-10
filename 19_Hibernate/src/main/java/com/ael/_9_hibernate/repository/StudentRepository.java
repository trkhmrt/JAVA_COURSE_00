package com.ael._9_hibernate.repository;

import com.ael._9_hibernate.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
