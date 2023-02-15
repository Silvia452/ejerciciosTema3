import java.util.Scanner;

public class ejercicio5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nomina();

    }

    public static void nomina() {


        System.out.println("¿Apellido de la persona? ");
        String apellido = sc.nextLine();

        System.out.println("¿Nombre de la persona? ");
        String nombre = sc.nextLine();

        System.out.println("¿Puesto?\n"
                + "1 - Agente de servicio\n"
                + "2 - Empleado de oficina\n"
                + "3 - Directivo");
        int puesto = sc.nextInt();


        System.out.print("¿Número de horas trabajadas?\n ");
        int horas = sc.nextInt();

        System.out.print("¿Tarifa horaria?\n ");
        double tarifa = sc.nextDouble();

        System.out.print("¿Número de hijos?\n ");
        int hijos = sc.nextInt();

        System.out.println("Nómina de " + nombre + " " + apellido);
        System.out.print("Estado: ");
        switch (puesto) {
            case 1:
                System.out.println("Agente de servicio");
                break;
            case 2:
                System.out.println("Empleado de oficina");
                break;
            case 3:
                System.out.println("Directivo");
                break;
            default:
                System.out.println("Desconocido");
                break;
        }

        double salarioBruto = 0;
        int horasNormales = Math.min(horas, 169);
        salarioBruto += horasNormales * tarifa;
        int horasExtra1 = Math.min(Math.max(horas - 169, 0), 11);
        salarioBruto += horasExtra1 * tarifa * 1.5;
        int horasExtra2 = Math.max(horas - 180, 0);
        salarioBruto += horasExtra2 * tarifa * 1.6;
        System.out.printf("Salario bruto: %.2f € (%d horas sin incremento, %d horas con incremento del 50%%, %d horas con incremento del 60%%)%n",
                salarioBruto, horasNormales, horasExtra1, horasExtra2);

        double deducciones = salarioBruto * 0.0349 + salarioBruto * 0.0615 + salarioBruto * 0.0095 + salarioBruto * 0.0844
                + salarioBruto * 0.0305 + salarioBruto * 0.0381 + salarioBruto * 0.0102;
        System.out.printf("Cálculo de deducciones:%n");
        System.out.printf("Contribución para el pago de la deuda social y contingencias comunes imponible: %.2f €%n", salarioBruto * 0.0349);
        System.out.printf("Contribución de contingencias comunes no imponible: %.2f €%n", salarioBruto * 0.0615);
        System.out.printf("Seguro médico: %.2f €%n", salarioBruto * 0.0095);
        System.out.printf("Fondo de pensiones: %.2f €%n", salarioBruto * 0.0844);
        System.out.printf("Seguro de desempleo: %.2f €%n", salarioBruto * 0.0305);
        System.out.printf("Pensión complementaria (Entidad privada): %.2f €%n", salarioBruto * 0.0381);
        System.out.printf("Contribución de jubilación anticipada: %.2f €%n", salarioBruto * 0.0102);
    }
}

