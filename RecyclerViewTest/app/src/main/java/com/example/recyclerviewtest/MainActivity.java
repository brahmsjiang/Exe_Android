package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.banana);
            fruitList.add(banana);
            Fruit orange = new Fruit("Apple", R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Apple", R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Apple", R.drawable.pear);
            fruitList.add(pear);
            Fruit grape = new Fruit("Apple", R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Apple", R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Apple", R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Apple", R.drawable.cherry);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Apple", R.drawable.mango);
            fruitList.add(mango);
        }
    }
}
