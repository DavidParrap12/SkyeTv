package com.skeytv.calculos;
import com.skeytv.modelos.Pelicula;
import com.skeytv.modelos.Serie;
import com.skeytv.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
