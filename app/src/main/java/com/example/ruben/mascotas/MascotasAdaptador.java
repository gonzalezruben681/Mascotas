package com.example.ruben.mascotas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotasViewHolder> {

    ArrayList<DataSet> mascota;
    Activity activity;

    public MascotasAdaptador(ArrayList<DataSet> mascota, Activity activity) {
        this.mascota = mascota;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder mascotasViewHolder, int position) {
        final DataSet mascotas = mascota.get(position);
        mascotasViewHolder.nombre.setText(mascotas.getNombre());
        mascotasViewHolder.raiting.setText(mascotas.getRaiting());
        mascotasViewHolder.perro.setImageResource(mascotas.getFoto());

    }

    @Override
    public int getItemCount() {
        return mascota.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre;
        private TextView raiting;
        private ImageView perro;

        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.tvNombreCV);
            raiting = (TextView) itemView.findViewById(R.id.tvRaitingCV);
            perro = (ImageView) itemView.findViewById(R.id.imgPerro);

        }
    }

}
