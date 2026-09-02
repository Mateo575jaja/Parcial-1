import java.util.Scanner;

public class Metodos {
    public Estudiante[][] crearEstudiantes(Estudiante[][] estudiantes, Scanner sc) {

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                System.out.println("Ingrese el nombre del estudiante: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el apellido del estudiante: ");
                String apellido = sc.nextLine();
                System.out.println("Ingrese el carnet del estudiante: ");
                String carnet = sc.nextLine();
                System.out.println("Ingrese el semestre del estudiante: ");
                int semestre = sc.nextInt();
                System.out.println("Ingrese el promedio del estudiante: ");
                float promedio = sc.nextFloat();
                sc.nextLine();
            }
        }
        return estudiantes;
    }

    public Estudiante[][] Promedio(Estudiante[][] estudiantes, Scanner sc) {
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j].getPromedio() > 4.0) {
                    System.out.println(
                            "El estudiante " + estudiantes[i][j].getNombre() + " " + estudiantes[i][j].getApellido()
                                    + " tiene promedio superior a 4.0 y es un estudiante destacado.");
                } else if (estudiantes[i][j].getPromedio() >= 3.0 && estudiantes[i][j].getPromedio() <= 4.0) {
                    System.out.println(
                            "El estudiante " + estudiantes[i][j].getNombre() + " " + estudiantes[i][j].getApellido()
                                    + " tiene promedio inferior o igual a 4.0 y es un estudinate promedio.");
                } else {
                    System.out.println(
                            "El estudiante " + estudiantes[i][j].getNombre() + " " + estudiantes[i][j].getApellido()
                                    + " tiene promedio inferior a 3.0 y es un estudiante con bajo rendimiento.");
                }
            }
        }
        return estudiantes;
    }

}
