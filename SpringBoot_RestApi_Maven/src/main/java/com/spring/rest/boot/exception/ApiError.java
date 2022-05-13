package com.spring.rest.boot.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
@Data
@AllArgsConstructor
public class ApiError {
    private HttpStatus status;
    private String message;
    private List<String> errors;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timestamp;
    public ApiError(HttpStatus status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ApiError(HttpStatus status, String message, String error,LocalDateTime timestamp) {
        super();
        this.status = status;
        this.message = message;
        errors = Arrays.asList(error);
        this.timestamp =timestamp;
    }

    public ApiError(HttpStatus status, String message, LocalDateTime now) {
        this.status = status;
        this.message = message;
        this.timestamp =now;
    }

    public ApiError() {

    }

    public ApiError(HttpStatus notFound, String localizedMessage, String error) {
        this.status = notFound;
        this.message = localizedMessage;
        this.message =error;
    }
}
