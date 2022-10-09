package com.hyr.vo;

import lombok.Data;

/**
 * @author h'y'r
 * #Description DormitoryVO
 * #Date: 2022/10/8 20:39
 */
@Data
public class DormitoryVO {
    private Integer id;
    private String buildingName;
    private String name;
    private Integer type;
    private Integer available;
    private String telephone;
}
