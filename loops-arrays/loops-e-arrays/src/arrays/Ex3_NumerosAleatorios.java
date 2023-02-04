package arrays;

import java.util.Random;

import javax.print.attribute.standard.NumberOfDocuments;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final mostre os números e seus sucessores.
*/

public class Ex3_NumerosAleatorios {
  public static void main(String[] args) {
    Random rand = new Random();

    int[] numAleatorios = new int[20];

    for (int i = 0; i < numAleatorios.length; i++) {
      int numero = rand.nextInt(100);
      numAleatorios[i] = numero;
    }

    // Usando FOR
    // for (int i = 0; i < numAleatorios.length; i++) {
    // System.out.println("Número: " + numAleatorios[i] + "\t Sucessor: " +
    // (numAleatorios[i] + 1));
    // }

    // Usando FOREACH
    for (int numero : numAleatorios) {
      System.out.println("Número: " + numero + "\t Sucessor: " + (numero + 1));
    }

  }
}
