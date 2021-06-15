package edu.btu.david_benia.service;

import edu.btu.david_benia.dto.movie.*;

public interface MovieService {
    GetMoviesOutput getMovies();
    GetMovieOutput getMovie(GetMovieInput getMovieInput);
    void addMovie(AddMovieInput addMovieInput);
    void deleteMovie(DeleteMovieInput deleteMovieInput);
}
