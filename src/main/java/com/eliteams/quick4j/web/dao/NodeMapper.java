package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Node;
import com.eliteams.quick4j.web.model.NodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeMapper {
    int countByExample(NodeExample example);

    int deleteByExample(NodeExample example);

    int deleteByPrimaryKey(Long nodeid);

    int insert(Node record);

    int insertSelective(Node record);

    List<Node> selectByExample(NodeExample example);

    Node selectByPrimaryKey(Long nodeid);

    int updateByExampleSelective(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByExample(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}