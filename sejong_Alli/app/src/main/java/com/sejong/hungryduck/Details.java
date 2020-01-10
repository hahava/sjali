package com.sejong.hungryduck;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.sejong.hungryduck.sejong.R;

public class Details extends Activity{

    TextView maintitle;
    TextView secondtitle;
    TextView secondhost;
    TextView seconddate;
    TextView attend;
    TextView contents;
    TextView benefits;
    TextView date;
    TextView reception;
    TextView notice;
    TextView contact;
    ImageView secondImage;
    ImageButton kakaobtn,facebookbtn;

    @SuppressLint("WrongViewCast")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_info);
        Intent intent = getIntent();
        int position;
        position = intent.getExtras().getInt("number");
        final ExampleDetails detaildata = new ExampleDetails(position);

        maintitle = (TextView) findViewById(R.id.detailTitle);
        secondtitle = (TextView) findViewById(R.id.smallTitle);
        secondhost = (TextView) findViewById(R.id.smallHost);
        seconddate = (TextView) findViewById(R.id.smallDate);
        attend = (TextView) findViewById(R.id.attendCondition);
        contents = (TextView) findViewById(R.id.contents);
        benefits = (TextView) findViewById(R.id.benefits);
        date = (TextView) findViewById(R.id.date);
        reception = (TextView) findViewById(R.id.reception);
        notice = (TextView) findViewById(R.id.notice);
        contact = (TextView) findViewById(R.id.contactInformation);
        secondImage = (ImageView) findViewById(R.id.detailImage);
        kakaobtn = (ImageButton) findViewById(R.id.kakaoButton);
        facebookbtn = (ImageButton) findViewById(R.id.facebookButton);

        maintitle.setText(detaildata.mainTitle);
        secondtitle.setText(detaildata.secondTitle);
        secondhost.setText(detaildata.secondHost);
        seconddate.setText(detaildata.secondDate);
        attend.setText(detaildata.detAttend);
        contents.setText(detaildata.detContents);
        benefits.setText(detaildata.detBenefits);
        date.setText(detaildata.detDate);
        reception.setText(detaildata.detReception);
        notice.setText(detaildata.detNotice);
        contact.setText(detaildata.detContact);

        switch (position)
        {
            case 0:
                secondImage.setImageDrawable(getDrawable(R.drawable.out_one));
                break;
            case 1:
                secondImage.setImageDrawable(getDrawable(R.drawable.out_second));
                break;
            case 2:
                secondImage.setImageDrawable(getDrawable(R.drawable.out_third));
                break;
            case 3:
                secondImage.setImageDrawable(getDrawable(R.drawable.out_fourth));
                break;
            case 4:
                secondImage.setImageDrawable(getDrawable(R.drawable.out_fivth));
                break;

        }


    }
}
