package com.chikuo.service;

import com.chikuo.dto.ArticleCategoryDto;
import com.chikuo.dto.ArticleCommentDto;
import com.chikuo.entity.ArticleComment;
import com.chikuo.entity.Comment;

import java.util.List;

/**
 * 留言的Service
 */
public interface CommentService {
    void addComment(Comment comment);

    void addArticleComment(ArticleCommentDto articleCommentDto);

    void deleteCommentById(Long id);

    void deleteArticleCommentById(Long id);

    List<Comment> listAllComment();

    List<ArticleCommentDto> listAllArticleCommentById(Long id);
}
