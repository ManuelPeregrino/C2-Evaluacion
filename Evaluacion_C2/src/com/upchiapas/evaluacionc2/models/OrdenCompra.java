package com.upchiapas.evaluacionc2.models;
import com.upchiapas.evaluacionc2.models.CatalogoPizza;
import com.upchiapas.evaluacionc2.models.Cliente;

import java.util.ArrayList;

import java.util.Scanner;

public class OrdenCompra {

    public String ct;
    public void orden(){

        Switcher switcher = new Switcher();
        ItemCompra itemCompra = new ItemCompra();
        Cliente cliente = new Cliente();
        Pizza pizza = new Pizza();
        ArrayList<Cliente> queue = new ArrayList<>();
        MenuPredeterminado menu1 = new MenuPredeterminado();


        System.out.println("Estas son las pizzas disponibles");
        menu1.menuPredeterminado();
        System.out.println("...Ingrese su orden...");
        System.out.println("Ingrese su nombre");
        Scanner nombre = new Scanner(System.in);
        cliente.setNombre(nombre.nextLine());
        System.out.println("Ingrese la pizza que desea ordenar");
        Scanner id = new Scanner(System.in);
        pizza.setId(id.nextInt());
        queue.add(new Cliente());


        System.out.println("Orden generada");
        System.out.println("Su orden es la numero: " + cliente.getnCompra());
        ct = String.valueOf(cliente.getnCompra());
        itemCompra.getClienteTicket();
        System.out.println();


        System.out.println("Presione una tecla para continuar... \nEn un momento se le entrega su pizza");
        Scanner retorno = new Scanner(System.in);
        retorno.nextLine();
        switcher.MainMenu();
    }
}

