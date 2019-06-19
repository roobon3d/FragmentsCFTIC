package com.example.fragmentscftic.libros;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragmentscftic.R;

public class LibroActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro);

        FragmentManager fm = getSupportFragmentManager();

        FragmentListado frgListado = (FragmentListado)fm.findFragmentById(R.id.FrgListado);

        frgListado.setLibrosListener(this);
    }


    public void onLibroSeleccionado(Libro c) {

        FragmentManager fm = getSupportFragmentManager();

        FragmentDetalle fd = (FragmentDetalle)fm.findFragmentById(R.id.FrgDetalle); //el casting que no falte ;)

        fd.mostrarDetalle(c.getResumen());
    }
}
