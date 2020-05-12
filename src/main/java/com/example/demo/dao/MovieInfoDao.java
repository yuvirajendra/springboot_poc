package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.MovieTO;

public interface MovieInfoDao {
	int addNewMovie(MovieTO movieTO);
	List<MovieTO> retrieveMovieList();
	//default int addNewMovie()
}