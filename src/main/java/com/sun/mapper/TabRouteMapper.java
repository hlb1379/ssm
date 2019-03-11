package com.sun.mapper;

import com.sun.pojo.TabRoute;
import com.sun.pojo.TabRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabRouteMapper {
    long countByExample(TabRouteExample example);

    int deleteByExample(TabRouteExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(TabRoute record);

    int insertSelective(TabRoute record);

    List<TabRoute> selectByExample(TabRouteExample example);

    TabRoute selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") TabRoute record, @Param("example") TabRouteExample example);

    int updateByExample(@Param("record") TabRoute record, @Param("example") TabRouteExample example);

    int updateByPrimaryKeySelective(TabRoute record);

    int updateByPrimaryKey(TabRoute record);
}