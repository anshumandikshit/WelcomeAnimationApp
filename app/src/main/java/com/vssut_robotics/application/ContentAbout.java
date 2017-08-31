package com.vssut_robotics.application;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ContentAbout extends AppCompatActivity {
   private TextView mTextView;
    private ImageButton about_fb;
    private ImageButton about_twitter;
    private ImageButton about_youtube;
    private ImageButton about_linkedin;
    private TextView mTextView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_Black_NoTitleBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_about);

        mTextView=(TextView)findViewById(R.id.text_web_addr);
        about_fb=(ImageButton)findViewById(R.id.about_fb);
        about_twitter=(ImageButton)findViewById(R.id.about_twitter);
        about_youtube=(ImageButton)findViewById(R.id.about_youtube);
        about_linkedin= (ImageButton)findViewById(R.id.about_linkedin);

       String tempString="www.linkedin.com/in/anshumandikshit";
        mTextView1=(TextView)findViewById(R.id.textView10);
        SpannableString spanString = new SpannableString(tempString);
       spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
       spanString.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanString.length(), 0);
        mTextView1.setText(spanString);

        mTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.linkedin.com/in/anshumandikshit"));
                startActivity(intent);
            }
        });

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.vssutrobotics.in"));
                startActivity(intent);
            }
        });


        about_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/vssutrobotics/"));
                startActivity(intent);

            }
        });

        about_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.twitter.com/societyrobotics"));
                startActivity(intent);



            }
        });


        about_youtube.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.youtube.com/channel/UCfrM26pYkyk8JtW-G0mcDNQ"));
                startActivity(intent);


            }
        });


        about_linkedin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/vssutrobotics/"));
                startActivity(intent);


            }
        });



    }
}
