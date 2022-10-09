package com.hyr.service;

import com.hyr.entity.Dormitory;
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
public interface DormitoryService extends IService<Dormitory> {
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
    public Boolean deleteById(Integer id);
}
