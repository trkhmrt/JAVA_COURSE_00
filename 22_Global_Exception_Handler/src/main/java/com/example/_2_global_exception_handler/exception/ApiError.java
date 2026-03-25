package com.example._2_global_exception_handler.exception;

import lombok.Data;

import java.time.LocalDateTime;

public record ApiError(
        String message,
        int status,
        String path,
        LocalDateTime timestamp
)
{ }
