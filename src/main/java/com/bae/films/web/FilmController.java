package com.bae.films.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.films.domain.Film;
import com.bae.films.service.FilmService;

@RestController
@CrossOrigin
public class FilmController {

	private FilmService service;

	@Autowired
	public FilmController(FilmService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create") // 201 - Created
	public ResponseEntity<Film> createFilm(@RequestBody Film film) {
		Film created = this.service.createFilm(film);
		ResponseEntity<Film> response = new ResponseEntity<Film>(created, HttpStatus.CREATED);
		return response;
	}

	@GetMapping("/getAll") // 200
	public ResponseEntity<List<Film>> getAllFilms() {
		return ResponseEntity.ok(this.service.getAllFilms());
	}

	@GetMapping("/get/{id}") // 200
	public Film getFilm(@PathVariable Integer id) {
		return this.service.getFilm(id);
	}

//	@GetMapping("/getByType/{type}")
//	public ResponseEntity<List<Film>> getDinoByType(@PathVariable String type) {
//		List<Film> found = this.service.getAllDinosByType(type);
//		return ResponseEntity.ok(found);
//	}

	@PutMapping("/replace/{id}") // 202 - Accepted
	public ResponseEntity<Film> replaceFilm(@PathVariable Integer id, @RequestBody Film newFilm) {
		Film body = this.service.replaceFilm(id, newFilm);

		ResponseEntity<Film> response = new ResponseEntity<Film>(body, HttpStatus.ACCEPTED);
		return response;
	}

	@DeleteMapping("/remove/{id}") // 204
	public ResponseEntity<?> removeFilm(@PathVariable Integer id) {
		this.service.removeFilm(id);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
