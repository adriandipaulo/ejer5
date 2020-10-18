package com.adriandipaulo.petapp;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.adriandipaulo.petapp.BD.BaseDatos;
import com.adriandipaulo.petapp.adaptadores.MyAdapter;

import java.util.ArrayList;

public class Pantalla2 extends AppCompatActivity {
    private static ArrayList<Mascotas> mascotas=new ArrayList<Mascotas>();
    private static Context context;
    private RecyclerView listaMascotas;
    Activity activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        Toolbar miActionBar=(Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        findViewById(R.id.estrella5).setVisibility(View.INVISIBLE);
        findViewById(R.id.space1).setVisibility(View.GONE);


        listaMascotas = (RecyclerView) findViewById(R.id.recyclerViewMascota2);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarAdpatador();
    }

    public MyAdapter adaptador;
    private void inicializarAdpatador (){
        adaptador = new MyAdapter(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }
    public static ArrayList<Mascotas> cargarMascotas(String n, Integer v, Integer f, Integer id){
        Mascotas xx=new Mascotas(n,v,f,id);
        if (mascotas.size()<=4){
            mascotas.add(xx);
            BaseDatos conn;
            conn = new BaseDatos(context,
                    "bd_mascotas",
                    null,
                    1);
            SQLiteDatabase db=conn.getWritableDatabase();
            ContentValues values=new ContentValues();
            values.put("nombreMascota","PEPE");
            values.put("votoMascota",1);
            values.put("fotoMascota",1);
            values.put("id_mascota",1);
            db.insert("mascota",null,values);
            db.close();
        }
        return mascotas;
    }

    }


