
package boletin34.entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;
public abstract class Empregado {
     private String dni;
    private String nome;
    private String apelidos;
    private Calendar dataIngreso;

    public Empregado(String dni, String nome, String apelidos, int anoIngreso, int mesIngreso, int diaIngreso) {
        this.dni = dni;
        this.nome = nome;
        this.apelidos = apelidos;
        this.dataIngreso = new GregorianCalendar(anoIngreso, mesIngreso - 1, diaIngreso);
    }

    public abstract double calcularSoldo();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public Calendar getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(Calendar dataIngreso) {
        this.dataIngreso = dataIngreso;
    }
}

