
package boletin33;


public class Futbolista extends SeleccionFutbol {
   private Integer dorsal;
    private String demarcacion;

    public Futbolista(Integer dorsal, String demarcacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    
    
    
    public void entrevista(){
        System.out.println("Entrevistan al futbolista");
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega un partido");
    }

    @Override
    public String toString() {
        return super.toString()+ " dorsal=" + dorsal + ", demarcacion=" + demarcacion ;
    }

   
    }

   
    


