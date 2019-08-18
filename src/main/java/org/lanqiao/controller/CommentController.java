package org.lanqiao.controller;

import org.lanqiao.entity.Comment;
import org.lanqiao.entity.Page;
import org.lanqiao.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;
    @RequestMapping("/getComment")
    public List<Comment> selectByPrimaryKey(@RequestBody Page page){

        System.out.println(page.getPageToPoint());
        return  commentService.selectByPrimaryKey(page);
    }
}
