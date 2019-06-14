package com.example.applicationjp;

public class Dates {

    private String Fecha;
    private String Equipo1;
    private String Equipo2;
    private String Hora;
    private int Bandera1;
    private int Bandera2;

    public Dates(String fecha, String equipo1, String equipo2, String hora, int bandera1, int bandera2) {
        Fecha = fecha;
        Equipo1 = equipo1;
        Equipo2 = equipo2;
        Hora = hora;
        Bandera1 = bandera1;
        Bandera2 = bandera2;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public String getHora() {
        return Hora;
    }

    public int getBandera1() {
        return Bandera1;
    }

    public int getBandera2() {
        return Bandera2;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public void setEquipo1(String equipo1) {
        Equipo1 = equipo1;
    }

    public void setEquipo2(String equipo2) {
        Equipo2 = equipo2;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public void setBandera1(int bandera1) {
        Bandera1 = bandera1;
    }

    public void setBandera2(int bandera2) {
        Bandera2 = bandera2;
    }
}
