package com.sun.mapper;

import com.sun.pojo.TabRouteImg;
import com.sun.pojo.TabRouteImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabRouteImgMapper {
    long countByExample(TabRouteImgExample example);

    int deleteByExample(TabRouteImgExample example);

    int deleteByPrimaryKey(Integer rgid);

    int insert(TabRouteImg record);

    int insertSelective(TabRouteImg record);

    List<TabRouteImg> selectByExample(TabRouteImgExample example);

    TabRouteImg selectByPrimaryKey(Integer rgid);

    int updateByExampleSelective(@Param("record") TabRouteImg record, @Param("example") TabRouteImgExample example);

    int updateByExample(@Param("record") TabRouteImg record, @Param("example") TabRouteImgExample example);

    int updateByPrimaryKeySelective(TabRouteImg record);

    int updateByPrimaryKey(TabRouteImg record);
}