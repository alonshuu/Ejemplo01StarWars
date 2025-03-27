package org.example;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final int MAX_PISTOLAS = 100;
    private static String[][] pistolas = new String[MAX_PISTOLAS][2];
    private static int totalPistolas = 0;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        mostrarOpciones();
        int opcion = obtenerOpcion();
        ejecutarOpcion(opcion);


    }

    private static void mostrarOpciones(){
        System.out.println("--BIENVENIDO AL SISTEMA DEL IMPERIO--");
        System.out.println("[1] AGREGAR PISTOLA");
        System.out.println("[2] ELIMINAR PISTOLA");
        System.out.println("[3] LISTAR PISTOLA");
        System.out.println("[4] SALIR DEL SISTEMA");
        return;
    }

    private static void ejecutarOpcion(int opcion){


        while(opcion != 4){
            if(opcion == 1){
                agregarPistola();
                mostrarOpciones();
                opcion = obtenerOpcion();
            }
            else if (opcion == 2){
                eliminarPistola();
                mostrarOpciones();
                opcion = obtenerOpcion();
            }
            else if (opcion == 3){
                listarPistolas();
                mostrarOpciones();
                opcion = obtenerOpcion();
            }
            else if (opcion == 4){
                System.out.println("Saliendo del programa");
                break;
            }


        }


    }






    private static int obtenerOpcion() {
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.println("Por favor ingresa un numero valido");
            sc.next();
        }
        int opcionfinal = sc.nextInt();
        return opcionfinal;


    }



    private static void eliminarPistola(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Porfavor,ingrese la ID del arma que desea borrar: ");
        String id = sc.nextLine();

        for (int i=0; i<pistolas.length; i++){
            if (Objects.equals(pistolas[i][0], id)){
                pistolas[i][0] = null;
                pistolas[i][1] = null;
            }
        }

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