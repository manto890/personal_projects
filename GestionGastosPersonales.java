import java.util.Scanner;
import java.util.ArrayList;

public class GestionGastosPersonales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 0;
        int opcion = 0;
        ArrayList<Double> gastos = new ArrayList<>();
        ArrayList<String> conceptos = new ArrayList<>();
        while (opcion != 6){
            System.out.println("----- GESTIÓN DE GASTOS PERSONALES -----");
            System.out.println("1. Añadir gastos");
            System.out.println("2. Listarlos");
            System.out.println("3. Ver total de gastos");
            System.out.println("4. Ver la mediana de gastos");
            System.out.println("5. Buscar gastos por nombre");
            System.out.println("6. Salir");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Por favor, agregue concepto de gasto: ");
                    String concepto = input.nextLine();
                    conceptos.add(concepto);
                    System.out.println("Por favor, escriba importe del gasto: ");
                    Double gasto = input.nextDouble();
                    input.nextLine();
                    gastos.add(gasto);
                    System.out.println("Gasto agregado correctamente");
                    break;
                case 2:
                    for (int i = 0; i < gastos.size(); i++) {
                        System.out.println("Gastos: " + conceptos.get(i) + ": " + gastos.get(i));
                    }
                case 3:
                    double totalGastos = 0;
                    for (int e = 0; e < gastos.size(); e++) {
                        totalGastos += gastos.get(e);
                        System.out.println("Total de gastos:" + totalGastos + "€.");
                    }
                    break;
                case 4:
                    double medianaGastos = 0;
                    totalGastos = 0;
                    for (int z = 0; z < gastos.size(); z++) {
                        totalGastos += gastos.get(z);
                        medianaGastos = totalGastos / gastos.size();
                    }
            }
        }
        input.close();
    }
}