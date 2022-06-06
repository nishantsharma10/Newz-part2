package com.stackroute.newz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stackroute.newz.dao.NewsDAO;
import com.stackroute.newz.model.News;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {
		 
	@Autowired 
	private NewsDAO newsDao;
	
	public boolean addNews(News news) {
		newsDao.addNews(news);
		return true;
	}
	
	public boolean deleteNews(int newsId) {
		newsDao.deleteNews(newsId);
		return true;
	}
	public List<News> getAllNews() {
		
		return newsDao.getAllNews();
	}
	 
	public News getNewsById(int newsId) {
		// TODO Auto-generated method stub
		return newsDao.getNewsById(newsId);
	}
	
	public boolean updateNews(News news) {
		newsDao.updateNews(news);
		return true;
	}
	

}
