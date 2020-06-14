package com.xuqing.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xuqing
 * @description
 * @create 2020/04/08 23:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg) {
        this(code,msg,null);
    }
}
