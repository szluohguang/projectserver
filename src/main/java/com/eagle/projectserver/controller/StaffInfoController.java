package com.eagle.projectserver.controller;

import java.util.List;

import com.eagle.projectserver.model.StaffInfo;
import com.eagle.projectserver.model.StaffInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffInfoController {
    @Autowired
    private StaffInfoService projInfoService;
    /** 查询全部公告 
    @GetMapping("/findall")
    @ResponseBody*/
    @RequestMapping("/staffinfo")
    public List<StaffInfo> staffInfo(){
       return projInfoService.staffInfo();
    }
    /** 跳转分页查询公告页面 */
    @RequestMapping("/showstaff")
    public String show(){
       return "显示数据";
    }
    
}