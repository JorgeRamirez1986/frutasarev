package com.jr.frutasa.Modelo.Car;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.view.View;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jr.frutasa.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CarAdapter extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<Car> cars;

    public CarAdapter(Activity activity, ArrayList<Car> cars) {
        this.activity = activity;
        this.cars = cars;
    }

    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.activity_main, null);
        }
        Car carElement = cars.get(position);

        TextView txtNameCar = v.findViewById(R.id.txtCarName);
        txtNameCar.setText(carElement.getName());

        TextView txtDescription = v.findViewById(R.id.txtDescription);
        txtDescription.setText(carElement.getDescription());

        TextView txtInformation = v.findViewById(R.id.txtInformation);
        txtInformation.setText(carElement.getModel() + "Valor" + carElement.getPrice());

        ImageView img = v.findViewById(R.id.imgCar);
        Picasso.get().load(carElement.getUrlImage()).into(img);


        return v;
    }
}



