
package boletin33;

public class Entrenador extends SeleccionFutbol{
    private Integer idFederacion;

    public Entrenador(Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "idFederacion=" + idFederacion ;
    }
    
    
    
    public void planificarEntrenamiento(){
        System.out.println("El entrenador planifica un partido");
    }
    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra");
    }

    
    @Override
    public void viajar() {
        System.out.println("El entrenadora viaja");
    }

    }

