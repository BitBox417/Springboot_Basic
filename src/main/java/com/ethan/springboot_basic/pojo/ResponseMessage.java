package com.ethan.springboot_basic.pojo;

import org.springframework.http.HttpStatus;

public class ResponseMessage<T> {
    private String message;  //請求成功
    private Integer code;  // 200 500 404
    private T data;

    public static <T> ResponseMessage<T> success(T data) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(HttpStatus.OK.value());  //200
        responseMessage.setMessage("success");
        responseMessage.setData(data);
        return responseMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
