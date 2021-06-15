package edu.btu.david_benia.service.impl;

import edu.btu.david_benia.dto.movie.*;
import edu.btu.david_benia.model.Movie;
import edu.btu.david_benia.repo.MovieRepo;
import edu.btu.david_benia.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepo movieRepo;

    @Override
    public GetMoviesOutput getMovies() {
        List<Movie> movieList = movieRepo.findAll();

        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();

        List<MovieDTO> movieDTOList = new ArrayList<>();
        for(Movie movie : movieList){
            MovieDTO movieDTO = new MovieDTO();

            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());

            movieDTOList.add(movieDTO);
        }
        getMoviesOutput.setMovieDTOList(movieDTOList);


        return getMoviesOutput;
    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepo.getById(getMovieInput.getMovieId());

        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setId(movie.getId());
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());

        return getMovieOutput;
    }

    @Override
    public void addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());
        movieRepo.save(movie);
    }

    @Override
    public void deleteMovie(DeleteMovieInput deleteMovieInput) {
        movieRepo.deleteById(deleteMovieInput.getId());
    }
}
