package com.hyr.service;

import com.hyr.entity.Absent;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hyr.form.SearchForm;
import com.hyr.vo.PageVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-10-05
 */
public interface AbsentService extends IService<Absent> {
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
}
