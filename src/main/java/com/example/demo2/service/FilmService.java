package com.example.demo2.service;

import com.example.demo2.dto.FilmDto;
import com.example.demo2.entity.Film;
import com.example.demo2.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FilmService {
    private final FilmRepository filmRepository;

    public Film save(FilmDto filmDto){
        Film film = new Film()
                .setNameFilm(filmDto.getNameFilm())
                .setNameFilmOriginal(filmDto.getNameFilmOriginal())
                .setIdFilm(UUID.randomUUID().toString());
        return filmRepository.save(film);
    }
    // Переделать!!
    public Iterable<Film> getAll(){
        return filmRepository.findAll();

    }
}
