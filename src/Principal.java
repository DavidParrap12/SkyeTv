public class Principal {

    public static void main(String[] args) {
        Anime miAnime = new Anime();
        miAnime.nombre = "Demon Slayer";
        miAnime.fechaDeLanzamiento = 2019;
        miAnime.capitulos = 26 ;
        miAnime.temporadas = 4;

        //Se ejecuta ya que en el Anime.java creamos un vod y se le agrego el sout (System.in.out)
        miAnime.muestraFichaTecnica();
        miAnime.evalua(8.5);
        miAnime.evalua(9.0);

        System.out.println(miAnime.sumaDeLasEvaluaciones);

        Anime otroAnime = new Anime();
        otroAnime.nombre = "Naruto";
        otroAnime.fechaDeLanzamiento = 2002;
        otroAnime.capitulos = 220;
        otroAnime.temporadas = 9;

        otroAnime.muestraFichaTecnica();
    }
}
