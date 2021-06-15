package edu.btu.david_benia.dto.movie;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOutput {
    List<MovieDTO> movieDTOList;
}
