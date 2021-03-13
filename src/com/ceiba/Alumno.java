package com.ceiba;

public class Alumno {
    String codigo;
    String nombre;
    Double notaParcial;
    Double notaFinal;

    public Alumno(String codigo, String nombre, Double notaParcial, Double notaFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notaParcial = notaParcial;
        this.notaFinal = notaFinal;
    }

    public double CalcularPromedio(){
        return (this.notaParcial+this.notaFinal)/2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(Double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
