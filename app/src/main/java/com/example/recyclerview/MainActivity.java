package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ba,"reem","roma"));
        exampleList.add(new ExampleItem(R.drawable.baby,"aya","diva"));
        exampleList.add(new ExampleItem(R.drawable.ba,"mona","mama"));
        exampleList.add(new ExampleItem(R.drawable.ic_sunny_24,"mosad","baba"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"mettwally","medo"));
        exampleList.add(new ExampleItem(R.drawable.baby,"rana","ranosha"));
        exampleList.add(new ExampleItem(R.drawable.banota,"ahmed","medo"));
        exampleList.add(new ExampleItem(R.drawable.ba,"fatma","miky"));
        exampleList.add(new ExampleItem(R.drawable.baby,"toka","tota"));
        exampleList.add(new ExampleItem(R.drawable.ba,"Line1","Line2"));
        exampleList.add(new ExampleItem(R.drawable.banota,"Line3","Line4"));
        exampleList.add(new ExampleItem(R.drawable.baby,"Line5","Line6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line1","Line2"));
        exampleList.add(new ExampleItem(R.drawable.ba,"Line3","Line4"));
        exampleList.add(new ExampleItem(R.drawable.ic_sunny_24,"Line5","Line6"));
        exampleList.add(new ExampleItem(R.drawable.ba,"Line1","Line2"));


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}