package com.upchiapas.evaluacionc2.models;

public class MenuPredeterminado {

    public void menuPredeterminado() {
        System.out.println("¬Especialidades de la casa¬");

        System.out.println("\nPizzas de Pepperoni");

        Pizza[][] arr1 = {

                {new Pizza(1, "Pepperoni", "C", 100)},
                {new Pizza(2, "Pepperoni", "M", 150)},
                {new Pizza(3, "Pepperoni", "G", 200)},

        };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPizzas Hawaianas");
        Pizza[][] arr2 = {

                {new Pizza(4, "Hawaiana", "C", 100)},
                {new Pizza(5, "Hawaiana", "M", 150)},
                {new Pizza(6, "Hawaiana", "G", 100)},
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPizzas Mexicanas");
        Pizza[][] arr3 = {

                {new Pizza(7, "Mexicana", "C", 100)},
                {new Pizza(8, "Mexicana", "M", 150)},
                {new Pizza(9, "Mexicana", "G", 200)}
        };

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
