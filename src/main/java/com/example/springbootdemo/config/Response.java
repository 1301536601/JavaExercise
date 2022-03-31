package com.example.springbootdemo.config;

public class Response<T> {

    private final static String SUCCESS = "success";

    private final static String FAIL = "fail";

    private final static  int SuccessStatus=0;

    private final static  int FailStatus=1;

    /*
    使用默认的msg进行返回结果结果
     */
    public static <T> ResponseResult<T> ExitWithResponseSuccessResult() {
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS).setMsg(SUCCESS).setStatus(SuccessStatus);
    }

    /*
    使用自定义的消息进行返回结果
     */
    public static <T> ResponseResult<T> ExitWithResponseSuccessResult(String msg) {
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS).setMsg(msg).setStatus(SuccessStatus);
    }

    /*
    带返回结果
     */
    public static <T> ResponseResult<T> ExitWithResponseSuccessResult(T data) {
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS).setMsg(SUCCESS).setData(data).setStatus(SuccessStatus);
    }

    /*
    带有自定义msg的返回结果
     */
    public static <T> ResponseResult<T> ExitWithResponseErrorResult(String message) {
        return new ResponseResult<T>().setCode(ResultCode.INTERNAL_SERVER_ERROR).setMsg(message).setStatus(FailStatus);
    }

    /*
    带有自定义code码和自定义msg的错误返回结果
     */
    public static <T> ResponseResult<T> ExitWithResponseErrorResult(int code, String msg) {
        return new ResponseResult<T>().setCode(code).setMsg(msg).setStatus(FailStatus);
    }

    /*
    带有自定义code码、自定义msg和自定义data的返回结果
     */
    public static <T> ResponseResult<T> ExitWithResponseErrorResult(int code, String msg, T data) {
        return new ResponseResult<T>().setCode(code).setMsg(msg).setData(data).setStatus(FailStatus);
    }

}
