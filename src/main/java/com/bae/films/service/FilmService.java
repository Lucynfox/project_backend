package com.bae.films.service;

import java.util.List;

import com.bae.films.domain.Film;

public interface FilmService {
	Film createFilm(Film film);

	List<Film> getAllFilms();

	Film getFilm(Integer id);

	Film replaceFilm(Integer id, Film newFilm);

	void removeFilm(Integer id);

}
