package com.stackroute.newz.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
@Repository
@Transactional
public class NewsDAOImpl implements NewsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

	/*
	 * Autowiring should be implemented for the SessionFactory.
	 */
	

	public NewsDAOImpl(SessionFactory sessionFactory) {
					
	}		
		
	/*
	 * Save the news in the database(news) table.
	 */
	public boolean addNews(News news) {
		 getSession().persist(news);
		return true;
	}

	/*
	 * retrieve all existing news sorted by created Date in descending
	 * order(showing latest news first)
	 */
	public List<News> getAllNews() {
		//@SuppressWarnings("deprecation")
		Criteria criteria=getSession().createCriteria(News.class);
		
        return (List<News>) criteria.list();
	}

	/*
	 * retrieve specific news from the database(news) table
	 */
	public News getNewsById(int newsId) {
		Criteria criteria = getSession().createCriteria(News.class);
        criteria.add(Restrictions.eq("newsId", newsId));
        return (News) criteria.uniqueResult();
	}

	public boolean updateNews(News news) {
		getSession().update(news);
		return true;
	}

	/*
	 * Remove the news from the database(news) table.
	 */
	@SuppressWarnings("deprecation")
	public boolean deleteNews(int newsId) {
		 Query query = getSession().createSQLQuery("delete from User where newsId = :newsId");
	        query.setInteger("newsId", newsId);
	        query.executeUpdate();
		return true;
	}
}