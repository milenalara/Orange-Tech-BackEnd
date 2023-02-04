package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
  public static void main(String[] args) {
    int num = 0, soma = 0, maior = 0;
    double media;

    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.println("Informe o " + (i + 1) + "º número: ");
      num = scan.nextInt();

      if (num > maior)
        maior = num;

      soma += num;
    }

    media = (double) soma / 5.0;

    System.out.println("A média entre os números é " + media);
    System.out.println("O maior número é " + maior);

    scan.close();
  }
}
