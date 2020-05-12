package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MovieTO;
import com.example.demo.service.MovieInfoService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DemoController {
	@Autowired
	private MovieInfoService objMovieInfoService;
	
	@RequestMapping("/springBoot")
	public String returnMessage() {
		return "Hello SpringBoot";
	}
	
	@PostMapping
	@RequestMapping("/addMovieInfo")
	public void addMovieInfo(@RequestBody MovieTO movieTO) {
		objMovieInfoService.addMovieDetail(movieTO);
	}
	
	@GetMapping
	@RequestMapping("/getMovieInfo")
	public List<MovieTO> getMovieInfo() {
		return objMovieInfoService.getMovieList();
	}
}