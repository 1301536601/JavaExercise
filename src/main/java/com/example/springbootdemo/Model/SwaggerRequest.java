package com.example.springbootdemo.Model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SwaggerRequest {

    @ApiModelProperty(value = "ID")
    private int id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "日期")
    private String date;

}
