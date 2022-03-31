package com.example.springbootdemo.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {

    private Integer totalCount;

    private  Integer CurrentIndex;

    private Integer CurrentPage;

    private List<T> result;

}
