package org.lanqiao.service;

import org.lanqiao.entity.Comment;
import org.lanqiao.entity.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentService {
    public List<Comment> selectByPrimaryKey(Page page);
}
