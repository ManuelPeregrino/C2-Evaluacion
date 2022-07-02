package com.upchiapas.evaluacionc2.models;
import com.upchiapas.evaluacionc2.models.OrdenCompra;
import com.upchiapas.evaluacionc2.models.ItemCompra;

import java.util.Scanner;

public class TicketGenerator {

    public void ticketGen() {

        Switcher switcher = new Switcher();
        Cliente cliente = new Cliente();
        ItemCompra itemCompra = new ItemCompra();
        OrdenCompra ordenCompra = new OrdenCompra();
        Pizza pizza = new Pizza();

        System.out.println("Ingrese el numero de orden proporcionado");
        Scanner idTicket = new Scanner(System.in);
        String gc = cliente.getCompra(idTicket.nextLine());
        if (gc == ordenCompra.ct){

            double Total = pizza.getPrecio();
            System.out.println(Total);
        }
        switcher.MainMenu();
        }

    }

