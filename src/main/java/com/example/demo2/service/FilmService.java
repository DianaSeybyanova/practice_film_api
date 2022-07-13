package com.example.demo2.service;

import com.example.demo2.dto.FilmDto;
import com.example.demo2.entity.Film;
import com.example.demo2.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class FilmService {
    private final FilmRepository filmRepository;

    public Film save(FilmDto filmDto){
        Film film = new Film()
                .setIdFilm(UUID.randomUUID().toString())
                .setNameFilm(filmDto.getNameFilm())
                .setNameFilmOriginal(filmDto.getNameFilmOriginal())
                .setReleaseDate(filmDto.getReleaseDate())
                .setRuntime(filmDto.getRuntime())
                .setCertification(filmDto.getCertification())
                .setNumberReviews(filmDto.getNumberReviews())
                .setRatingKinopoisk(filmDto.getRatingKinopoisk())
                .setRatingImdb(filmDto.getRatingImdb())
                .setBudget(filmDto.getBudget())
                .setGross(filmDto.getGross())
                ;
        return filmRepository.save(film);
    }
    // Переделать!!
    public Iterable<Film> getAll(){
        return filmRepository.findAll();

    }
}
