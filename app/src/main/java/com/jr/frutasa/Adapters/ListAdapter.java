package com.jr.frutasa.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jr.frutasa.ModelP;
import com.jr.frutasa.R;


import java.util.List;


public class ListAdapter extends ArrayAdapter<ModelP> {

    private List<ModelP> mList;
    private Context mContex;
    private int resourceLayout;

    public ListAdapter(@NonNull Context context, int resource, List<ModelP>  objects) {
        super(context, resource, objects);
        this.mList = objects;
        this.mContex = context;
        this.resourceLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null)
            view = LayoutInflater.from(mContex).inflate(R.layout.item_row, null);

            ModelP modelP = mList.get(position);

            ImageView imageView = view.findViewById(R.id.imageView);
            imageView.setImageResource(modelP.getImg());
            TextView Nombre = view.findViewById(R.id.NombreProducto);
            Nombre.setText(modelP.getNombreProducto());
            TextView Cantidad = view.findViewById(R.id.Cantidad);
            Cantidad.setText(modelP.getCantidad());
            TextView Precio = view.findViewById(R.id.Precio);
            Precio.setText(modelP.getPrecio());


            return view;

    }
}
