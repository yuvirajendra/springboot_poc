package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MovieInfoDao;
import com.example.demo.model.MovieTO;

@Service
public class MovieInfoService {
	private MovieInfoDao objMovieInfoDao;
	
	@Autowired
	MovieInfoService(@Qualifier("arrayListImpl")MovieInfoDao objMovieInfoDao) {
		this.objMovieInfoDao = objMovieInfoDao;
	} 
	
	public int addMovieDetail(MovieTO movieTO) {
		return objMovieInfoDao.addNewMovie(movieTO);
	}
	
	public List<MovieTO> getMovieList() {
		return objMovieInfoDao.retrieveMovieList();
	}
}