package dev.farhan.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
// moviews,,, 오타났음 몽고 디비에 xxx.moviews 형식으로 데이터 컬렉션이 저장되어 있음
@Document(collection = "moviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewId;

}
