package com.lumengjun.service;

import java.util.List;

import com.lumengjun.entity.Article;
import com.lumengjun.entity.Tj;

public interface ArticleService {

	

	List<Article> getArticleList(String date1, String date2, String dtj);

}
