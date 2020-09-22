package com.example.viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 pager2;
    List<Data> images;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager2 = findViewById(R.id.pager2);
        images = new ArrayList<>();
        images.add(new Data("https://cdn.pixabay.com/photo/2018/01/11/09/40/woman-3075710_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/11/20/05/30/girl-3826593_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/02/13/10/05/sexy-3150354_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/01/11/09/40/woman-3075710_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/11/20/05/30/girl-3826593_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/02/13/10/05/sexy-3150354_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/01/11/09/40/woman-3075710_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/11/20/05/30/girl-3826593_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/02/13/10/05/sexy-3150354_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/01/11/09/40/woman-3075710_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/11/20/05/30/girl-3826593_960_720.jpg"));
        images.add(new Data("https://cdn.pixabay.com/photo/2018/02/13/10/05/sexy-3150354_960_720.jpg"));

        adapter = new Adapter(images, this);
        pager2.setAdapter(adapter);


    }
}