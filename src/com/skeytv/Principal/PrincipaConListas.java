package com.skeytv.Principal;
import com.skeytv.modelos.Pelicula;
import com.skeytv.modelos.Serie;
import com.skeytv.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipaConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Demon Slayer El tren infinito", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Your name", 2016);
        otraPelicula.evalua(10);
        var peliculaTotoro = new Pelicula("Mi vecino Totoro", 1988);
        peliculaTotoro.evalua(7);
        Serie naruto = new Serie("Naruto", 2002);

        //cambiamos <pelicula> por <titulo> ya que serie y pelicula son titulos
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaTotoro);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(naruto);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            //instanceof nos ayuda a comprobar si item es de un determinado tipo
            if (item instanceof Pelicula pelicula){
                System.out.println(pelicula.getClasificacion());
            }
        }


        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Ryan Castro");
        listaDeArtistas.add("Natanael Cano");
        listaDeArtistas.add("Feid");


        // Collections sirve para hacer una lista ordenada
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas no ordenada" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de titulos: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);
    }
}
