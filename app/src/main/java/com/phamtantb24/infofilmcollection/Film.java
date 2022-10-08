package com.phamtantb24.infofilmcollection;

import java.io.Serializable;
import java.util.List;

public class Film implements Serializable {
    private String title;
    private String releaseDay;
    private List<String> actors;
    private String director;
    private String language;
    private int banner;
    private int runningTime;
    private String country;

    public Film(String title, String releaseDay, List<String> actors, String director, String language, int banner, int runningTime,String country) {
        this.title = title;
        this.releaseDay = releaseDay;
        this.actors = actors;
        this.director = director;
        this.language = language;
        this.banner = banner;
        this.runningTime = runningTime;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", releaseDay='" + releaseDay + '\'' +
                ", actors=" + actors +
                ", director='" + director + '\'' +
                ", language='" + language + '\'' +
                ", banner=" + banner +
                ", runningTime=" + runningTime +
                ", country='" + country + '\'' +
                '}';
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Film() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }



    public int getBanner() {
        return banner;
    }

    public void setBanner(int banner) {
        this.banner = banner;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }
}
