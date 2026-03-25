package com.example._2_global_exception_handler.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExcepitonHandler {

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<ApiError> handleStudentNotFound(StudentNotFound ex,HttpServletRequest req){
        ApiError apiError = new ApiError(
            ex.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                req.getRequestURI(),
                LocalDateTime.now()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
    }


}
