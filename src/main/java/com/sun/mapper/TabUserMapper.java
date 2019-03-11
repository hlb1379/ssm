package com.sun.mapper;

import com.sun.pojo.TabUser;
import com.sun.pojo.TabUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabUserMapper {
    long countByExample(TabUserExample example);

    int deleteByExample(TabUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(TabUser record);

    int insertSelective(TabUser record);

    List<TabUser> selectByExample(TabUserExample example);

    TabUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") TabUser record, @Param("example") TabUserExample example);

    int updateByExample(@Param("record") TabUser record, @Param("example") TabUserExample example);

    int updateByPrimaryKeySelective(TabUser record);

    int updateByPrimaryKey(TabUser record);
}