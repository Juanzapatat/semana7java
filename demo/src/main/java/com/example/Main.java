package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaCompra = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("--------------------------------");
            System.out.println("Opciones :");
            System.out.println("1. Ingrese Artículo : ");
            System.out.println("2.Elimine Artículo : ");
            System.out.println("3.Mostrar Lista :");
            System.out.println("4. Finalizar Compra : ");
            System.out.println("Seleccione una de la opciones disponibles: ");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese el nombre del artículo : ");
                String articulo = sc.next();
                listaCompra.add(articulo);
            }

            else if (opcion == 2) {
                System.out.println("Ingrese el nombre del artículo a eliminar : ");
                String articuloEliminar = sc.next();
                for (int i = 0; i < listaCompra.size(); i++) {
                    if (listaCompra.get(i).equals(articuloEliminar)) {
                        listaCompra.remove(i);
                        System.out.println("Artículo eliminado ");
                        continue;

                    }
                    System.out.println("Artículo no encontrado ");
                }
               
            } else if (opcion == 3) {
                System.out.println("Lista de compra : ");
                for (int i = 0; i < listaCompra.size(); i++) {
                    System.out.println(listaCompra.get(i));
                }

            }

            else if (opcion == 4) {
                System.out.println("Gracia por su compra.");
                break;
            }

        }

    }
}