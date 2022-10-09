package com.hyr.service;

import com.hyr.entity.SystemAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hyr.form.RuleForm;
import com.hyr.vo.ResultVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-10-05
 */
public interface SystemAdminService extends IService<SystemAdmin> {
    public ResultVO login(RuleForm ruleForm);
}
