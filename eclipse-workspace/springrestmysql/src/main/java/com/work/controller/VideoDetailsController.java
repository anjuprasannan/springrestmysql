package com.work.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.dao.VideoDetailsRepository;
import com.work.entity.VideoDetails;

/**
 * 
 * @author Anju Prasannan
 *
 */
@RestController
public class VideoDetailsController {

	@Autowired
	VideoDetailsRepository videoDetailsRespository;

	/**
	 * Method to SELECT from the table
	 * 
	 * @return
	 */
	@GetMapping("/videodetails")
	public List<VideoDetails> index() {
		return videoDetailsRespository.findAll();
	}

	/**
	 * Method to SELECT BY ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/videodetails/{id}")
	public VideoDetails show(@PathVariable String id) {
		int videoId = Integer.parseInt(id);
		return videoDetailsRespository.findOne(videoId);
	}

	/**
	 * Method to INSERT record
	 * 
	 * @param body
	 * @return
	 */
	@PostMapping("/videodetails")
	public VideoDetails create(@RequestBody Map<String, String> body) {
		String title = body.get("title");
		String category = body.get("category");
		int rating = Integer.parseInt(body.get("rating"));
		return videoDetailsRespository.save(new VideoDetails(title, category, rating));
	}

	/**
	 * Method to UPDATE record
	 * 
	 * @param id
	 * @param body
	 * @return
	 */
	@PostMapping("/videodetails/{id}")
	public VideoDetails update(@PathVariable String id, @RequestBody Map<String, String> body) {
		int videoId = Integer.parseInt(id);
		VideoDetails video = videoDetailsRespository.findOne(videoId);
		video.setTitle(body.get("title"));
		video.setCategory(body.get("category"));
		video.setRating(Integer.parseInt(body.get("rating")));
		return videoDetailsRespository.save(video);
	}

	/**
	 * Method to DELETE record by ID
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("videodetails/{id}")
	public boolean delete(@PathVariable String id) {
		int videoId = Integer.parseInt(id);
		videoDetailsRespository.delete(videoId);
		return true;
	}

}
