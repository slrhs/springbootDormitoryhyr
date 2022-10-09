package com.hyr.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hyr.entity.Absent;
import com.hyr.entity.Dormitory;
import com.hyr.entity.Student;
import com.hyr.form.SearchForm;
import com.hyr.service.AbsentService;
import com.hyr.service.BuildingService;
import com.hyr.service.DormitoryService;
import com.hyr.service.StudentService;
import com.hyr.util.ResultVOUtil;
import com.hyr.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2022-10-05
 */
@RestController
@RequestMapping("/absent")
public class AbsentController {
    @Autowired
    private AbsentService absentService;
    @Autowired
    private BuildingService buildingService;
    @Autowired
    private DormitoryService dormitoryService;
    @Autowired
    private StudentService studentService;

    @GetMapping("/list/{page}/{size}")
    public ResultVO list(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        return ResultVOUtil.success(this.absentService.list(page, size));
    }

    @GetMapping("/search")
    public ResultVO search(SearchForm searchForm){
        return ResultVOUtil.success(this.absentService.search(searchForm));
    }

    @GetMapping("/buildingList")
    public ResultVO buildingList(){
        return ResultVOUtil.success(this.buildingService.list());
    }

    @GetMapping("/findDormitoryByBuildingId/{id}")
    public ResultVO findDormitoryByBuildingId(@PathVariable("id") Integer id){
        QueryWrapper<Dormitory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("building_id", id);
        List<Dormitory> dormitoryList = this.dormitoryService.list(queryWrapper);
        return ResultVOUtil.success(dormitoryList);
    }

    @GetMapping("/findStudentByDormitoryId/{id}")
    public ResultVO findStudentByDormitoryId(@PathVariable("id") Integer id){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("dormitory_id", id);
        List<Student> studentList = this.studentService.list(queryWrapper);
        return ResultVOUtil.success(studentList);
    }

    @PostMapping("/save")
    public ResultVO save(@RequestBody Absent absent){
        String createDate = absent.getCreateDate();
        createDate = createDate.substring(0, 10);
        absent.setCreateDate(createDate);
        boolean save = this.absentService.save(absent);
        if(!save) return ResultVOUtil.fail();
        return ResultVOUtil.success(null);
    }
}

