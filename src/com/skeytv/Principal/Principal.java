import com.skeytv.calculos.CalculadoraDeTiempo;
import com.skeytv.calculos.FiltroRecomendacion;
import com.skeytv.modelos.Episodio;
import com.skeytv.modelos.Pelicula;
import com.skeytv.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Demon Slayer El tren infinito", 2021);
        miPelicula.setDuracionEnMinutos(105);
        miPelicula.setIncluidoEnElPlan (true);

        //Se ejecuta ya que en el com.skeytv.modelos.Pelicula.java creamos un vod y se le agrego el sout (System.in.out)
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        miPelicula.evalua(9);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println("Media de evaluaciones de la película:" + miPelicula.calculaMedia());

        Serie naruto = new Serie("Naruto", 2002);
        naruto.setTemporadas(21);
        naruto.setMinutosPorEpisodio(23);
        naruto.setEpisodiosPorTemporadas(26);
        naruto.muestraFichaTecnica();
        System.out.println(naruto.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(naruto);
        System.out.println("Tiempo necesario para ver tus titulo: " + calculadora.getTiempoTotal());


        Pelicula otraPelicula = new Pelicula("Your name", 2016);
        otraPelicula.setDuracionEnMinutos(104);
        System.out.println(otraPelicula.getDuracionEnMinutos());

        otraPelicula.muestraFichaTecnica();

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Entra! Naruto");
        episodio.setSerie(naruto);
        episodio.setTotalVisualizaciones(500);

        filtroRecomendacion.filtra(episodio);

        //Pelicula: es una variable de referencia
        //despues del = es el tipo de objeto que vamos a tener
        //cambiamos Pelicula por var
        var peliculaTotoro = new Pelicula("Mi vecino Totoro", 1988);
        peliculaTotoro.setDuracionEnMinutos(86);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaTotoro);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        //nos da el tamaño de la lista(cuantos hay)
        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());

        //nos da el nombre y en qué número de la lista esta
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());

        System.out.println("toString de la película: " + listaDePeliculas.get(0).toString());

    }
}
