package com.eagle.projectserver.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eagle.projectserver.mapper.ProjInfoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjInfoService {
    @Autowired
    private ProjInfoMapper projInfoMapper;
    /** 查询所有的公告 */
    public List<ProjInfo> findAll(){
       return projInfoMapper.findAll();
    }
    /** 分页查询公告 */
    public Map<String,Object> findByPage(Integer page, Integer rows){
       /** 创建Map集合封装响应数据 */
       Map<String,Object> data = new HashMap<>();
       /** 统计查询 */
       long count = projInfoMapper.count();
       data.put("total", count);
       /** 分页查询 */
       List<ProjInfo> projs = projInfoMapper.findByPage(page, rows);
       data.put("rows", projs);
       return data;
    }
}