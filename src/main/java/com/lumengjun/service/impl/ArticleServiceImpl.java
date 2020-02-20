package com.lumengjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lumengjun.dao.ArticleMapper;
import com.lumengjun.entity.Article;
import com.lumengjun.entity.Tj;
import com.lumengjun.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleMapper articleMapper;

	

	@Override
	public List<Article> getArticleList(String date1, String date2, String dtj) {
		// TODO Auto-generated method stub
		return articleMapper.getArticleList(date1,date2,dtj);
	}
	
}
