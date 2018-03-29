package ru.human_factors.characterist.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.human_factors.characterist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompFragment extends Fragment {


    public CompFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comp_list, container, false);
    }

}
