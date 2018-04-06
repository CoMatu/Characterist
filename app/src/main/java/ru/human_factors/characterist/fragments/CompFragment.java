package ru.human_factors.characterist.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.human_factors.characterist.R;
import ru.human_factors.characterist.adapters.CompRVAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompFragment extends Fragment {

    public CompFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comp_list, container, false);

//        if (view instanceof RecyclerView) {
            Context context = view.getContext();
//            RecyclerView recyclerView = (RecyclerView) view;
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.competentions_rv);
                recyclerView.setLayoutManager(new LinearLayoutManager(context));

// TODO: сюда поставить адаптер
            // specify an adapter (see also next example)
            CompRVAdapter mAdapter = new CompRVAdapter();
            recyclerView.setAdapter(mAdapter);
            recyclerView.setHasFixedSize(true);
//        }
        return view;


    }

}
