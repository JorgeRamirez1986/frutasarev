package com.jr.frutasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.jr.frutasa.Modelo.Car.Car;
import com.jr.frutasa.Modelo.Car.CarAdapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lstCar;
    private ArrayList<Car> cars = new ArrayList<Car>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstCar = findViewById(R.id.listViewCars);
        cars.add(new Car ( "Spark", "carro grande", "https://www.motor.com.co/files/article_multimedia/uploads/2018/07/19/5b50eafc9e808.jpeg", "30000000", "2015"));
        cars.add(new Car ( "RIO", "carro grande", "https://www.motor.com.co/files/article_multimedia/uploads/2018/07/19/5b50eafc9e808.jpeg", "30000000", "2015"));

        cars.add(new Car ( "Vitara", "carro grande", "https://www.elcarrocolombiano.com/wp-content/uploads/2020/01/20200131-CARROS-MAS-VENDIDOS-DEL-MUNDO-2019-05.jpg", "30000000", "2015"));
        CarAdapter adapter = new CarAdapter(this, cars);// se le pasa la actividad y el array
        lstCar.setAdapter(adapter);
        lstCar.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Ha seleccionado el carro" +cars.get(position), Toast.LENGTH_SHORT).show();
    }


}
