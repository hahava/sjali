package com.sejong.hungryduck.apicall;

import com.sejong.hungryduck.model.Postings;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface PostingService {

	@GET("/api/posting/{id}")
	Call<Postings> getPosting(@Path("id") int id);

	@GET("/api/postings/")
	Call<List<Postings>> getPostings()
}
