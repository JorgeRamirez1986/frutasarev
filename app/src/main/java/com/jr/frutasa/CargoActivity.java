package com.jr.frutasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.jr.frutasa.Adapters.CargoAdapter;
import com.jr.frutasa.Clases.Cargo;

import java.util.ArrayList;

public class CargoActivity extends AppCompatActivity {

    private ListView ListCargo;
    private ArrayList<Cargo> cargoArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargo);
        ListCargo = findViewById(R.id.listViewCargo);
       // cargoArrayList = (ArrayList<Cargo>) getIntent().getSerializableExtra("CargoList");
        cargoArrayList.add(new Cargo("Mantenimiento", 618));
        cargoArrayList.add(new Cargo("Sistemas", 666));
        cargoArrayList.add(new Cargo("Gerencia", 600));
       // Bundle bundle = getIntent().getExtras();
      //  ArrayList<Cargo> cargoArrayList = bundle.getParcelableArrayList("CargoList");


        CargoAdapter adapter = new CargoAdapter(CargoActivity.this, cargoArrayList);
        ListCargo.setAdapter(adapter);

    }
}