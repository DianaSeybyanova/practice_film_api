package com.example.demo2.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Accessors(chain = true)
public class Film {

    @Id
    private String idFilm;
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
/*
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Set<FilmGenre> filmGenre = new HashSet<>();
*/
    public Film setName(String nameFilm){
        return this;
    }
}
