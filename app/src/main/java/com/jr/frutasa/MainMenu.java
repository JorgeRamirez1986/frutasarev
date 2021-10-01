package com.jr.frutasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button btnAdmin;
    private Button btnProductos;
    private Button btnVentas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdmin = findViewById(R.id.btnAdmin);
        btnProductos = findViewById(R.id.btnProductos);
        btnVentas = findViewById(R.id.btnVentas);
        btnVentas.setOnClickListener(this::onClick);
        btnProductos.setOnClickListener(this::onClick);
        btnAdmin.setOnClickListener(this::onClick);

    }
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnAdmin:
                intent = new Intent(this, Administracion.class);
                //intent.putExtra("Nombre", txtNombre.getText().toString());
                startActivity(intent);
                break;
            case R.id.btnProductos:
                intent = new Intent(this, Productos.class);
                //intent.putExtra("Nombre", txtNombre.getText().toString());
                startActivity(intent);
                //Toast.makeText(this, "Ingreso Por Medio de La calculadora", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnVentas:
                intent = new Intent(this, Ventas .class);
                //intent.putExtra("Nombre Usuario", txtNombre.getText().toString());
                startActivity(intent);
                //Toast.makeText(this, "Ingreso por Medio del Conversor", Toast.LENGTH_LONG).show();
        }
    }
}