package org.lanqiao.service;

import org.lanqiao.entity.Comment;
import org.lanqiao.entity.Page;
import org.lanqiao.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentMapper commentMapper;
    public List<Comment> selectByPrimaryKey(Page page){

        return  commentMapper.selectByPrimaryKey(page);
    }
}
