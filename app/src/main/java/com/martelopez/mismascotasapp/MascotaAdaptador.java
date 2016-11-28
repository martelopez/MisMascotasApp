package com.martelopez.mismascotasapp;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by emartelopez on 28/11/16.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    // Clase para invocar el meodo constructor y pasarla al objeto de la clase
    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas(this);
        this.activity(this);
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaAdaptador.MascotaViewHolder holder, int position) {

        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
