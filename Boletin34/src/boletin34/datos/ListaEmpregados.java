
package boletin34.datos;

import java.util.ArrayList;
import java.util.List;


import boletin34.entidades.Empregado;
public class ListaEmpregados {
    private static  List<Empregado> empregados;

    public ListaEmpregados() {
        empregados = new ArrayList<>();
    }

    public static void engadirEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public List<Empregado> obterEmpregados() {
        return empregados;
    }
}

