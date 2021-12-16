package com.bae.films.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.films.domain.Film;

public interface FilmRepo extends JpaRepository<Film, Integer> {
	List<Film> findByTitle(String title);

	List<Film> findByRating(Integer rating);

	List<Film> findByYearOfRelease(Integer yearOfRelease);

	List<Film> findByLengthOfFilm(Integer lengthOfFilm);
}
