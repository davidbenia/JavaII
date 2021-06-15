package edu.btu.david_benia.repo;

import edu.btu.david_benia.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {
}
