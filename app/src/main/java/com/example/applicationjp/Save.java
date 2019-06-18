package com.example.applicationjp;

public class Save {
    private String Equipos;
    private String Result1;
    private String Result2;
    private int Bandera1;
    private int Bandera2;



    public Save(String equipos, String result1, String result2, int bandera1, int bandera2) {
        Equipos = equipos;
        Result1 = result1;
        Result2 = result2;
        Bandera1 = bandera1;
        Bandera2 = bandera2;
    }


    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String equipos) {
        Equipos = equipos;
    }

    public String getResult1() {
        return Result1;
    }

    public void setResult1(String result1) {
        Result1 = result1;
    }

    public String getResult2() {
        return Result2;
    }

    public void setResult2(String result2) {
        Result2 = result2;
    }

    public int getBandera1() {
        return Bandera1;
    }

    public void setBandera1(int bandera1) {
        Bandera1 = bandera1;
    }

    public int getBandera2() {
        return Bandera2;
    }

    public void setBandera2(int bandera2) {
        Bandera2 = bandera2;
    }
}

