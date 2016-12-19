package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Corelation;
import com.eliteams.quick4j.web.model.CorelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CorelationMapper {
    int countByExample(CorelationExample example);

    int deleteByExample(CorelationExample example);

    int deleteByPrimaryKey(Long relId);

    int insert(Corelation record);

    int insertSelective(Corelation record);

    List<Corelation> selectByExample(CorelationExample example);

    Corelation selectByPrimaryKey(Long relId);

    int updateByExampleSelective(@Param("record") Corelation record, @Param("example") CorelationExample example);

    int updateByExample(@Param("record") Corelation record, @Param("example") CorelationExample example);

    int updateByPrimaryKeySelective(Corelation record);

    int updateByPrimaryKey(Corelation record);
}