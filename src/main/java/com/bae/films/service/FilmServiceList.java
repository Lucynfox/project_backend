package com.bae.films.service;

import java.util.ArrayList;
import java.util.List;

import com.bae.films.domain.Film;

public class FilmServiceList implements FilmService {

	private List<Film> films = new ArrayList<>();

	@Override
	public Film createFilm(Film film) {
		this.films.add(film);
		Film created = this.films.get(this.films.size() - 1);
		return created;
	}

	@Override
	public List<Film> getAllFilms() {
		return this.films;
	}

	@Override
	public Film getFilm(Integer id) {
		return this.films.get(id);
	}

//	@Override
//	public List<Films> getAllFilmsByType(String type) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Film replaceFilm(Integer id, Film newFilm) {
		Film found = this.films.set(id, newFilm);

		return found;
	}

	@Override
	public void removeFilm(Integer id) {
		this.films.remove(id.intValue());
	}
}
