package com.example.eeww9.sejong_alli.example;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eeww9.sejong_alli.R;

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
    Button kakaobtn,facebookbtn;

    @SuppressLint("WrongViewCast")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_info);
        Intent intent = getIntent();
        final ExampleDetails detaildata = new ExampleDetails();

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
        kakaobtn = (Button) findViewById(R.id.kakaoButton);
        facebookbtn = (Button) findViewById(R.id.facebookButton);

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
        secondImage.setImageDrawable(getDrawable(R.drawable.out_one));

    }
}
