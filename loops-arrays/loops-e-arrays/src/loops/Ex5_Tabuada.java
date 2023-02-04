package loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num;

    System.out.print("Informe um número entre 1 e 10 para calcular a tabuada: ");
    num = scan.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " x " + num + " = " + (i * num));
    }

  }
}
