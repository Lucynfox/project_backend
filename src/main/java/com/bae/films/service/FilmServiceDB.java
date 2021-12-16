package com.bae.films.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.films.domain.Film;
import com.bae.films.repo.FilmRepo;

@Service
public class FilmServiceDB implements FilmService {
	private FilmRepo repo;

	@Autowired
	public FilmServiceDB(FilmRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Film createFilm(Film film) {
		Film created = this.repo.save(film); // INSERT INTO film...
		return created;
	}

	@Override
	public List<Film> getAllFilms() {
		return this.repo.findAll(); // SELECT * FROM film...
	}

	@Override
	public Film getFilm(Integer id) {
		Optional<Film> found = this.repo.findById(id); // SELECT * FROM Film WHERE ID=
		return found.get();
	}

//	@Override
//	public List<Film> getAllFilmsByType(String type) {
//		List<Film> found = this.repo.findByTypeIgnoreCase(type);
//		return found;
//	}

	@Override
	public Film replaceFilm(Integer id, Film newFilm) {
		Film existing = this.repo.findById(id).get();

		existing.setTitle(newFilm.getTitle());
		existing.setRating(newFilm.getRating());
		existing.setYearOfRelease(newFilm.getYearOfRelease());
		existing.setLengthOfFilm(newFilm.getLengthOfFilm());

		Film updated = this.repo.save(existing);
		return updated;
	}

	@Override
	public void removeFilm(Integer id) {
		this.repo.deleteById(id);
	}

}
