package com.test.bo;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Response<T> {
    private int status;
    private String message;
    private T data;

    public static <T> Response<T> successResponse(T t){
        Response r = new Response<T>();
        r.status = HttpStatus.OK.value();
        r.message = HttpStatus.OK.getReasonPhrase();
        r.data = t;
        return r;
    }

    public static <T> Response<T> emptyResponse(){
        Response r = new Response<T>();
        r.status = HttpStatus.OK.value();
        return r;
    }
}
