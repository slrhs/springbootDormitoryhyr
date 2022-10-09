package com.hyr.form;

import lombok.Data;

/**
 * @author h'y'r
 * #Description SearchForm
 * #Date: 2022/10/6 18:54
 */
@Data
public class SearchForm {
    private String key;
    private String value;
    private Integer page;
    private Integer size;
}
