package com.stackroute.newz.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/*
 * The class "News" will be acting as the data model for the news Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 */
public class News
{
	
	
	public News() {	
	}

	public News(int newsId, String name, String author, String description, String content, LocalDateTime publishedAt) {
		
	}

	public int getNewsId() {
		return 0;
	}

	public void setNewsId(int newzId) {
		
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {
		
	}

	public String getAuthor() {
		return null;
	}

	public void setAuthor(String author) {
		
	}

	public String getDescription() {
		return null;
	}

	public void setDescription(String description) {
		
	}

	public LocalDateTime getPublishedAt() {
		return null;
	}

	public void setPublishedAt(LocalDateTime publishedAt) {
		
	}

	public String getContent() {
		return null;
	}

	public void setContent(String content) {
		
	}

	
}
