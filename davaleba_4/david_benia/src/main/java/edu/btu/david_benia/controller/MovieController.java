package edu.btu.david_benia.controller;

import edu.btu.david_benia.dto.movie.*;
import edu.btu.david_benia.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("getMovies")
    public GetMoviesOutput getMovies(){
        return movieService.getMovies();
    }

    @PostMapping("getMovie/{id}")
    public GetMovieOutput getMovie(@RequestBody GetMovieInput getMovieInput){
        return movieService.getMovie(getMovieInput);
    }

    @PostMapping("addMovie")
    public void addMovie(@RequestBody AddMovieInput addMovieInput){
        movieService.addMovie(addMovieInput);
    }

    @PostMapping("deleteMovie")
    public void deleteMovie(@RequestBody DeleteMovieInput deleteMovieInput){
        movieService.deleteMovie(deleteMovieInput);
    }
}
