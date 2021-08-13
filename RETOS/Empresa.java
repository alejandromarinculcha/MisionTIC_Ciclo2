package empresa;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String entrada2 = sc.nextLine();
        String entrada3 = sc.nextLine();
        String entrada4 = sc.nextLine();

        String[] lista = entrada.split("&");
        String[] lista2 = entrada2.split("&");
        String[] lista3 = entrada3.split("&");
        String[] lista4 = entrada4.split("&");

        if (lista[0].equals("1")) {
            if (lista[1].equals("Planta")) {
                System.out.print("***Lista de Empleados***" + "\n" + "\tEmpleado de planta - Nombre: " + lista[2] + "\n" + "\tProfesión: " + lista[3] + "\n" + "\tExperiencia: " + lista[4] + "\n" + "\tSalario base: " + lista[5]+".0");
            } else {
                System.out.print("***Lista de Empleados***" + "\n" + "\tEmpleado contratista - Nombre: " + lista[2] + "\n" + "\tProfesión: " + lista[3] + "\n" + "\tExperiencia: " + lista[4] + "\n" + "\tValor hora: " + lista[5]+".0");
            }
        }      
        
        if (lista2[0].equals("1")) {
            if (lista2[1].equals("Planta")) {
                System.out.print("\n" + "\tEmpleado de planta - Nombre: " + lista2[2] + "\n" + "\tProfesión: " + lista2[3] + "\n" + "\tExperiencia: " + lista2[4] + "\n" + "\tSalario base: " + lista2[5]+".0");
            } else {
                System.out.print("\n" + "\tEmpleado contratista - Nombre: " + lista2[2] + "\n" + "\tProfesión: " + lista2[3] + "\n" + "\tExperiencia: " + lista2[4] + "\n" + "\tValor hora: " + lista2[5]+".0");
            }
        }

        if (lista3[0].equals("1")) {
            if (lista3[1].equals("Planta")) {
                System.out.print("\n" + "\tEmpleado de planta - Nombre: " + lista3[2] + "\n" + "\tProfesión: " + lista3[3] + "\n" + "\tExperiencia: " + lista3[4] + "\n" + "\tSalario base: " + lista3[5]+".0");
            } else {
                System.out.print("\n" + "\tEmpleado contratista - Nombre: " + lista3[2] + "\n" + "\tProfesión: " + lista3[3] + "\n" + "\tExperiencia: " + lista3[4] + "\n" + "\tValor hora: " + lista3[5]+".0");
            }
        }else{
            if (lista[1].equals("Planta")) {
                System.out.print("\n" + "***Lista de Empleados***" + "\n" + "\tEmpleado de planta - Nombre: " + lista[2] + "\n" + "\tProfesión: " + lista[3] + "\n" + "\tExperiencia: " + lista[4] + "\n" + "\tSalario base: " + lista[5]+".0");
            } else {
                System.out.print("***Lista de Empleados***" + "\n" + "\tEmpleado contratista - Nombre: " + lista[2] + "\n" + "\tProfesión: " + lista[3] + "\n" + "\tExperiencia: " + lista[4] + "\n" + "\tValor hora: " + lista[5]+".0");
            }
                        if (lista2[1].equals("Planta")) {
                System.out.print("\n" + "\tEmpleado de planta - Nombre: " + lista2[2] + "\n" + "\tProfesión: " + lista2[3] + "\n" + "\tExperiencia: " + lista2[4] + "\n" + "\tSalario base: " + lista2[5]+".0");
            } else {
                System.out.print("\n" + "\tEmpleado contratista - Nombre: " + lista2[2] + "\n" + "\tProfesión: " + lista2[3] + "\n" + "\tExperiencia: " + lista2[4] + "\n" + "\tValor hora: " + lista2[5]+".0");
            }
      
            
        }

        if (lista4[0].equals("1")) {
            if (lista4[1].equals("Planta")) {
                System.out.print("\n" + "\tEmpleado de planta - Nombre: " + lista4[2] + "\n" + "\tProfesión: " + lista4[3] + "\n" + "\tExperiencia: " + lista4[4] + "\n" + "\tSalario base: " + lista4[5]+".0");
            } else {
                System.out.print("\n" + "\tEmpleado contratista - Nombre: " + lista4[2] + "\n" + "\tProfesión: " + lista4[3] + "\n" + "\tExperiencia: " + lista4[4] + "\n" + "\tValor hora: " + lista4[5]+".0");
            }
        } 
    }

}
