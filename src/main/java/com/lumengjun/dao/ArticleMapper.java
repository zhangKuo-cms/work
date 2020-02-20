package com.lumengjun.dao;

import java.util.List;










import org.apache.ibatis.annotations.Param;

import com.lumengjun.entity.Article;


public interface ArticleMapper {

	
	
	

	List<Article> getArticleList(@Param("date1")String date1,@Param("date2") String date2,@Param("dtj") String dtj);

}
