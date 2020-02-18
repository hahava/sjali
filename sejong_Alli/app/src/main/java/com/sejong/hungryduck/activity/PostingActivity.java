package com.sejong.hungryduck.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.sejong.hungryduck.apicall.PostingService;
import com.sejong.hungryduck.model.Posting;
import com.sejong.hungryduck.sejong.R;
import com.squareup.picasso.Picasso;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostingActivity extends Activity {

	private TextView maintitle;
	private TextView secondtitle;
	private TextView secondhost;
	private TextView seconddate;
	private TextView attend;
	private TextView contents;
	private TextView benefits;
	private TextView date;
	private TextView reception;
	private TextView notice;
	private TextView contact;
	private ImageView secondImage, detailImage;
	private ImageButton kakaobtn, facebookbtn;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_posting_layout);
		setViewBinding();
		getPosting(getIntent().getExtras().getInt("itemNumber"));
	}

	private void getPosting(int postingId) {
		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl(getString(R.string.dev_addr))
			.addConverterFactory(GsonConverterFactory.create())
			.build();

		Call<Posting> postingsCall = retrofit.create(PostingService.class).getPosting(postingId + 1);

		postingsCall.enqueue(new Callback<Posting>() {
			@Override public void onResponse(Call<Posting> call, Response<Posting> response) {
				Posting selectedPosting = response.body();

				maintitle.setText(selectedPosting.getMainTitle());
				secondtitle.setText(selectedPosting.getSecondTitle());
				secondhost.setText(selectedPosting.getHost());
				seconddate.setText(selectedPosting.getEndDate());
				attend.setText(selectedPosting.getLimitingCondition());
				contents.setText(selectedPosting.getContents());
				benefits.setText(selectedPosting.getWinnerPrize());
				date.setText(selectedPosting.getStartDate());
				reception.setText(selectedPosting.getReception());
				notice.setText(selectedPosting.getNotice());
				contact.setText(selectedPosting.getContact());

				Picasso.get()
					.load(getString(R.string.dev_addr) + "/image/" + selectedPosting.getImgPath())
					.error(R.drawable.board_item_basic_thumbnail)
					.into(detailImage);
			}

			@Override public void onFailure(Call<Posting> call, Throwable t) {
			}
		});
	}

	private void setViewBinding() {
		detailImage = (ImageView)findViewById(R.id.detailImage);
		maintitle = (TextView)findViewById(R.id.detailTitle);
		secondtitle = (TextView)findViewById(R.id.smallTitle);
		secondhost = (TextView)findViewById(R.id.smallHost);
		seconddate = (TextView)findViewById(R.id.smallDate);
		attend = (TextView)findViewById(R.id.attendCondition);
		contents = (TextView)findViewById(R.id.contents);
		benefits = (TextView)findViewById(R.id.benefits);
		date = (TextView)findViewById(R.id.date);
		reception = (TextView)findViewById(R.id.reception);
		notice = (TextView)findViewById(R.id.notice);
		contact = (TextView)findViewById(R.id.contactInformation);
		secondImage = (ImageView)findViewById(R.id.detailImage);
		kakaobtn = (ImageButton)findViewById(R.id.kakaoButton);
		facebookbtn = (ImageButton)findViewById(R.id.facebookButton);
	}
}
