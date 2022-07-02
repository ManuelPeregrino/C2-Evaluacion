package com.upchiapas.evaluacionc2.models;

public class ItemCompra {

    public ItemCompra() {
    }

    private String ClienteTicket;

    public String getClienteTicket() {
        return ClienteTicket;
    }

    public void setClienteTicket(String clienteTicket) {
        ClienteTicket = clienteTicket;
    }

    public float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(float subtotal) {
        Subtotal = subtotal;
    }

    private float Subtotal;

}
