package com.upchiapas.evaluacionc2.models;

import java.util.Scanner;

public class Switcher {

    public void MainMenu(){

        CatalogoPizza cp = new CatalogoPizza();
        OrdenCompra oc = new OrdenCompra();
        TicketGenerator tg = new TicketGenerator();
        Sorter st = new Sorter();


        System.out.println("Bienvenido a la Pizzeria UP");
        System.out.println("Ingrese la opcion deseada..");
        System.out.println("1) Acceder al catalogo.....");
        System.out.println("2) Realizar pedido.........");
        System.out.println("3) Facturar................");
        System.out.println("4) Ordenar.................");
        System.out.println("5) Salir...................");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();

        switch (i){
            case 1:
                cp.MenuCatalogo();
                break;
            case 2:
                oc.orden();
                break;
            case 3:
                tg.ticketGen();
                break;
            case 4:
                st.Sorter();
                break;
            case 5:
                System.out.println("Gracias por usar nuestro sistema <3");
                break;
        }
    }
}
