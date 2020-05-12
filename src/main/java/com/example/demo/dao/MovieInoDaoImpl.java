package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.MovieTO;

@Repository("arrayListImpl")
public class MovieInoDaoImpl implements MovieInfoDao {
	private static List<MovieTO> objMovieTOList = new ArrayList<MovieTO>(); 
	
	@Override
	public int addNewMovie(MovieTO movieTO) {
		objMovieTOList.add(movieTO);
		return objMovieTOList.size();
	}

	@Override
	public List<MovieTO> retrieveMovieList() {
		return objMovieTOList;
	}
}