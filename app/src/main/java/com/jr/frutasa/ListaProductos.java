package com.jr.frutasa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListaProductos extends AppCompatActivity {

    private ListView mListViewPro;
    private List<ModelP> mList = new ArrayList<>();
    ListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);

        mListViewPro = findViewById(R.id.ListView);
        mList.add(new ModelP("Manzana",12, 800,R.mipmap.ic_launcher));

        mAdapter = new ListAdapter(ListaProductos.this, R.layout.item_row, mList);
        mListViewPro.setAdapter(mAdapter);
    }
}