package com.upchiapas.evaluacionc2.models;

public class Cliente {

    private String nombre;
    private byte tOrden; //Tipo de orden
    private int nCompra; //Numero de compra
    private int pCompra; //Posicion de compra
    private String compra;

    public Cliente() {
    }

    public Cliente(String nombre, byte tOrden, int nCompra, int pCompra, String compra) {
        this.nombre = nombre;
        this.tOrden = tOrden;
        this.nCompra = nCompra;
        this.pCompra = pCompra;
        this.compra = compra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte gettOrden() {
        return tOrden;
    }

    public void settOrden(byte tOrden) {
        this.tOrden = tOrden;
    }

    public int getnCompra() {
        return nCompra;
    }

    public void setnCompra(int nCompra) {
        this.nCompra = nCompra;
    }

    public int getpCompra() {
        return pCompra;
    }

    public void setpCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public String getCompra(String s) {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }
}

