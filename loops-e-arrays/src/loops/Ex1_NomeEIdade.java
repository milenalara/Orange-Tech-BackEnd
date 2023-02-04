package loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando
a sua idade. (Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeEIdade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome = "";
    int idade = 0;

    while (true) {
      System.out.print("Informe o nome: ");
      nome = scanner.next();
      if (nome.equals("0"))
        break;

      System.out.print("Informe a idade: ");
      idade = scanner.nextInt();
      System.out.println("\nMeu nome é " + nome + " e eu tenho " + idade + " anos.\n");
    }

    System.out.println("Continua aqui...");
    scan.close();
  }
}
