package pro.sky.calculator.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pro.sky.calculator.exception.AppError;
import pro.sky.calculator.exception.ArgumentNotFoundException;
import pro.sky.calculator.exception.Arithmetic;

@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler (ArgumentNotFoundException.class)
    public ResponseEntity<AppError> handleArgumentNotFoundException
            (ArgumentNotFoundException exception, WebRequest webRequest) {
        AppError error = new AppError();
        error.setCode(101);
        error.setMessage(exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler (Arithmetic.class)
    public ResponseEntity<AppError> handleArithmetic
            (Arithmetic exception, WebRequest webRequest) {
        AppError error = new AppError();
        error.setCode(102);
        error.setMessage(exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
