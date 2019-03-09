package com.example.recyclerviewvhg;

public class MovieModel {
    String namaMovie;
    int picMovie;

    public MovieModel(String namaMovie,int picMovie){
        this.namaMovie = namaMovie;
        this.picMovie = picMovie;
    }
    public String getNamaMovie() {
        return namaMovie;
    }

    public int getPicMovie() {
        return picMovie;
    }
}
