package com.example._2_global_exception_handler.controller;

import com.example._2_global_exception_handler.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final StudentService studentService;

    @GetMapping("/find")
    public ResponseEntity<?> find(){
        return  ResponseEntity.ok(studentService.findStudent());
    }

}
