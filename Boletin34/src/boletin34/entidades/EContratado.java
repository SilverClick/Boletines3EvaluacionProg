
package boletin34.entidades;

import java.util.Calendar;

public class EContratado extends Empregado {
    private double soldoBasico;
    private int anosTraballados;

    public EContratado(String dni, String nome, String apelidos, int ano, int mes, int dia,
            double soldoBasico, int anosTraballados) {
        super(dni, nome, apelidos, ano, mes, dia);
        this.soldoBasico = soldoBasico;
        this.anosTraballados = anosTraballados;
    }

    @Override
    public double calcularSoldo() {
        double soldo = soldoBasico;
        if (anosTraballados >= 0 && anosTraballados <= 3) {
            soldo *= 1.05;
        } else if (anosTraballados >= 4 && anosTraballados <= 7) {
            soldo *= 1.1;
        } else if (anosTraballados >= 8 && anosTraballados <= 15) {
            soldo *= 1.15;
        } else if (anosTraballados > 15) {
            soldo *= 1.2;
        }
        return soldo;
    }
}
