package com.example.demo2.controller;

import com.example.demo2.dto.FilmDto;
import com.example.demo2.entity.Film;
import com.example.demo2.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
public class FilmController {

    private final FilmService service;

    @PostMapping
    public Film save(@RequestBody FilmDto film){
        return service.save(film);
    }

    @GetMapping
    public Iterable<Film> getAll(){
        return service.getAll();
    }
}
