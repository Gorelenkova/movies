package com.Rey.movies.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbid;
    private String title;
    private String releaseDate;
    private String trailerlink;
    private String poster;
    private List<String> geners;
    private List<String> backgrounds;
    private List<Review> reviews;
}
