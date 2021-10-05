package com.jr.frutasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.jr.frutasa.Adapters.CargoAdapter;
import com.jr.frutasa.Clases.Cargo;

import java.util.ArrayList;

public class FormularioActivity extends AppCompatActivity implements View.OnClickListener {


    private ArrayList<Cargo> CargoList = new ArrayList<Cargo>();
    private Button btnGUARDAR;
    private EditText editTextNombreCargo;
    private EditText editTextIDCargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        editTextIDCargo = findViewById(R.id.editTextIDCargo);
        editTextNombreCargo = findViewById(R.id.editTextNombreCargo);
        btnGUARDAR = findViewById(R.id.btnGUARDAR);
        btnGUARDAR.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int IDCargo = Integer.parseInt(editTextIDCargo.getText().toString());
        String NombreCargo = editTextNombreCargo.getText().toString();
        if (view.getId() == R.id.btnGUARDAR){
            Toast.makeText(this, "id: " + IDCargo + "Nombre Cargo: " + NombreCargo, Toast.LENGTH_SHORT).show();
            CargoList.add(new Cargo(NombreCargo, IDCargo));

            /*Intent intent = new Intent(this,CargoActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("listaCargo",  CargoList);
            intent.putExtras(bundle);
            this.startActivity(intent);*/

            Intent intent = new Intent();
            intent.putExtra("CargoList" , CargoList);

            editTextIDCargo.setText("");
            editTextNombreCargo.setText("");
        }

    }
}