package com.example._2_global_exception_handler.exception;

public class StudentNotFound extends RuntimeException {
    public StudentNotFound(){
        super("Öğrenci bulunamadı yaa!");
    }
}
