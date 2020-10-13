package com.example.ruben.mascotas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaMascotas extends AppCompatActivity {

    private ArrayList<DataSet> mascotas;
    private RecyclerView listaMascotas;
    Toolbar toolbar;
    private TextView titleToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascotas);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas1);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //para dar soporte al boton de atras para la app
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public MascotasAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotasAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<DataSet>();

        mascotas.add(new DataSet("Perro y hueso","3",R.drawable.perros_uno));
        mascotas.add(new DataSet("San Bernardo","4",R.drawable.perros_dos));
        mascotas.add(new DataSet("Rocky","4",R.drawable.perros_tres));
        mascotas.add(new DataSet("Husky Siberiano","4",R.drawable.perros_cuatro));
        mascotas.add(new DataSet("Cschorro","4",R.drawable.perros_cinco));
    }
}