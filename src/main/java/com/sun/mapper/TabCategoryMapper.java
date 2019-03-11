package com.sun.mapper;

import com.sun.pojo.TabCategory;
import com.sun.pojo.TabCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabCategoryMapper {
    long countByExample(TabCategoryExample example);

    int deleteByExample(TabCategoryExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(TabCategory record);

    int insertSelective(TabCategory record);

    List<TabCategory> selectByExample(TabCategoryExample example);

    TabCategory selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") TabCategory record, @Param("example") TabCategoryExample example);

    int updateByExample(@Param("record") TabCategory record, @Param("example") TabCategoryExample example);

    int updateByPrimaryKeySelective(TabCategory record);

    int updateByPrimaryKey(TabCategory record);
}