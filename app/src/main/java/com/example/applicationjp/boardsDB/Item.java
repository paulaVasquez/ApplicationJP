package com.example.applicationjp.boardsDB;

public class Item {
    private Integer id;
    private String nombre;
    private String resultado;

    public Item(Integer id, String nombre, String resultado) {
        this.id = id;
        this.nombre = nombre;
        this.resultado = resultado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
