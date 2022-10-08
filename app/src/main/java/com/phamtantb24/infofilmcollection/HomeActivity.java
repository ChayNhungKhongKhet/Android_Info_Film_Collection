package com.phamtantb24.infofilmcollection;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.phamtantb24.infofilmcollection.databinding.ActivityHomeBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeActivity extends DrawerBaseActivity {

    ActivityHomeBinding activityHomeBinding;
    FilmAdapter filmAdapter;
    List<Film> films;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHomeBinding = ActivityHomeBinding.inflate(getLayoutInflater());

        setContentView(activityHomeBinding.getRoot());
        allocateActivityTitle("Home");

        films = new ArrayList<>();
        createListFilm();
        filmAdapter = new FilmAdapter(films,R.layout.item_film,this);
        activityHomeBinding.listFilms.setAdapter(filmAdapter);
        activityHomeBinding.listFilms.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),FilmDetailActivity.class);
                intent.putExtra("film",films.get(position));
                startActivity(intent);
            }
        });
    }

    public void createListFilm() {
        {
            String title = "Top Gun: Maverick";
            String releaseDay = "April 28, 2022";
            String acc = "Tom Cruise\n" +
                    "Val Kilmer\n" +
                    "Miles Teller\n" +
                    "Jennifer Connelly\n" +
                    "Jon Hamm\n" +
                    "Glen Powell\n" +
                    "Ed Harris\n" +
                    "Monica Barbaro\n" +
                    "Lewis Pullman";
            List<String> actors = new ArrayList<>(Arrays.asList(
                    acc.split("\n")
            ));
            String director = "Joseph Kosinski";
            String language = "English";
            int banner = R.drawable.top_gun;
            int runningTime = 130;
            String country = "United States";
            Film film = new Film(title, releaseDay, actors, director, language, banner, runningTime, country);
            films.add(film);
        }

        {
            String title = "Jurassic World Dominion";
            String releaseDay = "May 23, 2022";
            String acc = "Chris Pratt\n" +
                    "Bryce Dallas Howard\n" +
                    "Laura Dern\n" +
                    "Jeff Goldblum\n" +
                    "Sam Neill\n" +
                    "DeWanda Wise\n" +
                    "Mamoudou Athie\n" +
                    "BD Wong\n" +
                    "Omar Sy";
            List<String> actors = new ArrayList<>(Arrays.asList(
                    acc.split("\n")
            ));
            String director = "Colin Trevorrow";
            String language = "English";
            int banner = R.drawable.jurassic_world_dominion;
            int runningTime = 146;
            String country = "United States";
            Film film = new Film(title, releaseDay, actors, director, language, banner, runningTime, country);
            films.add(film);
        }
        {
            String title = "Doctor Strange in the Multiverse of Madness";
            String releaseDay = "May 2, 2022";
            String acc = "Benedict Cumberbatch\n" +
                    "Elizabeth Olsen\n" +
                    "Chiwetel Ejiofor\n" +
                    "Benedict Wong\n" +
                    "Xochitl Gomez\n" +
                    "Michael Stuhlbarg\n" +
                    "Rachel McAdams";
            List<String> actors = new ArrayList<>(Arrays.asList(
                    acc.split("\n")
            ));
            String director = "Sam Raimi";
            String language = "English";
            int banner = R.drawable.dortor_strange;
            int runningTime = 126 ;
            String country = "United States";
            Film film = new Film(title, releaseDay, actors, director, language, banner, runningTime, country);
            films.add(film);
        }
        {
            String title = "Minions: The Rise of Gru";
            String releaseDay = "June 13, 2022";
            String acc = "Steve Carell\n" +
                    "Pierre Coffin\n" +
                    "Alan Arkin\n" +
                    "Taraji P. Henson\n" +
                    "Michelle Yeoh\n" +
                    "Julie Andrews\n" +
                    "Russell Brand\n" +
                    "Jean-Claude Van Damme\n" +
                    "Dolph Lundgren\n" +
                    "Danny Trejo\n" +
                    "Lucy Lawless";
            List<String> actors = new ArrayList<>(Arrays.asList(
                    acc.split("\n")
            ));
            String director = "Kyle Balda";
            String language = "English";
            int banner = R.drawable.minions;
            int runningTime = 87  ;
            String country = "United States";
            Film film = new Film(title, releaseDay, actors, director, language, banner, runningTime, country);
            films.add(film);
        }
        {
            String title = "The Batman";
            String releaseDay = "March 1, 2022";
            String acc = "Robert Pattinson\n" +
                    "Zoë Kravitz\n" +
                    "Paul Dano\n" +
                    "Jeffrey Wright\n" +
                    "John Turturro\n" +
                    "Peter Sarsgaard\n" +
                    "Andy Serkis\n" +
                    "Colin Farrell";
            List<String> actors = new ArrayList<>(Arrays.asList(
                    acc.split("\n")
            ));
            String director = "Matt Reeves";
            String language = "English";
            int banner = R.drawable.batman;
            int runningTime = 176   ;
            String country = "United States";
            Film film = new Film(title, releaseDay, actors, director, language, banner, runningTime, country);
            films.add(film);
        }
        {
            String title = "Fantastic Beasts: The Secrets of Dumbledore";
            String releaseDay = "29 July 2022";
            String acc = "Eddie Redmayne\n" +
                    "Jude Law\n" +
                    "Ezra Miller\n" +
                    "Dan Fogler\n" +
                    "Alison Sudol\n" +
                    "Callum Turner\n" +
                    "Jessica Williams\n" +
                    "Katherine Waterston\n" +
                    "Mads Mikkelsen";
            List<String> actors = new ArrayList<>(Arrays.asList(
                    acc.split("\n")
            ));
            String director = "David Yates";
            String language = "English";
            int banner = R.drawable.fantastic_beasts;
            int runningTime = 142;
            String country = "United Kingdom\n" +
                    "United States";
            Film film = new Film(title, releaseDay, actors, director, language, banner, runningTime, country);
            films.add(film);
        }

        {
            String title = "Sonic the Hedgehog 2 (film)";
            String releaseDay = "March 30, 2022";
            String acc = "James Marsden\n" +
                    "Ben Schwartz\n" +
                    "Tika Sumpter\n" +
                    "Natasha Rothwell\n" +
                    "Adam Pally\n" +
                    "Shemar Moore\n" +
                    "Colleen O'Shaughnessey\n" +
                    "Lee Majdoub\n" +
                    "Idris Elba\n" +
                    "Jim Carrey";
            List<String> actors = new ArrayList<>(Arrays.asList(
                    acc.split("\n")
            ));
            String director = "Jeff Fowler";
            String language = "English";
            int banner = R.drawable.sonic;
            int runningTime = 122 ;
            String country = "United States\n" +
                    "Japan";
            Film film = new Film(title, releaseDay, actors, director, language, banner, runningTime, country);
            films.add(film);
        }

        {
            String title = "Thor: Love and Thunder";
            String releaseDay = "June 23, 2022";
            String acc = "Chris Hemsworth\n" +
                    "Christian Bale\n" +
                    "Tessa Thompson\n" +
                    "Jaimie Alexander\n" +
                    "Taika Waititi\n" +
                    "Russell Crowe\n" +
                    "Natalie Portman";
            List<String> actors = new ArrayList<>(Arrays.asList(
                    acc.split("\n")
            ));
            String director = "Taika Waititi";
            String language = "English";
            int banner = R.drawable.thor_love_and_thunder;
            int runningTime = 119 ;
            String country = "United States";
            Film film = new Film(title, releaseDay, actors, director, language, banner, runningTime, country);
            films.add(film);
        }

    }
}