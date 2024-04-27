public class Anime {
    String nombre;
    int fechaDeLanzamiento;
    int capitulos;
    int temporadas;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeLasEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El anime es: " + nombre);
        System.out.println("Salio en el año: " + fechaDeLanzamiento);
        System.out.println("Tiene: " + capitulos + " Capitulos");
        System.out.println("Tiene: " + temporadas + " temporadas");
    }

//no necesita retornar nada
    void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
