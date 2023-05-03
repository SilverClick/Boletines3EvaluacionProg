
package boletin33;


public class Seleccionador extends SeleccionFutbol {
     
    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }
    
    public void seleccionarXogador(){
        System.out.println("El seleccionador selecciona un jugador");
    }

    @Override
    public String toString() {
        return  "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad ;
    }

}
