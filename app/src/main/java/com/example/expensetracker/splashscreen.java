package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.VideoView;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashscreen.this,MainActivity.class));
                finish();
            }
        },2000);

        ImageView logo = findViewById(R.id.logo);

        Bitmap bg=Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
        logo.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas=new Canvas(bg);
        Paint paint=new Paint();
        paint.setColor(Color.parseColor("#0DB2CD"));
        paint.setTextSize(440);
        Paint paint1=new Paint();
        paint1.setColor(Color.BLACK);
        Paint paint2=new Paint();
        paint2.setColor(Color.WHITE);
        Paint paint3=new Paint();


        canvas.drawCircle(350,650,250,paint1);
        canvas.drawCircle(350,650,200,paint2);
        canvas.drawText("$", 230, 805, paint);


    }
}