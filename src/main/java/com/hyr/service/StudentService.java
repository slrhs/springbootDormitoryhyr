package com.hyr.service;

import com.hyr.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hyr.form.SearchForm;
import com.hyr.form.StudentForm;
import com.hyr.vo.PageVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-10-05
 */
public interface StudentService extends IService<Student> {
    public Boolean saveStudent(Student student);
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
    public Boolean update(StudentForm studentForm);
    public Boolean deleteById(Integer id);
}
