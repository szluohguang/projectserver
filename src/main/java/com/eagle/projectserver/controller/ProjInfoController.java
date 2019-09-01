package com.eagle.projectserver.controller;

import java.util.List;
import java.util.Map;

import com.eagle.projectserver.model.ProjInfo;
import com.eagle.projectserver.model.ProjInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjInfoController {
    @Autowired
    private ProjInfoService projInfoService;
    /** 查询全部公告 
    @GetMapping("/findall")
    @ResponseBody*/
    @RequestMapping("/findall")
    public List<ProjInfo> findAll(){
       return projInfoService.findAll();
    }
    /** 跳转分页查询公告页面 */
    @RequestMapping("/show")
    public String show(){
       return "显示数据";
    }
    /** 分页查询公告 */
    @PostMapping("/findByPage")
    @ResponseBody
    public Map<String,Object> findByPage(@RequestParam(value="page",
                         defaultValue="1",required=false)Integer page,
                         @RequestParam(value="rows",
                         defaultValue="15",required=false)Integer rows){
       return projInfoService.findByPage((page - 1) * rows, rows);
    }
}