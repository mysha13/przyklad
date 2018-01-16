package com.example.joanna.kawiarnia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {



    @BindView(R.id.recView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Latte", 12));
        coffees.add(new Coffee("Czarna", 10));
        coffees.add(new Coffee("Espresso", 14));
        coffees.add(new Coffee("Latte Macchiatto", 12));

        CoffeeAdapter coffeeAdaper = new CoffeeAdapter(coffees);
        recyclerView.setAdapter(coffeeAdaper);

    }
}
