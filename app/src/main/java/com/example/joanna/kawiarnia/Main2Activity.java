package com.example.joanna.kawiarnia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Latte", 12));
        coffees.add(new Coffee("Czarna", 10));
        coffees.add(new Coffee("Espresso", 14));
        coffees.add(new Coffee("Latte Macchiatto", 12));

    }
}
