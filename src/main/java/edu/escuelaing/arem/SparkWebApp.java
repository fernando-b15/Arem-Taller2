package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
import static spark.Spark.*;

import spark.Request;
import spark.Response;

public class SparkWebApp 
{
	/**
     * Este metodo main inicia el servidor SparkWebApp y define algunas peticiones y respuestas haciendo uso 
     * de algunas funciones lambda
     */
	
    public static void main( String[] args )
    {
    	port(getPort());
    	get("/", (req, res) ->  inputView(req, res));
    	get("/results", (req, res) -> resultsView(req, res));
    }
    
    /**
    *Este metodo contruye la vista inputView apartir del string html view que retorna  
    *
    * @param req Tiene la informacion de la petición que llega al servidor.
    * @param res Tiene la información con la respuesta del servidor.
    * @return String con la informacion html de la vista de entrada.
    */
    
    private static String  inputView(Request req, Response res) {
        String view = "<!DOCTYPE html>"
                + "<html>"
                + "<body style=\"background-color:#CCCC00;\">"
                +"<center>"
                + "<h2>Calculadora de Media y Desviacion estandar</h2>"
                + "  <br><br>"
				+ "<h2>Intrucciones : Porfavor ingrese todos los datos que desee separados por una coma ,para los valores flotantes uso un punto para separa la parte entera de la real y por ultimo oprima el boton de calcular para obtener los resultados</h2>"
				+ "<h2>Ejemplo : {2,3,5.6,7,8,9,3.5,4,1.8}</h2>"
				+ "<form action=\"/results\">"
                + "  Datos  = {"
                + "  <input type=\"text\" name=\"datos\">"
                +"    }"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Calcular\">"
                + "</form>"
                +"</center>"
                + "</body>"
                + "</html>";
        return view;
    }
    
    /**
    *Este metodo contruye la vista resultView apartir un req que le envia inputView y asi retorna
    *un res html con la informacion de la view  
    *
    * @param req Tiene la informacion de la petición que llega al servidor.
    * @param res Tiene la información con la respuesta del servidor.
    * @return String con la informacion html de la vista de entrada.
    */
    
    private static String resultsView(Request req, Response res) {
    	 String datos[] = req.queryParams("datos").split(",");
    	 listaEnlazada linkedlist = new listaEnlazada();
    	 for(String d:datos) {
    		 linkedlist.add(Double.parseDouble(d));
    	 }
    	 double media = linkedlist.getMean();
    	 double desviacionEstandar = linkedlist.getStandardDesviation();
    	 String view = "<!DOCTYPE html>"
                 + "<html>"
                 + "<body style=\"background-color:#32CD32;\">"
                 + "<style>"
                 + "table, th, td {"
                 + "border: 1px solid black;"
                 + "border-collapse: collapse;"
                 + "}"
                 + "</style>"
                 +"<center>"
                 + "<h2>Calculadora de Media y Desviacion estandar</h2>"
                 + "  <br><br>"
 				 + "<h2>Acontinuacion encontrara una tabla con sus respectivos resultados"
 				 + "  <br><br>"
 				 + "<Table>"
 				 + "<tr>"
 			     + "<th>Mean</th>"
 			     + "<th>Standard Deviation</th>"
 			  	 + "</tr>"
 			  	 + "<tr>"
 			     + "<td>"+String.valueOf(media)+"</td>"
 			     + "<td>"+String.valueOf(desviacionEstandar)+"</td>"
 			     + "</tr>"
 			     + "</Table>"
                 +"</center>"
                 + "</body>"
                 + "</html>";
         return view;
    }
    
    /**
     *Este metodo se encarga de retonar el puerto por defecto que esta definido en una variable de entorno 
     *para correr el servidor web sobre ese puerto.
     */
    
    static int getPort() {
    	 if (System.getenv("PORT") != null) {
    		 return Integer.parseInt(System.getenv("PORT"));
    	 }
    	 return 4567; //returns default port if heroku-port isn't set
    }
}
