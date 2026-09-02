import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos metodos = new Metodos();
        System.out.println("Ingrese el número de filas de estudiantes: ");
        int filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas de estudiantes: ");
        int columnas = sc.nextInt();

        Estudiante[][] estudiantes = new Estudiante[filas][columnas];
        metodos.crearEstudiantes(estudiantes, sc);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar estudiantes destacados");
            System.out.println("2. Mostrar estudiantes promedio");
            System.out.println("3. Mostrar estudiantes con bajo rendimiento");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    metodos.Promedio(estudiantes, sc);
                    break;
                case 2:
                    metodos.Promedio(estudiantes, sc);
                    break;
                case 3:
                    metodos.Promedio(estudiantes, sc);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }



    


    
}
