    package com.skeytv.Principal;

    import com.google.gson.FieldNamingPolicy;
    import com.google.gson.Gson;
    import com.google.gson.GsonBuilder;
    import com.skeytv.modelos.Titulo;
    import com.skeytv.modelos.TituloOmdb;

    import java.io.FileWriter;
    import java.io.IOException;
    import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpRequest;
    import java.net.http.HttpResponse;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class PrincipalConBusqueda {
        public static void main(String[] args) throws IOException, InterruptedException {
            /* Solicitamos que ingrese la pelicula*/
            Scanner lectura = new Scanner(System.in);
            List<Titulo> titulos = new ArrayList<>();
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();

            while(true){
                System.out.println("Escribe el nombre de la pelicula: ");
                var busqueda = lectura.nextLine();

                if (busqueda.equalsIgnoreCase("Salir")){
                    break;
                }

                //nos ayuda a conectar con la variable busqueda, para asi mismo obtener un resultado conectado con la api
                String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey=f1e17984";

                /* conectamos el api a traves del String direccion, por medio del request y reponse*/
                try{
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(direccion))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    System.out.println(json);

                    // Esto nos ayuda a obtener los resultados apis organizado


                    TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class );
                    System.out.println(miTituloOmdb);

                    Titulo miTitulo = new Titulo(miTituloOmdb);
                    System.out.println("Titulo ya convertido: " + miTitulo);

                    FileWriter escritura = new FileWriter("peliculas.txt");
                    escritura.write(miTitulo.toString());
                    escritura.close();

                    titulos.add(miTitulo);
                }catch (NumberFormatException e) {
                    System.out.println("Ocurrió un error: ");
                    System.out.println(e.getMessage());
                }catch (IllegalArgumentException e){
                    System.out.println("Error en la URI, Verifique la dirección. ");
                }
            }
            System.out.println(titulos);

            FileWriter escritura = new FileWriter("titulos.json");
            escritura.write(gson.toJson(titulos));
            escritura.close();


            System.out.println("Finalizo la ejecución del programa! ");
        }
    }
