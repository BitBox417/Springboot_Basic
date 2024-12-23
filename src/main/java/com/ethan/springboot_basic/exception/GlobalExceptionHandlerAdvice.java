package com.ethan.springboot_basic.exception;

import com.ethan.springboot_basic.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;




@RestControllerAdvice //專門用來統一處理
public class GlobalExceptionHandlerAdvice {

    Logger log= LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);

    @ExceptionHandler({Exception.class})
    public ResponseMessage<Object> handlerException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        log.error("統一異常: ", e);

        ResponseMessage<Object> responseMessage = new ResponseMessage<>();
        responseMessage.setCode(500);
        responseMessage.setMessage("error");
        responseMessage.setData(null);
        return responseMessage;
    }
}



