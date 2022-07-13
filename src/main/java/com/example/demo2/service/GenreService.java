package com.example.demo2.service;

import com.example.demo2.dto.GenreDto;
import com.example.demo2.entity.Genre;
import com.example.demo2.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GenreService {
    private final GenreRepository genreRepository;

    public Genre save(GenreDto genreDto){
        Genre genre = new Genre()
                .setIdGenre(UUID.randomUUID().toString())
                .setNameGenre(genreDto.getNameGenre());
        return genreRepository.save(genre);
    }

    public Iterable<Genre> getAll(){
        return genreRepository.findAll();
    }
}
