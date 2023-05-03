
package boletin33;


public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private Integer anosExperiencia;

    public Masajista(String titulacion, Integer añosExperiencia, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()+ "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia ;
    }
    
    
    
    public void darMasaje(){
            System.out.println("El masajista da un masaje");
    }
            
             @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    
    @Override
    public void viajar() {
        System.out.println("El masajista viaja");
    }

}

