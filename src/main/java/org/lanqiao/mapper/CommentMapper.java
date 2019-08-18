package org.lanqiao.mapper;

import org.lanqiao.entity.Comment;
import org.lanqiao.entity.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByPrimaryKey(Page page);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}