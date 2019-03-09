package com.example.recyclerviewvhg;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    Context context;
    List<MovieModel> movieModels = new ArrayList<>();
    MainView view;
    public MovieData(MainView view,Context context){
        this.view=view;
        this.context=context;
    }

    public void setData(){
        MovieModel movie;
        movie= new MovieModel("Path", R.drawable.path);
        movieModels.add(movie);
        movie= new MovieModel("Fusion", R.drawable.fusion);
        movieModels.add(movie);
        movie= new MovieModel("Dragon", R.drawable.dragon);
        movieModels.add(movie);
        movie= new MovieModel("God", R.drawable.god);
        movieModels.add(movie);
        movie= new MovieModel("Ressurection", R.drawable.ressurection);
        movieModels.add(movie);
        movie= new MovieModel("Broly", R.drawable.brolly3);
        movieModels.add(movie);

        view.onSuccess(movieModels);
    }
}
