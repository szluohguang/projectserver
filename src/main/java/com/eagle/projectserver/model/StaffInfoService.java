package com.eagle.projectserver.model;

import java.util.List;

import com.eagle.projectserver.mapper.StaffInfoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StaffInfoService {

    @Autowired
    private StaffInfoMapper staffInfoMapper;
    /** 查询所有的公告 */
    public List<StaffInfo> staffInfo(){
       return staffInfoMapper.staffInfo();
    }

}