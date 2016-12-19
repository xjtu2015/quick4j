package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.NodeMapper;
import com.eliteams.quick4j.web.model.Node;
import com.eliteams.quick4j.web.service.NodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */
@Service
public class NodeServiceImpl extends GenericServiceImpl<Node,Long> implements NodeService  {
@Resource
private NodeMapper nodeMapper;


    @Override
    public GenericDao<Node, Long> getDao() {
        return null;
    }

    @Override
    public int insert(Node node) {

        int a= nodeMapper.insert(node);
        System.out.print(a);
        return a;
    }

    @Override
    public int update(Node node) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public Node selectById(Long id) {
        return null;
    }

    @Override
    public Node selectOne() {
        return null;
    }

    @Override
    public List<Node> selectList() {
        return null;
    }
}
