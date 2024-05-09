import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int contador = 0;
    int acumulador = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de numeros que quieres sumar:");
    int cantidad = sc.nextInt();

    while (contador<cantidad){
      contador++;
      /*System.out.printf("%d + %d\n", contador, acumulador);*/
      if (contador % 2 == 0) {
        acumulador+=contador;
      }
    }

    System.out.printf("La suma de los digitios desde 1 hasta %d es %d\n", cantidad, acumulador);

  }
}