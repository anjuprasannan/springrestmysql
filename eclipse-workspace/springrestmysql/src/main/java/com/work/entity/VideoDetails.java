package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Anju Prasannan
 *
 */
@Entity
@Table(name = "video_details")
public class VideoDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "video_id")
	private int video_id;
	@Column(name = "title")
	private String title;
	@Column(name = "category")
	private String category;
	@Column(name = "rating")
	private int rating;

	public VideoDetails() {

	}

	public VideoDetails(String title, String category, int rating) {
		this.title = title;
		this.category = category;
		this.rating = rating;
	}

	public VideoDetails(int video_id, String title, String category, int rating) {
		this.video_id = video_id;
		this.title = title;
		this.category = category;
		this.rating = rating;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VideoDetails [video_id=" + video_id + ", title=" + title + ", category=" + category + ", rating="
				+ rating + "]";
	}

	/**
	 * @return the video_id
	 */
	public int getVideo_id() {
		return video_id;
	}

	/**
	 * @param video_id
	 *            the video_id to set
	 */
	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

}
