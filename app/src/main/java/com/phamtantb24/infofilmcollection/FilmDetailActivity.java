package com.phamtantb24.infofilmcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class FilmDetailActivity extends AppCompatActivity {

    TextView title,releaseDay,language, runningTimeDetail,actors,country,director;
    ImageView poster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_detail);
        mapping();
        if (getIntent() != null && getIntent().getSerializableExtra("film") != null && getIntent().hasExtra("film")) {
            Film film = (Film) getIntent().getSerializableExtra("film");
            Log.i("-------------------------","film"+film.toString());
            title.setText(film.getTitle());
            releaseDay.setText(film.getReleaseDay());
            language.setText("Language : "+film.getLanguage());
            runningTimeDetail.setText("Running time : "+film.getRunningTime());
            actors.setText(film.getActors().toString().replace("[","").replace("]","").replace(", ","\n"));
            country.setText("Country : "+film.getCountry());
            director.setText("Director : "+film.getDirector());
            poster.setImageResource(film.getBanner());
        }

    }

    private void mapping() {
        title = findViewById(R.id.film_title);
        releaseDay = findViewById(R.id.release__day);
        language = findViewById(R.id.language);
        runningTimeDetail = findViewById(R.id.running_time_detail);
        actors = findViewById(R.id.starring);
        country = findViewById(R.id.country);
        director = findViewById(R.id.director_detail_film);
        poster = findViewById(R.id.poster_film);
    }
}