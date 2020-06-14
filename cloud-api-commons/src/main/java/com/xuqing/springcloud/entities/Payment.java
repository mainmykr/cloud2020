package com.xuqing.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xuqing
 * @description
 * @create 2020/04/08 1:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Integer id;
    private String serial;
}
