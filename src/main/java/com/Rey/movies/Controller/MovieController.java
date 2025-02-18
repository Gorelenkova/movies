package com.Rey.movies.Controller;

import com.Rey.movies.Model.Movie;
import com.Rey.movies.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(),HttpStatus.OK);
    }
    @GetMapping("/{titel}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String title){
            return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(title),HttpStatus.OK);
    }
}
