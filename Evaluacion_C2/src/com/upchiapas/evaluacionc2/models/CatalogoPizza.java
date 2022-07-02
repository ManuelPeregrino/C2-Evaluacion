package com.upchiapas.evaluacionc2.models;

import com.upchiapas.evaluacionc2.models.Cliente;
import java.util.LinkedList;
import java.util.Scanner;

public class CatalogoPizza {

    public void MenuCatalogo(){
        System.out.println("¿Que funcion de menu desea realizar?");
        System.out.println("1) Mostrar Catalogo de especialidades");
        System.out.println("2) Crear catálogo");

        Scanner teclado = new Scanner(System.in);
        int S = teclado.nextInt();

        //Primer Menu
        switch (S) {
            case 1:
                MenuPredeterminado menu1 = new MenuPredeterminado();
                menu1.menuPredeterminado();
                Scanner confirm = new Scanner(System.in);
                int p = confirm.nextInt();
                //Primer submenu
                switch (p){
                    case 1:
                        System.out.println("¿Desea Ordenar una pizza?");
                        System.out.println("1) Si");
                        System.out.println("2) No");
                        S = 1;
                        OrdenCompra oc = new OrdenCompra();
                        oc.orden();
                        break;
                    case 2:
                        S = 2;
                        System.out.println("Gracias por visitar nuestra Pizzeria");
                        break;
                }while (S != 2 ) ;
             break;

            case 2:
                byte c = 0;
                do {

                    MenuGenerator menuGenerator = new MenuGenerator();
                    menuGenerator.MenuGenerator();

                    Scanner teclado5 = new Scanner(System.in);
                    int l = teclado5.nextInt();

                    switch (l){
                        case 1:
                            Scanner sm = new Scanner(System.in);
                            int f = sm.nextInt();
                            switch (f){
                                case 1:
                                    menuGenerator.MenuGenerator();
                            break;
                        case 2:
                            System.out.println("Gracias por crear su Menu");
                                    break;
                            }

                    }
                }while (c != 2 ) ;

                    break;
            default:
                throw new IllegalStateException("Dato ingresado no soportado: " + S);
        }
    }
}

