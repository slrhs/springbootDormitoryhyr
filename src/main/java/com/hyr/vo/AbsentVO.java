package com.hyr.vo;

import lombok.Data;

/**
 * @author h'y'r
 * #Description AbsentVO
 * #Date: 2022/10/8 22:46
 */
@Data
public class AbsentVO {
    private Integer id;
    private String buildingName;
    private String dormitoryName;
    private String studentName;
    private String dormitoryAdminName;
    private String createDate;
    private String reason;
}
