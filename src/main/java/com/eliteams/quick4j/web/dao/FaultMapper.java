package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Fault;
import com.eliteams.quick4j.web.model.FaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaultMapper {
    int countByExample(FaultExample example);

    int deleteByExample(FaultExample example);

    int deleteByPrimaryKey(Long faultid);

    int insert(Fault record);

    int insertSelective(Fault record);

    List<Fault> selectByExample(FaultExample example);

    Fault selectByPrimaryKey(Long faultid);

    int updateByExampleSelective(@Param("record") Fault record, @Param("example") FaultExample example);

    int updateByExample(@Param("record") Fault record, @Param("example") FaultExample example);

    int updateByPrimaryKeySelective(Fault record);

    int updateByPrimaryKey(Fault record);
}