package com.example.springbootdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.ValidationException;

/**
 * ControllerAdvice 表明GlobalExceptionAdvice是一个异常的处理类，具体的处理方法通过
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {

    /**
     * 全局异常问题
     * @param httpServletRequest
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public  ResponseResult handleHttpException(HttpServletRequest httpServletRequest,Exception ex){
        log.info("this is handleHttpException");
        return Response.ExitWithResponseErrorResult(-9999,ex.getMessage());
    }

    /**
     * 校验参数问题
     * @param ex
     * @return
     */
    @ExceptionHandler(ValidationException.class)
    public ResponseResult handleValidationException(ValidationException ex) {
        log.info("this is handleValidationException");
        return Response.ExitWithResponseErrorResult(-9999,ex.getMessage());
    }

    /**
     * Controller参数绑定错误
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseResult handleMissingServletRequestParameterException(MissingServletRequestParameterException ex) {
        log.info("this is handleMissingServletRequestParameterException");
        return Response.ExitWithResponseErrorResult(-9999,ex.getMessage());
    }

    /**
     * 处理方法不支持异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public ResponseResult handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException ex) {
        log.info("this is handleHttpRequestMethodNotSupportedException");
        return Response.ExitWithResponseErrorResult(-9999,"Http方法不支持");
    }
}
