import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        coccionCarne();

    }


    public static void coccionCarne(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de carne (vacuno/cordero): ");
        String tipoCarne = sc.nextLine();

        System.out.println("Ingrese el modo de cocción (casi cruda/al punto/bien hecha): ");
        String modoCoccion = sc.nextLine();

        System.out.println("Ingrese el peso en gramos: ");
        int peso = sc.nextInt();

        int tiempoCoccion;
        if (tipoCarne.equals("vacuno")) {
            if (modoCoccion.equals("casi cruda")) {
                tiempoCoccion = 10;
            } else if (modoCoccion.equals("al punto")) {
                tiempoCoccion = 17;
            } else if (modoCoccion.equals("bien hecha")) {
                tiempoCoccion = 25;
            } else {
                System.out.println("Modo de cocción inválido");
                return;
            }
        } else if (tipoCarne.equals("cordero")) {
            if (modoCoccion.equals("casi cruda")) {
                tiempoCoccion = 15;
            } else if (modoCoccion.equals("al punto")) {
                tiempoCoccion = 25;
            } else if (modoCoccion.equals("bien hecha")) {
                tiempoCoccion = 40;
            } else {
                System.out.println("Modo de cocción inválido");
                return;
            }
        } else {
            System.out.println("Tipo de carne inválido");
            return;
        }

        int tiempoTotal = tiempoCoccion * peso / 1000 * 60;
        System.out.println("El tiempo de cocción es de " + tiempoTotal + " segundos");
    }

}
