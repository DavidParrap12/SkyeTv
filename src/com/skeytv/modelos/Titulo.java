package com.skeytv.modelos;
public class Titulo {

    public class Anime {
        private String nombre;
        private int fechaDeLanzamiento;
        private int capitulos;
        private int temporadas;
        private boolean incluidoEnElPlan;
        private double sumaDeLasEvaluaciones;
        private int totalDeLasEvaluaciones;


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
            this.fechaDeLanzamiento = fechaDeLanzamiento;
        }

        public void setCapitulos(int capitulos) {
            this.capitulos = capitulos;
        }

        public void setTemporadas(int temporadas) {
            this.temporadas = temporadas;
        }

        public int getTotalDeLasEvaluaciones(){
            return totalDeLasEvaluaciones;
        }

        public void muestraFichaTecnica(){
            System.out.println("El anime es: " + nombre);
            System.out.println("Salio en el año: " + fechaDeLanzamiento);
            System.out.println("Tiene: " + capitulos + " Capitulos");
            System.out.println("Tiene: " + temporadas + " temporadas");
        }

        //no necesita retornar nada
        public void evalua(double nota) {
            sumaDeLasEvaluaciones += nota;
            totalDeLasEvaluaciones++;
        }

        public double calculaMedia(){
            return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
        }
    }
}
