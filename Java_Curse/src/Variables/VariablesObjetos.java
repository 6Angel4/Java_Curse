package Variables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

public class VariablesObjetos {
    public static void main(String[] args) {
        //Object: String
        String nombre = "Miguel";
        System.out.println(nombre);

        /*
            Object: Wrappers
            Integer
            Double
            Boolean
         */
        Integer edad = 30;  //Contiene un int
        Double salario = 30.50;  //Contiene un double
        Boolean esEmpleado = true;   //Contiene un boolean

        System.out.println(edad + "\n" + salario + "\n" + esEmpleado);

        //Object: List [Lista que se puede redimensionar (un array no puede hacer eso)]
        ArrayList<String> listaNombres = new ArrayList<>(); //Creacion e instancia de una lsita que recibe Strings
        listaNombres.add("Miguel");
        listaNombres.add("Angel");
        listaNombres.add("Jocelyn");
        System.out.println("Lista de nombres: "+listaNombres);

        //Object: HashMap [Mapas (clave, valor)]
        HashMap<String, Integer> mapaEdades = new HashMap<String, Integer>();
        mapaEdades.put("Ana", 28);
        mapaEdades.put("Luis", 35);
        mapaEdades.put("Carlos", 40);
        System.out.println("Mapa de edades: " + mapaEdades);

        //Object: Date [Para saber la fecha y hora]
        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual);
    }
}
