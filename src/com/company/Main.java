package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("O valor máximo da prova: ");
        double nmax = scanner.nextDouble();
        System.out.print("O valor mínimo da prova: ");
        double nmin = scanner.nextDouble();
        System.out.print("valor médio da prova: ");
        double nmed = scanner.nextDouble();
        System.out.print("O valor para se estar de recuperação: ");
        double rec = scanner.nextDouble();

        System.out.println();

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.println();

        if (n1>nmax || n1<nmin && n2>nmax || n2<nmin) {

            System.out.println("Está nota não está entre " + nmax + " e " + nmin + ", escreva uma nota valida");

        }

        double media = (n1 + n2) / 2;

        System.out.println("A media dos valores " + n1 + " e " + n2 + " é igual à " + media);
        System.out.println();

        double nrec = 0;
        if (media < nmed && media >= rec) {

            System.out.println("você está de recuperação");
            System.out.print("Escreva o resultado da Recuperação: ");
            nrec = scanner.nextDouble();

        }

        if (nrec >= nmed || media >= nmed) {

            System.out.println("APROVADO");

        } else {

            System.out.println("REPROVADO");

        }

        scanner.close();

    }
}