package com.example._2_global_exception_handler.service;

import com.example._2_global_exception_handler.exception.StudentNotFound;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    public String findStudent(){
        throw new StudentNotFound();
    }
}
