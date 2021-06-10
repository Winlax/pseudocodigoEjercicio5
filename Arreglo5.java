import java.util.*;

public class Arreglo5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int edadesMujeres = 0;
	    int edadesHombres = 0;
	    int edadesSeñoritas = 0;
	    int edadesJovenes = 0;
        int edad;
        String sexo;
        String respuesta;

        do {

            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();

            if (edad >= 18) {

                System.out.println("Ingrese su sexo (F/M): ");
                sexo = teclado.next();

                if ("F".equalsIgnoreCase(sexo)) {
                    edadesMujeres += 1;
                } else {
                    edadesHombres += 1;
                }

            } else {

                System.out.println("Ingrese su sexo (F/M): ");
                sexo = teclado.next();

                if ("F".equalsIgnoreCase(sexo)) {
                    edadesSeñoritas += 1;
                } else {
                    edadesJovenes += 1;
                }

            }

            System.out.println("Desea ingresar otra edad y sexo? (Si/No) ");
            respuesta = teclado.next();

        } while ("Si".equalsIgnoreCase(respuesta));

        System.out.println("Hay un total de: "+edadesMujeres+" Mujeres mayores de edad");
        System.out.println("Hay un total de: "+edadesJovenes+" Hombres menores de edad");

    }
}