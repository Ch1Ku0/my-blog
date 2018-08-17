package com.chikuo.dao;

import com.chikuo.entity.ArticlePicture;
import com.chikuo.entity.ArticlePictureExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ArticlePictureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticlePicture record);

    int insertSelective(ArticlePicture record);

    List<ArticlePicture> selectByExample(ArticlePictureExample example);

    ArticlePicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticlePicture record);

    int updateByPrimaryKey(ArticlePicture record);
}