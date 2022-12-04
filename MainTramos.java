import java.util.ArrayList;
import java.util.Scanner;
public class MainTramos {
    public static void main(String[] args) {
        ArrayList <Integer> tramsMinutes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean controlador = false;
        int contador = 1;
        do {
            System.out.println("Ingrese el tramo número " + contador);
            int inputTramo = sc.nextInt();
            tramsMinutes.add(inputTramo);
            contador++;
            if(inputTramo == 0){
                controlador = true;
            }
        }while(!controlador);
        int totalMinutos = 0;
        for (int i = 0; i < tramsMinutes.size(); i++) {
            totalMinutos = totalMinutos + tramsMinutes.get(i);
        }
        System.out.println("Salio del for");
        int horas = (int) totalMinutos / 60;
        int minutos = totalMinutos % 60;
        System.out.println("El tiempo total del viaje es de " + horas + " horas, " + minutos + " minutos");
    }
}