package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

//    @GET("movie?token=A0VJVH6-Z8WMPVM-G36MJNF-43MGECB&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=5")
    @GET("movie?token=A0VJVH6-Z8WMPVM-G36MJNF-43MGECB&field=rating.kp&search=4-8&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?token=A0VJVH6-Z8WMPVM-G36MJNF-43MGECB&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);

    @GET("review?token=A0VJVH6-Z8WMPVM-G36MJNF-43MGECB&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}
