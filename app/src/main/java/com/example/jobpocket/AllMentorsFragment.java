package com.example.jobpocket;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class AllMentorsFragment extends Fragment {

    public AllMentorsFragment() {
    }

    private List<Person> persons;
    private RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_all_mentors, container, false);
    }


}
