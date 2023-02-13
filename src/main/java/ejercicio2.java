import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        temperatura2();

    }

    public static void temperatura2(){
        System.out.println("Introduzca la temperatura: ");
        Scanner sn =  new Scanner(System.in);
        int temperatura = sn.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }
        else if (temperatura <=2 || temperatura <15){
            System.out.println("Hace frío");

        }
        else if (temperatura <=15 || temperatura <30){
            System.out.println("Buena temperatura");
        }

        else if (temperatura >= 30) {
            System.out.println("Hace calor");
        }
    }


}
