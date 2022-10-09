package com.hyr.form;

import lombok.Data;

/**
 * @author h'y'r
 * #Description StudentForm
 * #Date: 2022/10/6 22:08
 */
@Data
public class StudentForm {
    private Integer id;
    private String number;
    private String name;
    private String gender;
    private Integer dormitoryId;
    private Integer oldDormitoryId;
    private String state;
    private String createDate;
}
