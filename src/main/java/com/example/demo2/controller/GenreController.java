package com.example.demo2.controller;

import com.example.demo2.dto.GenreDto;
import com.example.demo2.entity.Genre;
import com.example.demo2.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genres")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @PostMapping
    public Genre save(@RequestBody GenreDto genreDto){
        return genreService.save(genreDto);
    }

    @GetMapping
    public Iterable<Genre> getAll(){
        return genreService.getAll();
    }
}
