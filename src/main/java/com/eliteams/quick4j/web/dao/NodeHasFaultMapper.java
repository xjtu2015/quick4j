package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.NodeHasFaultExample;
import com.eliteams.quick4j.web.model.NodeHasFaultKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeHasFaultMapper {
    int countByExample(NodeHasFaultExample example);

    int deleteByExample(NodeHasFaultExample example);

    int deleteByPrimaryKey(NodeHasFaultKey key);

    int insert(NodeHasFaultKey record);

    int insertSelective(NodeHasFaultKey record);

    List<NodeHasFaultKey> selectByExample(NodeHasFaultExample example);

    int updateByExampleSelective(@Param("record") NodeHasFaultKey record, @Param("example") NodeHasFaultExample example);

    int updateByExample(@Param("record") NodeHasFaultKey record, @Param("example") NodeHasFaultExample example);
}