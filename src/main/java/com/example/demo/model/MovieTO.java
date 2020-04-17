package com.example.demo.model;

import java.util.UUID;

public class MovieTO {
	private int movieId;
	private String name;
    private int releaseDate;
	private String genre;
	private int rating;
    private String review;
    
	public MovieTO(int movieId, String name, int releaseDate, String genre, int rating, String review) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.rating = rating;
		this.review = review;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
}