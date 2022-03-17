package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inpuData = new Scanner(System.in);

        System.out.println("1: Hamburguesa");
        System.out.println("2: Perros  8000");
        System.out.println("3: Salchipapas");
        System.out.println("4: Chorizos");

        int groupoPeople;
        int dish = 0, contPropina = 0, contPlato1 = 0, contPlato2 = 0, contPlato3 = 0, contPlato4 = 0;
        double total = 0, descuento = 0;
        String propina = "";

        System.out.print("Introduce el número de personas que van a comer: ");
        groupoPeople = inpuData.nextInt();

        for (int i=0; i < groupoPeople; i++) {
            System.out.print("ingrese el nombre del plato del cliente segun el menu: ");
            dish = inpuData.nextInt();


            System.out.print("Desea incluir propina(s/n): ");
            propina = inpuData.next();

            if(propina.equals("S") || propina.equals("s")) {
                contPropina++;
            }

            if (dish == 1) {
                total += 10000;
                contPlato1++;
            } else if(dish == 2) {
                total += 8000;
                contPlato2++;
            } else if(dish == 3) {
                total += 6000;
                contPlato3++;
            } else if(dish == 4) {
                total += 7000;
                contPlato4++;
            } else {
                System.out.println("Opcion no valida");
            }
        }

        if(contPropina > 0) {
            total += (total*0.10*contPropina);
        }

        if(contPlato1 >= 2 || contPlato2 >= 2 || contPlato3 >= 2 || contPlato4 >= 2){
            descuento = total * 0.05;
            total = total - descuento;
        }

        if (total > 20000) {

            descuento = total * 0.10;
            total -= descuento;
            System.out.println("se le realizó un descuento por compras superiores a 20000 pesos de " + descuento);
        }

        System.out.println("Total a pagar " + total);

    }

}
