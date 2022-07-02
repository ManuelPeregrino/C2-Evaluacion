package com.upchiapas.evaluacionc2.models;

import java.util.LinkedList;
import java.util.Scanner;

public class MenuGenerator {
    LinkedList<Pizza> linkedList = new LinkedList<>();
    public void MenuGenerator() {


        Pizza pizza = new Pizza();

        System.out.println("Bienvenido al creador de Menus");
        System.out.println("\n Ingrese los datos solicitados a continuacion...");

        System.out.println("Ingrese el ID de su Pizza...");
        Scanner teclado1 = new Scanner(System.in);
        pizza.setId(teclado1.nextInt());
        System.out.println("Ingrese el nombre de la especialidad...");
        Scanner teclado2 = new Scanner(System.in);
        pizza.setEspecialidad(teclado2.nextLine());
        System.out.println("Ingrese el tamaño de la pizza en formato caracter (C, M, G)...");
        Scanner teclado3 = new Scanner(System.in);
        pizza.setTamaño(teclado3.nextLine());
        System.out.println("Ingrese el precio de la pizza agregada");
        Scanner teclado4 = new Scanner(System.in);
        pizza.setPrecio(teclado4.nextInt());
        linkedList.add(new Pizza());
        String lista = "" + linkedList;
        System.out.println("Pizza agregada");

        System.out.println("Su menu queda así:");
        System.out.println(lista);

        System.out.println("¿Desea agregar otra Pizza?");
        System.out.println("1) Si");
        System.out.println("2) No");



    }
}