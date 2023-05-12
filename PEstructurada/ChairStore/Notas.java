
/**
 * Write a description of class Notas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Notas
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numEstudiantes;
        EstudiantePOO[] losEstudiantes = new EstudiantePOO[50];
        String identificacion, nombre, curso;
        double nota1, nota2, nota3;
        double promedio = 0;
        
        System.out.println("Digite el número de estudiantes. ");
        numEstudiantes = sc.nextInt();
        for(int i = 0; i < numEstudiantes; i++){
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
        }
        
    }
}
