package com.example.springbootdemo.controller;

import com.example.springbootdemo.config.Person;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class ParameterController {

    /*
    @PathVariable 从路由中获取
     */
    @GetMapping("/car/{id}")
    public Map getCar(@PathVariable("id") Integer id){
        Map<Integer,Object> map=new HashMap<>();
        map.put(id,"当前用户的呀");
        return  map;
    }

    /*
    @RequestBody 从请求主体中获取参数
     */
    @RequestMapping("/save")
    public Map car(@RequestBody() Person person){
        Map<String,Object> map=new HashMap<>();
        map.put("person",person);
        return  map;
    }

    /*
    矩阵变量获取值
    默认禁用矩阵变量的值，需要手动开启UrlMatrixVariableHelper
    http://localhost:9000/car/sell;low=1;brand=niha
     */
    @GetMapping("/car/{path}")
    public String carSell(@MatrixVariable Integer low,
                          @MatrixVariable String brand){
         return "";
    }
}
