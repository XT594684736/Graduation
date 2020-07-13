package com.xiaofd.graduation.mapper;

import com.xiaofd.graduation.bean.Display;
import com.xiaofd.graduation.bean.DisplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisplayMapper {
    long countByExample(DisplayExample example);

    int deleteByExample(DisplayExample example);

    int insert(Display record);

    int insertSelective(Display record);

    List<Display> selectByExample(DisplayExample example);

    int updateByExampleSelective(@Param("record") Display record, @Param("example") DisplayExample example);

    int updateByExample(@Param("record") Display record, @Param("example") DisplayExample example);
}