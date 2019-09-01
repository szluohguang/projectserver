package com.eagle.projectserver.mapper;

import java.util.List;

import com.eagle.projectserver.model.StaffInfo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StaffInfoMapper {

    /** 查询所有员工信息 */
    @Select("select * from staffinfo")
    public List<StaffInfo> staffInfo();

    /* 根据um查信息 */
    @Select("SELECT * FROM staffinfo WHERE um = #{um}")
    StaffInfo findByum( String um);
}