package com.eagle.projectserver.mapper;

import java.util.List;

import com.eagle.projectserver.model.ProjInfo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProjInfoMapper {
    /** 查询所有公告 */
    @Select("select * from projectinfo")
    public List<ProjInfo> findAll();
   
    /** 统计查询 */
    public Long count();
    /** 分页查询公告 */
    public List<ProjInfo> findByPage(@Param("page")Integer page, @Param("rows")Integer rows);


    @Insert("INSERT INTO city (name, state, country) VALUES(#{name}, #{state}, #{country})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(ProjInfo projinfo);
  
    @Select("SELECT id, name, state, country FROM city WHERE id = #{id}")
    ProjInfo findById(long id);
    
}