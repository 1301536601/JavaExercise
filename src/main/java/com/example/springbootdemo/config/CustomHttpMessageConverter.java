package com.example.springbootdemo.config;

import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo.Model.CustomObject;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


@Component
public class CustomHttpMessageConverter extends AbstractHttpMessageConverter<Object> {

    public CustomHttpMessageConverter(){
        super(StandardCharsets.UTF_8, MediaType.ALL);
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return true;
    }

    @Override
    protected Object readInternal(Class<?> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return JSONObject.parseObject(StreamUtils.copyToString(httpInputMessage.getBody(),StandardCharsets.UTF_8));
    }

    @Override
    protected void writeInternal(Object o, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        CustomObject customObject=new CustomObject();
        customObject.setObject(o);
        customObject.setMessage("112312");
        httpOutputMessage.getBody().write(JSONObject.toJSONBytes(customObject));
    }
}
