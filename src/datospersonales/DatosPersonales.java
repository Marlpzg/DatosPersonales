package datospersonales;

/*

    Autor: Mario López

    Descripción: Pequeño programa que despliega en consola mis datos personales (Nombre completo, edad, fecha de nacimiento, etc...)

 */

public class DatosPersonales {

    public static void main(String[] args) {

        String nombres = "Mario Isaac";
        String apellidos = "López Guevara";
        int edad = 20;
        String fechaNac = "15/03/1998";
        String carrera = "Ingeniería Informática";
        String estado = "Soltero";
        double estatura = 1.70;
        double peso = 180;

        System.out.println("Nombre completo: " + nombres + " " + apellidos + ".");
        System.out.println("Edad: " + edad + " años. (" + fechaNac + ")");
        System.out.println("Estatura: " + estatura + " metros.");
        System.out.println("Peso: " + peso + " kilogramos.");
        System.out.println("Carrera: " + carrera + ".");
        System.out.println("Estado civil: " + estado + ".");

    }

}