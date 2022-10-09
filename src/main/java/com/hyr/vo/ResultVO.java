package com.hyr.vo;

import lombok.Data;

/**
 * @author h'y'r
 * #Description ResultVO
 * #Date: 2022/10/5 16:00
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private T data;
}
