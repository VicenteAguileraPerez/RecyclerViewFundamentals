package com.vicenteaguilera.recyclerviewfundamentals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.vicenteaguilera.recyclerviewfundamentals.adapter.Adapter;


/***
 *   Item
 *   ItemLayout
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView =  findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new Adapter());
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));// vertical 1 column top down
        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));// horizontal 1 column reverse no left right
        // recyclerView.setLayoutManager(new GridLayoutManager(this,2));// vertical top down 2 columns
        // recyclerView.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.HORIZONTAL,true));// hotizontal right left 2 columns


    }
}