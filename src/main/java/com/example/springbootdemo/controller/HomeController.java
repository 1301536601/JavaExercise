package com.example.springbootdemo.controller;

import com.example.springbootdemo.Service.IUserService;
import com.example.springbootdemo.model.Car;
import com.example.springbootdemo.model.LombokDemo;
import com.example.springbootdemo.model.SwaggerRequest;
import com.example.springbootdemo.config.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.http.MediaType;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
@Slf4j
@Api(tags = "Home接口")
public class HomeController {

    ImportDemo importDemo;
    Car car;
    Person person;
    IUserService userService;


    public HomeController(ImportDemo importDemo, Car car, Person person, IUserService userService) {
        this.importDemo = importDemo;
        this.car = car;
        this.person = person;
        this.userService = userService;
    }


    @ApiOperation(value = "测试接口",notes = "说你好")
    @GetMapping("sayHi")
    public String sayHi(){
        log.info("测试日志呀");
        System.out.println("你好呀");
        importDemo.getUser();
        return  "你好呀";
    }

    /*
    从配置文件中获取信息
     */
    @ApiOperation(value = "从配置中获取信息",notes = "从配置中获取信息")
    @GetMapping("getCar")
    public Car getCar(){

        return  car;
    }

    @ApiOperation(value = "从配置中获取信息1",notes = "从配置中获取信息1")
    @GetMapping("getPerson")
    public  Person getPerson(){
        return  person;
    }

    @ApiOperation(value = "swagger配置",notes = "swagger配置")
    @PostMapping("swaggerRequest")
    public String SwaggerRequest(@RequestBody SwaggerRequest request){
        return "当前是swagger请求";
    }

    @ApiOperation(value = "成功返回值",notes = "成功返回值")
    @PostMapping("getPersons")
    public ResponseResult<List<LombokDemo>> getPersons(){
        ArrayList<LombokDemo> result=new ArrayList<LombokDemo>();
        result.add(new LombokDemo("1",1));
        result.add(new LombokDemo("2",2));
        return Response.ExitWithResponseSuccessResult(result);
    }

    @ApiOperation(value = "错误返回值",notes = "错误返回值")
    @PostMapping("getErrorMsg")
    public ResponseResult<List<LombokDemo>> getErrorMsg(HttpServletResponse response){
        response.setContentType(MediaType.APPLICATION_XML_VALUE);
        return Response.ExitWithResponseErrorResult(-1,"请求错误");
    }

    /**
     *
     * @param page 当前页面
     * @param size 页面大小
     * @return
     */
    @ApiOperation(value = "分页获取值",notes = "分页获取值")
    @PostMapping("getPersonByPage")
    public  ResponseResult<PageResult<LombokDemo>> getPersonByPage(int page,int size){
        ArrayList<LombokDemo> result=new ArrayList<LombokDemo>();
        var qq=userService.getUser();
        System.out.println(qq);
        result.add(new LombokDemo("1",1));
        result.add(new LombokDemo("2",2));
        return  Response.ExitWithResponseSuccessResult(new PageResult(result.size(),size,page,result));

    }

    @ApiOperation(value = "Exception",notes = "异常返回")
    @PostMapping("getExceptionDemo")
    public ResponseResult<List<LombokDemo>> getExceptionDemo() throws Exception {
       throw new Exception("这是一个Exception异常");
    }

    @ApiOperation(value = "ValidationException",notes = "异常返回")
    @PostMapping("getValidationExceptionDemo")
    public ResponseResult<List<LombokDemo>> getValidationExceptionDemo() throws ValidationException {
        throw new ValidationException("这是一个ValidationException异常");
    }

    @ApiOperation(value = "MissingServletRequestParameterException",notes = "异常返回")
    @PostMapping("getMissingServletRequestParameterExceptionDemo")
    public ResponseResult<List<LombokDemo>> getMissingServletRequestParameterExceptionDemo() throws MissingServletRequestParameterException {
        throw new MissingServletRequestParameterException("name","name".getClass().toString());
    }

    @GetMapping("/getUserService")
    public ResponseResult<String> getUserService(){
        userService.printHi();
        return Response.ExitWithResponseSuccessResult();
    }

}
