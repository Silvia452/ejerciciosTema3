//EJERCICIO 1

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        temperatura();


    }

    public static void temperatura(){
        System.out.println("Introduzca la temperatura: ");
        Scanner sn =  new Scanner(System.in);
        int temperatura = sn.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }
        else if (temperatura >= 2){
            System.out.println("No hay riesgo de hielo");
        }
    }
}
