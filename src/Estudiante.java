import java.nio.channels.FileLock;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String paralelo;
    private String cedula;
    private int edad;
    //MATEMATICAS,NATURALES,SOCIALES,QUIMICA
    private float[] notas=new float[4];

    public void ingresarDatos(){
        Scanner teclado=new Scanner(System.in);

        System.out.println("Ingrese el Nombre");
        nombre=teclado.nextLine();
        System.out.println("Ingrese el Paralelo");
        paralelo=teclado.nextLine();
        System.out.println("Ingrese la Cedula");
        cedula=teclado.nextLine();
        System.out.println("Ingrese la edad");
        edad=teclado.nextInt();
        ingresarNotas();

    }

    public void ingresarNotas(){
        Scanner teclado=new Scanner((System.in));

        for(int i=0; i<notas.length; i++){
            System.out.println("Ingrese la Nota de la Materia"+(i+1));
            notas[i]=teclado.nextFloat();


        }
    }
  public void mostrarDatos(){
      System.out.println("Nombre: "+nombre);
      System.out.println("Paralelo: "+paralelo);
      System.out.println("Cedula: "+cedula);
      System.out.println("Edad: "+edad);

      for (int i=0; i<notas.length; i++) {
          System.out.println("Materia "+(i+1)+ " notas "+notas[i]);
      }
      System.out.printf("Promedio; "+promedio());
  }

  public float promedio(){
        float acum=0;
        for (int i=0; i<notas.length; i++){
            acum=acum+notas[i];
        }
        return acum/notas.length;
  }
}
