package com.bae.films.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(unique = true)
	private String title;

	@Column(nullable = false)
	private Integer rating;

	@Column(nullable = false)
	private Integer yearOfRelease;

	@Column(nullable = true)
	private String image;

	@Column(nullable = false)
	private Integer lengthOfFilm;

	public Film() {
		super();
	}

	public Film(Integer id, String title, Integer rating, Integer yearOfRelease, String image, Integer lengthOfFilm) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.yearOfRelease = yearOfRelease;
		this.image = image;
		this.lengthOfFilm = lengthOfFilm;
	}

	public Film(String title, Integer rating, Integer yearOfRelease, String image, Integer lengthOfFilm) {
		super();
		this.title = title;
		this.rating = rating;
		this.yearOfRelease = yearOfRelease;
		this.image = image;
		this.lengthOfFilm = lengthOfFilm;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(Integer yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getLengthOfFilm() {
		return lengthOfFilm;
	}

	public void setLengthOfFilm(Integer lengthOfFilm) {
		this.lengthOfFilm = lengthOfFilm;
	}

	@Override
	public String toString() {
		return "Film [title=" + title + ", rating=" + rating + ", yearOfRelease=" + yearOfRelease + ", image=" + image
				+ ", lengthOfFilm=" + lengthOfFilm + "]";
	}

}
