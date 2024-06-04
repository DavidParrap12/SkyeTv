package com.skeytv.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Excelente calificacion");
        } else if (clasificacion.getClasificacion() >=2){
            System.out.println("Popular ahora mismo");
        } else {
            System.out.println("Agregalo a tu lista para verlo despues!");
        }
    }
}
