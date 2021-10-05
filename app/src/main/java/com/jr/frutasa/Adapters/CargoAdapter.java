package com.jr.frutasa.Adapters;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jr.frutasa.Clases.Cargo;
import com.jr.frutasa.Modelo.Car.Car;
import com.jr.frutasa.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CargoAdapter extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Cargo> cargo;

    public CargoAdapter(Activity activity, ArrayList<Cargo> cargo) {
        this.activity = activity;
        this.cargo = cargo;
    }

    @Override
    public int getCount() {
        return cargo.size();
    }

    @Override
    public Object getItem(int i) {
        return cargo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        View v = convertView;
        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.itemcargo, null);
        }
        Cargo cargoElement = cargo.get(i);

        TextView txtNombreCargo = v.findViewById(R.id.txtName);
        txtNombreCargo.setText(cargoElement.getNombreCargo());

       TextView txtId = v.findViewById(R.id.txtID);
       txtId.setText(cargoElement.getID() + "");


        return v;

    }
}
