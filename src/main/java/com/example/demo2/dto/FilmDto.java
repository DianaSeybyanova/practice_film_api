package com.example.demo2.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FilmDto {
    private String nameFilm;
    private String nameFilmOriginal;
    private LocalDate releaseDate;
    private int runtime;
    private int certification;
    private int numberReviews;
    private float ratingKinopoisk;
    private float ratingImdb;
    private int budget;
    private int gross;
}
