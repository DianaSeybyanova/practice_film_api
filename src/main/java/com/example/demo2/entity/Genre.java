package com.example.demo2.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Accessors(chain = true)
public class Genre {
    @Id
    private String idGenre;
    private String nameGenre;
/*
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Set<FilmGenre> filmGenre = new HashSet<>();
*/
    public Genre setName(String nameGenre){
        return this;
    }
}
