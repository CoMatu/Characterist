package ru.human_factors.characterist.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.human_factors.characterist.R;

public class CompRVAdapter extends RecyclerView.Adapter<CompRVAdapter.ViewHolder> {
    CardView cardView;

    @NonNull
    @Override
    public CompRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_comp, parent, false);
        ViewHolder cvh = new ViewHolder(view);
        return  cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CompRVAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.cv);
        }
    }
}
