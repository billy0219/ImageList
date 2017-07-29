package com.example.billy.imagelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        MyRecyclerAdapter adapter = new MyRecyclerAdapter(this, createItemList(), R.layout.item_row);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<ViewItem> createItemList() {
        List<ViewItem> items = new ArrayList<ViewItem>();
        for (int i = 0; i < 6; i++) {
            items.add(new ViewItem( R.drawable.a, "아이템"+i ));
            items.add(new ViewItem( R.drawable.b, "아이템"+i ));
            items.add(new ViewItem( R.drawable.c, "아이템"+i ));
            items.add(new ViewItem( R.drawable.d, "아이템"+i ));
            items.add(new ViewItem( R.drawable.e, "아이템"+i ));
            items.add(new ViewItem( R.drawable.f, "아이템"+i ));
        }
        return items;
    }
}