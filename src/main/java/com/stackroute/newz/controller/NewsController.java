package com.stackroute.newz.controller;

/*
 * Annotate the class with @Controller annotation. @Controller annotation is used to mark 
 * any POJO class as a controller so that Spring can recognize this class as a Controller
 */

public class NewsController {
	
	/*
	 * From the problem statement, we can understand that the application requires
	 * us to implement the following functionalities.
	 * 
	 * 1. display the list of existing news from the persistence data. Each news element
	 * should contain News Name, News Author, description, content and published date. 
	 * 2. Add a new news which should contain the News Name, News Author, description, content and 
	 * published date. 
	 * 3. Delete an existing news 
	 * 4. Update an existing news
	 * 
	 */

	/*
	 * Autowiring should be implemented for the NewsDAO.
	 * Create a News object.
	 * 
	 */
	
	
	
	/*
	 * Define a handler method to read the existing news from the database and add
	 * it to the ModelMap which is an implementation of Map, used when building
	 * model data for use with views. it should map to the default URL i.e. "/"
	 */
	

	/*
	 * Define a handler method which will read the News Name, News Author, description, 
	 * content from request parameters and save the news in news table in
	 * database. Please note that the publishedAt should always be auto populated with
	 * system time and should not be accepted from the user. Also, after saving the
	 * news, it should show the same along with existing news items. Hence, this handler
	 * method should redirect to the default URL i.e. "/".
	 */
	

	/*
	 * Define a handler method which will read the newsId from request parameters
	 * and remove an existing news by calling the deleteNews() method of the
	 * NewsRepository class.This handler method should map to the URL "/delete". Post 
	 * deletion, the handler method should be redirected to the default URL i.e. "/"
	 */
	

	
	/*
	 * Define a handler method which will update the existing news. This handler
	 * method should map to the URL "/update".
	 */
	


}