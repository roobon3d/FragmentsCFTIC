package com.example.fragmentscftic.libros;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fragmentscftic.R;

public class AdapterLibros  extends ArrayAdapter<Libro> {

    Activity context;
    Libro[] datos;

    AdapterLibros(Fragment context, Libro[] datos)
    {
        super(context.getActivity(), R.layout.list_item_libro, datos);
        this.context = context.getActivity();
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.list_item_libro, null);

        TextView lblDe = (TextView)item.findViewById(R.id.Titulo);
        lblDe.setText(datos[position].getTitulo());

        TextView lblAsunto = (TextView)item.findViewById(R.id.Autor);
        lblAsunto.setText(datos[position].getAutor());

        return(item);
    }
}