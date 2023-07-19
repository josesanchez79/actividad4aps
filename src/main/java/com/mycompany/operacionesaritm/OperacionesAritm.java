/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionesaritm;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class OperacionesAritm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculo calculo = new Calculo();
        int opc = 5;
        double x;
        double y;
        double r;
      
        
        while(opc != 0){
            System.out.println("Por favor selecciona la operacion usando el menu:\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicacion\n"
                    + "4. Division\n"
                    + "0. Salir");
            opc = scanner.nextInt();
            switch(opc){
                case 0: opc = 0;
                    opc = 0;
                    break;
                case 1: opc = 1;
                    System.out.println("Por favor introduce tus 2 numeros a sumar");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    r = calculo.suma(x, y);
                    System.out.println("El resultado es: " + r);
                    break;
                case 2: opc = 2;
                    System.out.println("Por favor introduce tus 2 numeros a restar, "
                            + "ten en cuenta que el segundo numero restara al primero");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    r = calculo.resta(x, y);
                    System.out.println("El resultado es: " + r);
                    break;
                case 3: opc = 3;
                    System.out.println("Por favor introduce tus 2 numeros a multiplicar");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    r = calculo.multiplicacion(x, y);
                    System.out.println("El resultado es: " + r);
                    break;
                case 4: opc = 4;
                    System.out.println("Por favor introduce tus 2 numeros a dividir, "
                            + "ten en cuenta que el numero 1 sera dividido entre el numero 2");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    r = calculo.division(x, y);
                    System.out.println("El resultado es: " + r);
                    break;
                default:
                    System.out.println("Opcion incorrecta, por favor usa otra opcion");
                    break;
            }
        }
        
    }
}
