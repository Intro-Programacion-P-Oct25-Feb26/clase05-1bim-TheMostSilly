package ejemplo06;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int diaPago;
        int mensualidad = 25;
        double valorTotal1;
        double valorTotal2;

        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese el usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la parroquia");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese el día de pago");
        diaPago = entrada.nextInt();

        valorTotal1 = mensualidad * (1 - 0.05);

        if ((diaPago < 10) && 
                (parroquia.equals("El Valle")|| parroquia.equals("El Sagrario"))) {
            System.out.printf("Nombre: %s\nApellido: %s\nUsuario: %s\nEdad: %s\n"
                    + "Parroquia: %s\nDía de Pago: %s\nValor Total: %.2f\n",
                    nombre, apellido, usuario, edad, parroquia, diaPago, valorTotal1);

        }else{
            valorTotal2 = mensualidad;
                    System.out.printf("Nombre: %s\nApellido: %s\nUsuario: %s\nEdad: %s\n"
                    + "Parroquia: %s\nDía de Pago: %s\nValor Total: %f\n",
                    nombre, apellido, usuario, edad, parroquia, diaPago, valorTotal2);
        }

    }
    
}
