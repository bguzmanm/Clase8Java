import java.util.Scanner;

public class Fibo {

  // 0 1 1 2 3 5 8 13 21 34 55

  // Preguntar al usuario, cuantos números de la secuencia de fibonacci,
  // quiere que generes y muestres por pantalla

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de números de la secuencia que deseas ver:");
    int cantidad = sc.nextInt();

    int a = 0;
    int b = 1;

    for (int i = 0; i < cantidad; i++) {
      System.out.printf("%d ", a);

      int aux = a + b;
      a = b;
      b = aux;
    }

  }
}
