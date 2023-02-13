import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        coccionCarne();

    }

    public static void coccionCarne(){
        System.out.println("Introduzca el tipo de carne: \nvacuno o cordero ");
        Scanner sn =  new Scanner(System.in);
        String carne = sn.nextLine();

        System.out.println("Introduzca el modo de cocción que desee cocinar la carne: ");
        String coccion = sn.nextLine();

        System.out.println("Introduzca el peso de la carne: ");
        int peso = sn.nextInt();

        if (carne == "vacuno") {
            if (coccion == "crudo") {
                System.out.println("El tiempo de cocción es de: " + (10 * peso) + " segundos");
            }
            else if (coccion == "punto") {
                System.out.println("El tiempo de cocción es de: " + (17 * peso) + " segundos");
            }
            else if (coccion == "bien") {
                System.out.println("El tiempo de cocción es de: " + (25 * peso) + " segundos");
            }
        }
        else if (carne == "cordero") {
            if (coccion == "crudo") {
                System.out.println("El tiempo de cocción es de: " + (15 * peso) + " segundos");
            }
            else if (coccion == "punto") {
                System.out.println("El tiempo de cocción es de: " + (25 * peso) + " segundos");
            }
            else if (coccion == "bien") {
                System.out.println("El tiempo de cocción es de: " + (40 * peso) + " segundos");
            }
        }

    }

}
