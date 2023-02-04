package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido.
*/

public class Ex2_Nota {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double nota = 0;

    System.out.println("Informe a note entre 0 e 10:");
    nota = scan.nextDouble();

    while (nota > 10 || nota < 0) {
      System.out.println("Valor inválido.");
      System.out.println("Informe a note entre 0 e 10:");
      nota = scan.nextDouble();
    }

    System.out.println("Nota: " + nota);
    scan.close();

  }
}
