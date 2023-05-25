package com.example.dotmovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Choosers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosers);

    }

    public void dotmovies(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void vegamovies(View view) {
        startActivity(new Intent(this, VegaMovies.class));
    }

    public void ssrmovies(View view) {
        startActivity(new Intent(this, SsrMovies.class));
    }

    public void watchonline(View view) {
        startActivity(new Intent(this, WatchOnline.class));
    }

    public void moviesmora(View view) {
        startActivity(new Intent(this, MoviesMora.class));
    }
}