package com.example.fragmentscftic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragmentscftic.libros.LibroActivity;
import com.example.fragmentscftic.tablayout.TabLayoutActivity;
import com.example.fragmentscftic.viewpager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ppal);

        startActivity(new Intent(this, TabLayoutActivity.class));
        //startActivity(new Intent(this, LibroActivity.class));
        //startActivity(new Intent(this, ViewPagerActivity.class));
    }
}
