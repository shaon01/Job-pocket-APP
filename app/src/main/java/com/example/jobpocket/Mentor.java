package com.example.jobpocket;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
//import java.io.ByteArrayOutputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;

public class Mentor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // START reading mentor description from text file

        StringBuilder tempStory = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(getAssets().open("mentorStory.txt")));

            // do reading, usually loop until end of file reading
            String mLine;
            while ((mLine = reader.readLine()) != null) {
                tempStory.append(mLine);
                tempStory.append('\n');

            }
        } catch (IOException e) {
            //log the exception
            Toast.makeText(getApplicationContext(),"Error reading file!", Toast.LENGTH_LONG).show();
            e.printStackTrace();

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }
        TextView story = findViewById(R.id.mentorStory);
        story.setText(tempStory) ;
        //story.setSelected(true);
        story.setMovementMethod(new ScrollingMovementMethod());

        // END reading mentor description from text file

    }

}
