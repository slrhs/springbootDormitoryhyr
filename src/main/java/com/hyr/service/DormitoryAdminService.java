package com.hyr.service;

import com.hyr.entity.DormitoryAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hyr.form.RuleForm;
import com.hyr.form.SearchForm;
import com.hyr.vo.PageVO;
import com.hyr.vo.ResultVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-10-05
 */
public interface DormitoryAdminService extends IService<DormitoryAdmin> {
    public ResultVO login(RuleForm ruleForm);
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
}
