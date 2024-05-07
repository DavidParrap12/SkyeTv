package com.skeytv.modelos;

import com.skeytv.modelos.Anime;

public class Principal {

    public static void main(String[] args) {
        Anime miAnime = new Anime();
        miAnime.setNombre("Demon Slayer");
        miAnime.setFechaDeLanzamiento(2019);
        miAnime.setCapitulos (26) ;
        miAnime.setTemporadas (4);

        //Se ejecuta ya que en el com.skeytv.modelos.Anime.java creamos un vod y se le agrego el sout (System.in.out)
        miAnime.muestraFichaTecnica();
        miAnime.evalua(10);
        miAnime.evalua(7.8);
        miAnime.evalua(9);
        System.out.println(miAnime.getTotalDeLasEvaluaciones());
        System.out.println(miAnime.calculaMedia());






















//        com.skeytv.modelos.Anime otroAnime = new com.skeytv.modelos.Anime();
//        otroAnime.nombre = "Naruto";
//        otroAnime.fechaDeLanzamiento = 2002;
//        otroAnime.capitulos = 220;
//        otroAnime.temporadas = 9;
//
//      //  otroAnime.muestraFichaTecnica();
    }
}
