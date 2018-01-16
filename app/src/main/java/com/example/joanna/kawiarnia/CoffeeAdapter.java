package com.example.joanna.kawiarnia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.joanna.kawiarnia.Coffee;
import com.example.joanna.kawiarnia.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Joanna on 2018-01-03.
 */

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {


    private ArrayList<Coffee> coffees = new ArrayList<>();

    CoffeeAdapter(ArrayList<Coffee> coffees) {
        this.coffees = coffees;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(coffees.get(position).getName());
        holder.setPrice(coffees.get(position).getPrice() + "");

    }

    @Override
    public int getItemCount() {
        return coffees.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvName)
        TextView Name;

        @BindView(R.id.tvPrice)
        TextView Price;

        @BindView(R.id.ivCheck)
        ImageView Chosen;

        @OnClick(R.id.bChoose)
        void onNameClick(){
            if(Chosen.getVisibility()==View.INVISIBLE){
                Chosen.setVisibility(View.VISIBLE);
            }
            else{
                Chosen.setVisibility(View.INVISIBLE);
            }
        }
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            Chosen.setVisibility(View.INVISIBLE);
        }

        private void setName(String name) {
            Name.setText(name);
        }

        private void setPrice(String price) {
            Price.setText(price);
        }


    }
}