package com.chikuo.service;

import com.chikuo.dto.ArticleCategoryDto;
import com.chikuo.entity.ArticleCategory;
import com.chikuo.entity.CategoryInfo;

import java.util.List;

/**
 * 分类Service
 */
public interface CategoryService {
    void addCategory(CategoryInfo categoryInfo);

    void deleteCategoryById(Long id);

    void updateCategory(CategoryInfo categoryInfo);

    void updateArticleCategory(ArticleCategory articleCategory);

    CategoryInfo getOneById(Long id);

    List<CategoryInfo> listAllCategory();

    ArticleCategoryDto getCategoryByArticleId(Long id);
}
