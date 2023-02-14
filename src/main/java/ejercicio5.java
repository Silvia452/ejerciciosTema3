import java.util.Scanner;

public class ejercicio5 {

    public static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        nomina();

    }

    public static void nomina(){

        System.out.println("¿Apellido de la persona?");
        String apellido = sn.nextLine();
        System.out.println(apellido);

        System.out.println("¿Nombre de la persona?");
        String nombre = sn.nextLine();

        System.out.println("¿Puesto?\n"
                + "1.Agente de servicio\n"
                + "2.Empleado de oficina\n"
                + "3. Directivo\n");

        int option = sn.nextInt();
        switch (option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

        System.out.println("Número de horas trabajadas: ");
        int horastrabajadas = sn.nextInt();
        System.out.println("¿Tarifa horaria? ");
        int tarifahoraria = sn.nextInt();

        if (horastrabajadas<169){
            System.out.println("El salario bruto es de: " + (tarifahoraria) + "€");
        }
        else if (horastrabajadas>=169 && horastrabajadas<=180) {
            System.out.println("El salario bruto es de: " + (tarifahoraria * 0.50) + "€");

        }
        else if(horastrabajadas>180){
            System.out.println("El salario bruto es de: " + (tarifahoraria * 0.60) + "€");
        }

        System.out.println("¿Número de hijos?");
        int numhijos = sn.nextInt();

        System.out.println("Nómina de " + nombre + " " + apellido + ":\n"
        + "Estado:" + option + "\n"
        + "Salario bruto: " + horastrabajadas + "€\n");
        

        if (numhijos == 1){
            int primatotal = 20;
            System.out.println("Prima familiar: " + primatotal + "€");
        }
        else if(numhijos == 2){
            int primatotal = 50;
            System.out.println("Prima familiar: " + primatotal + "€");
        }

        else if(numhijos>2){
            int primatotal = 70 + (numhijos-2)*20;
            System.out.println("Prima familiar: " + primatotal + "€");
        }




    }
}
