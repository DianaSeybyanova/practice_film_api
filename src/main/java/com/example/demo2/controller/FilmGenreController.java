package com.example.demo2.controller;

import com.example.demo2.dto.FilmGenreDto;
import com.example.demo2.entity.FilmGenre;
import com.example.demo2.service.FilmGenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmgenre")
@RequiredArgsConstructor
public class FilmGenreController {
    private final FilmGenreService filmGenreService;

    @PostMapping
    public FilmGenre save(@RequestBody FilmGenreDto filmGenreDto){
        return filmGenreService.save(filmGenreDto);
    }

    @GetMapping
    public Iterable<FilmGenre> getAll(){
        return filmGenreService.getAll();
    }
}
