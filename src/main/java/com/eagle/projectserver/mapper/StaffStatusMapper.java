package com.eagle.projectserver.mapper;

import java.util.List;

import com.eagle.projectserver.model.StaffStatus;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StaffStatusMapper {

    @Select( "select * from staffstatus")
    public List<StaffStatus> getAllStaffStatus();
    
}