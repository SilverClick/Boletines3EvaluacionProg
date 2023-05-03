
package boletin34.presentacion;

import boletin34.datos.ListaEmpregados;
import boletin34.entidades.EContratado;
import boletin34.entidades.EDestajo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Boletin34 {
   

    public static void main(String[] args) {
        
        // Creamos los empleados
       EContratado e1 = new EContratado("11111111A", "Juan", "Pérez",2000,10,1, 1000.0,10);
        e1.setDataIngreso(new GregorianCalendar(2021, Calendar.MAY, 1)); // Le damos una fecha de salida para probar el cálculo del complemento
        EContratado e2 = new EContratado("22222222B", "María", "García",2005,8,16, 1200.0,2);
        EDestajo e3 = new EDestajo("33333333C", "Pedro", "Rodríguez",2017,12,7,20, 10);

        // Agregamos los empleados a la lista de empleados
        ListaEmpregados.engadirEmpregado(e1);
        ListaEmpregados.engadirEmpregado(e2);
        ListaEmpregados.engadirEmpregado(e3);

        // Mostramos la lista de empleados
       ListaEmpregados lista = new ListaEmpregados();
System.out.println(lista.toString());
    }
}


    

