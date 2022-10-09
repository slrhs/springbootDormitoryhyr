package com.hyr.mapper;

import com.hyr.entity.Dormitory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2022-10-05
 */
@Repository
public interface DormitoryMapper extends BaseMapper<Dormitory> {
    public void addAvailable(Integer id);
    public void subAvailable(Integer id);
    public Integer findAvailableDormitoryId();
}
