package com.hyr.vo;

import lombok.Data;

/**
 * @author h'y'r
 * #Description StudentVO
 * #Date: 2022/10/6 21:17
 */
@Data
public class StudentVO {
    private Integer id;
    private String number;
    private String name;
    private String gender;
    private String dormitoryName;
    private String state;
    private String createDate;
}
