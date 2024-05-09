import java.util.Scanner;

public class Ul {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de items de tu lista:");
    int cantidad = sc.nextInt();

    int contador = 1;
    String acumulador = "<ul>\n";

    while (contador <= cantidad){
      acumulador = acumulador.concat("\t<li>").concat(String.valueOf(contador)).concat("</li>\n");
      contador++;
    }
    acumulador = acumulador.concat("</ul>");
    System.out.println(acumulador);


  }
}
