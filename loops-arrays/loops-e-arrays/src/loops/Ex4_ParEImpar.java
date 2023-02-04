package loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int qtdNumeros, qtdPares = 0, qtdImpares = 0, num;

    System.out.print("Informe a quantidade de número a serem analisados: ");
    qtdNumeros = scan.nextInt();

    for (int i = 0; i < qtdNumeros; i++) {
      System.out.print("Informe o " + (i + 1) + " número: ");
      num = scan.nextInt();

      if (num % 2 == 0)
        qtdPares++;
      else
        qtdImpares++;
    }

    System.out.println("Quantidade de números pares: " + qtdPares);
    System.out.println("Quantidade de números ímpares: " + qtdImpares);
  }
}
