package dev.sophea.httpinterfacewebclient.exception.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(UserAPIException.class)
    public ResponseEntity<?> handleUserAPIException(HttpStatus status, UserAPIException userAPIException){

        Map<String, String> errorMap = new HashMap<>();

        errorMap.put("error message", userAPIException.getMessage());

        errorMap.put("status", status.toString());

        return ResponseEntity.ok(errorMap);
    }
}
