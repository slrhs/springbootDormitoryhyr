package com.hyr.vo;

import lombok.Data;

/**
 * @author h'y'r
 * #Description MoveoutVO
 * #Date: 2022/10/8 21:34
 */
@Data
public class MoveoutVO {
    private Integer id;
    private String studentName;
    private String dormitoryName;
    private String reason;
    private String createDate;
}
