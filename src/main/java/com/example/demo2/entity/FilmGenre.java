package com.example.demo2.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@Accessors(chain = true)
public class FilmGenre {
    @Id
    private String idFilm;
    private String idGenre;
/*
    @ManyToOne(fetch = FetchType.LAZY)
    private Film film;

    @ManyToOne(fetch = FetchType.LAZY)
    private Genre genre;
*/

}
