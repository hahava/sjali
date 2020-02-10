package com.sejong.hungryduck.apicall;

import com.sejong.hungryduck.model.Posting;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface PostingService {

	@GET("api/posting/{postingId}")
	Call<Posting> getPosting(@Path("postingId") int postingId);

	@GET("api/postings/")
	Call<List<Posting>> getPostings(
		@Query("page") int page,
		@Query("size") int size
	);
}
