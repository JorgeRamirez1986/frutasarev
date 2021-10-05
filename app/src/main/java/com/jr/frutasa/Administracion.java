package com.jr.frutasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Administracion extends AppCompatActivity implements View.OnClickListener {

    private Button btnFormulario;
    private Button btnModificacion;
    private Button btnCargo;
    private Button btnListar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administracion);
        btnFormulario = findViewById(R.id.btnFormulario);
        btnModificacion = findViewById(R.id.btnModificacion);
        btnCargo = findViewById(R.id.btnCargo);
        btnListar = findViewById(R.id.btnListar);

        btnFormulario.setOnClickListener(this);
        btnCargo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnFormulario){
            Intent i = new Intent(getApplicationContext(), FormularioActivity.class);
            startActivity(i);
        }else if(view.getId() == R.id.btnCargo){
                Intent i = new Intent(getApplicationContext(), CargoActivity.class);
                startActivity(i);
        }
    }
}