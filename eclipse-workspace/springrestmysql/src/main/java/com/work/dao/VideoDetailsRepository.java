package com.work.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.entity.VideoDetails;

/**
 * 
 * @author Anju Prasannan
 *
 */
@Repository
public interface VideoDetailsRepository extends JpaRepository<VideoDetails, Integer> {

	/**
	 * Method to find video by title
	 * @param text
	 * @return
	 */
	// custom query to search video by title
	List<VideoDetails> findByTitle(String text);

}