package com.example.demo2.service;

import com.example.demo2.dto.FilmGenreDto;
import com.example.demo2.entity.FilmGenre;
import com.example.demo2.repository.FilmGenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FilmGenreService {
    private final FilmGenreRepository filmGenreRepository;

    public FilmGenre save(FilmGenreDto filmGenreDto){
        FilmGenre filmGenre = new FilmGenre()
                .setIdFilm(filmGenreDto.getIdFilm())
                .setIdGenre(filmGenreDto.getIdGenre());
        return filmGenreRepository.save(filmGenre);
    }
    public Iterable<FilmGenre> getAll(){
        return filmGenreRepository.findAll();
    }
}

