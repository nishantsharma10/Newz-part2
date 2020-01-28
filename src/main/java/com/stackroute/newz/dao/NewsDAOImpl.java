package com.stackroute.newz.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.stackroute.newz.model.News;


/*
 * This class is implementing the NewsDAO interface. This class has to be annotated with @Repository
 * annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, thus 
 * 				 clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */
public class NewsDAOImpl implements NewsDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.
	 */
	

	public NewsDAOImpl(SessionFactory sessionFactory) {
	
	}

	/*
	 * Save the news in the database(news) table.
	 */
	public boolean addNews(News news) {
		return false;
	}

	/*
	 * retrieve all existing news sorted by created Date in descending
	 * order(showing latest news first)
	 */
	public List<News> getAllNews() {
		return null;
	}

	/*
	 * retrieve specific news from the database(news) table
	 */
	public News getNewsById(int newsId) {
		return null;
	}

	public boolean updateNews(News news) {
		return false;
	}

	/*
	 * Remove the news from the database(news) table.
	 */
	public boolean deleteNews(int newsId) {
		return false;
	}
}