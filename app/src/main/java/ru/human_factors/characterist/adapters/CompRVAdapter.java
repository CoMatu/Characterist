package ru.human_factors.characterist.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import ru.human_factors.characterist.R;

public class CompRVAdapter extends RecyclerView.Adapter<CompRVAdapter.ViewHolder> {
    CardView cardView;

    @NonNull
    @Override
    public CompRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_comp, parent, false);
        View child_view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_child_1, parent, false);
        return new ViewHolder(view, child_view);
    }

    @Override
    public void onBindViewHolder(@NonNull CompRVAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ViewHolder(View itemView, View childView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv1);
            CardView childCardView = (CardView) childView.findViewById(R.id.child_cv);
            LinearLayout linearLayout_childItems = (LinearLayout) itemView.findViewById(R.id.child_linear_layout);

            for (int indexView = 0; indexView < 3; indexView++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                linearLayout_childItems.addView(childCardView, layoutParams);
            }
        }

        @Override
        public void onClick(View view) {

        }
    }
}
