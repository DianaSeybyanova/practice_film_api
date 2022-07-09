package com.example.demo2.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Accessors(chain = true)
public class Film {

    @Id
    private String idFilm;
    private String nameFilm;
    private String nameFilmOriginal;

    public Film setName(String nameFilm){
        return this;
    }
}
