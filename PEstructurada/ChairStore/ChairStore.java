
/**
 * Write a description of class ChairStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ChairStore
{
    public static void main(String[] args){
        
        int NUM = 50;
        Scanner sc = new Scanner(System.in);
        String[] identificadores = new String[NUM];
        String[] nombres = new String[NUM];
        String[] cursos = new String[NUM];
        double[] notauno = new double[NUM];
        double[] notados = new double[NUM];
        double[] notatres = new double[NUM];
        int numeroEstudiantes;
        String identificacion, nombre, curso;
        double nota1, nota2, nota3;
        double promedio = 0;
        
        System.out.println("Digite el numero de estudiantes: ");
        numeroEstudiantes = sc.nextInt();
        
        for(int i = 0; i < numeroEstudiantes; i++){
            System.out.println("Digite la identificación del estudiante: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del estudiante: ");
            nombre = sc.next();
            System.out.println("Digite el curso del estudiante: ");
            curso = sc.next();
            System.out.println("Digite la nota uno del estudiante: ");
            nota1 = sc.nextDouble();
            System.out.println("Digite la nota dos del estudiante: ");
            nota2 = sc.nextDouble();
            System.out.println("Digite la nota tres del estudiante");
            nota3 = sc.nextDouble();
            identificadores[i] = identificacion;
            nombres[i] = nombre;
            cursos[i] = curso;
            notauno[i] = nota1;
            notados[i] = nota2;
            notatres[i] = nota3;
        }
        
        System.out.println("Los estudiantes evaluados fueron: ");
        
        for(int i = 0; i < numeroEstudiantes; i++){
            promedio += ((notauno[i] + notados[i] + notatres[i]) / 3) / numeroEstudiantes;
            System.out.println("Identificación: " + identificadores[i]);
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("curso: " + cursos[i] + "\n");
        }
        
        System.out.println("\n\nEl promedio de las notas es " + promedio);
    }
     
}
