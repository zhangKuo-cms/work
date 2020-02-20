package com.lumengjun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lumengjun.entity.Article;

import com.lumengjun.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	ArticleService articleService;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param date1 开始时间
	 * @param date2 结束时间
	 * @param dtj  排序提交
	 * @param page 当前页
	 * @param model
	 * @return
	 */
	//主页面方法
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="")String date1,
			@RequestParam(defaultValue="")String date2,
			@RequestParam(defaultValue="")String dtj,
			@RequestParam(defaultValue="1")int page,
			Model model){
		//进行分页处理
		PageHelper.startPage(page, 10);
		//将查询条件放入方法中进行查询
		List<Article> list =articleService.getArticleList(date1,date2,dtj);
		//将查询结果放入pageinfo中
		PageInfo<Article> pageinfo =new PageInfo<Article>(list);
		//将pageinfo放入作用域中
		model.addAttribute("pageinfo", pageinfo);
		//将开始时间放入作用域中
		model.addAttribute("date1", date1);
		//将结束时间放入作用域中
		model.addAttribute("date2", date2);
		//将排序提交放入作用域中
		model.addAttribute("dtj", dtj);
		return "list";
	}
	
}
