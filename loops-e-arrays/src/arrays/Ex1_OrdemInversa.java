package arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
  public static void main(String[] args) {
    int[] vetor = { 1, 3, 5, 7, 9 };

    System.out.println("Vetor: ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }

    System.out.println("\nVetor invertido: ");
    for (int i = (vetor.length - 1); i >= 0; i--) {
      System.out.print(vetor[i] + " ");
    }

  }
}
