package com.martelopez.mismascotasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import static com.martelopez.mismascotasapp.R.id.rvMascotas;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(rvMascotas);

        // Mostar el RecyclerView
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        iniciarListaMascotas();
        iniciarAdaptador();

    }

    public ContactoAdaptador adaptador;

    private void iniciarAdaptador() {

        adaptador = new MascotaAdaptador(Mascotas.this);
        listaMascotas.setAdapter(adaptador);
    }

    private void iniciarListaMascotas() {

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.dogboneblanco,"3",R.drawable.bulldog,"Bulldog",R.drawable.dogboneamarillo));
        mascotas.add(new Mascota(R.drawable.dogboneblanco,"3",R.drawable.bullterrier,"Bulldog",R.drawable.dogboneamarillo));
        mascotas.add(new Mascota(R.drawable.dogboneblanco,"3",R.drawable.dalmata,"Bulldog",R.drawable.dogboneamarillo));
        mascotas.add(new Mascota(R.drawable.dogboneblanco,"3",R.drawable.foxterrier,"Bulldog",R.drawable.dogboneamarillo));
        mascotas.add(new Mascota(R.drawable.dogboneblanco,"3",R.drawable.rottweiler,"Bulldog",R.drawable.dogboneamarillo));

    }
}
