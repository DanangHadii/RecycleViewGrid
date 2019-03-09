package com.example.recyclerviewvhg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    RecyclerView rvTeam,rvTeam1,rvTeam2;
    MovieAdapter adapter;
    MovieData data;
    List<MovieModel> movieModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTeam = findViewById(R.id.recycler);
        rvTeam1 = findViewById(R.id.recycler1);
        rvTeam2 = findViewById(R.id.recycler2);

        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MovieAdapter(this, movieModels);
        rvTeam.setAdapter(adapter);
        data = new MovieData(this,this);
        data.setData();

        rvTeam1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        adapter = new MovieAdapter(this, movieModels);
        rvTeam1.setAdapter(adapter);
        data = new MovieData(this,this);
        data.setData();

        rvTeam2.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        adapter = new MovieAdapter(this, movieModels);
        rvTeam2.setAdapter(adapter);
        data = new MovieData(this,this);
        data.setData();
    }

    public void onSuccess(List<MovieModel> movieModels){
        this.movieModels.clear();
        this.movieModels.addAll(movieModels);
        this.adapter.notifyDataSetChanged();
    }
}