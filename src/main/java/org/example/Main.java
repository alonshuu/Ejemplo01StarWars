package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final int MAX_PISTOLAS = 100;
    private static String[][] pistolas = new String[MAX_PISTOLAS][2];
    private static int totalPistolas = 0;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

    }

    public static void menu() {

    }





    private static void eliminarPistola(){

    }



    public static void agregarPistola(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Porfavor, ingresar ID del arma: ");
        String id = sc.nextLine();

        System.out.print("Por favor, ingresar nombre del soldado: ");
        String nombre = sc.nextLine();

        for (int i=0; i<pistolas.length; i++){
            if (pistolas[i][0] == null){
                pistolas[i][0] = id;
                pistolas[i][1] = nombre;

                System.out.println("ARMA REGISTRADA CON EXITO");
                return;
            }
        }

    }

    public static void listarPistolas() {

        for (int i=0; i<pistolas.length; i++){
            if (pistolas[i][0] != null){
                System.out.println("ID :" + pistolas[i][0] + "Soldado : " + pistolas[i][1]);
            }
        }
    }

}