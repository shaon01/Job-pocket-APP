package com.example.jobpocket;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Compaines extends AppCompatActivity {

    private List<CompanyBio> companyBios;
    private RecyclerView recyclerView;
    Context context;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compaines);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.CompanyViewr);
        context = getApplicationContext();

        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,2);
        recyclerView.setLayoutManager(gridLayoutManager);


        initializeData();
        initializeAdapter();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    private void initializeData(){
        companyBios = new ArrayList<>();
        companyBios.add(new CompanyBio("Volvo",R.drawable.volvo));
        companyBios.add(new CompanyBio("Ericsson",R.drawable.ericsson));
        companyBios.add(new CompanyBio("Volvo",R.drawable.volvo));
        companyBios.add(new CompanyBio("Ericsson",R.drawable.ericsson));
        companyBios.add(new CompanyBio("Volvo",R.drawable.volvo));
        companyBios.add(new CompanyBio("Ericsson",R.drawable.ericsson));


    }

    private void initializeAdapter(){
        RVCompanyAdptr adapter = new RVCompanyAdptr(companyBios);
        recyclerView.setAdapter(adapter);
    }


}



