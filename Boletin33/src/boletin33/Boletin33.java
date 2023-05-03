
package boletin33;

import java.util.ArrayList;


public class Boletin33 {

  
    public static void main(String[] args) {
       ArrayList<SeleccionFutbol> coleccion = new ArrayList<>();
  coleccion.add (new Futbolista(2,"delantero",34,"Lorenzo","Noguerira",18));
   coleccion.add (new Entrenador(6,18,"Ruben","Noguerira",19));
    coleccion.add (new Masajista("Licenciado",5,20,"Alejandr","Iglesias",25));
     coleccion.add (new Seleccionador(25,"Juan","Arca",30));
  
  // Exibe os atributos de cada objeto na lista
        for (SeleccionFutbol colec : coleccion) {
            System.out.println(colec.getClass().getSimpleName() + ": " + colec.toString());
        }
    
}
}
