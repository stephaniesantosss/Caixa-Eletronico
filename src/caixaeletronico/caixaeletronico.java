package caixaeletronico;

import java.util.Scanner;

public class caixaeletronico {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

 

        double valor;
        int n2 = 0, n5 = 0, n10 = 0, n20 = 0, n50 = 0, n100 = 0, n200 = 0; // contador de notas

 

        System.out.printf("valor para saque somente em notas: ");
        valor = ler.nextDouble();

 

        while (valor >= 200) {
            valor = valor - 200;
            n200++;
        }

 

        while ((valor >= 100) & (valor < 200)) {
            valor = valor - 100;
            n100++;
        }
        while ((valor >= 50) & (valor < 100)) {
            valor = valor - 50;
            n50++;
        }
        while ((valor >= 20) & (valor < 50)) {
            valor = valor - 20;
            n20++;
        }
        while ((valor >= 10) & (valor < 20)) {
            valor = valor - 10;
            n10++;
        }
        while ((valor >= 5) & (valor < 10)) {
            valor = valor - 5;
            n5++;
        }
        System.out.println("Nota 200:"+n200);
        System.out.println("Nota 100:"+n100);
        System.out.println("Nota 50:"+n50);
        System.out.println("Nota 20:"+n20);
        System.out.println("Nota 10:"+n10);
        System.out.println("Nota 5:"+n5);
        System.out.println("valor final:"+valor);
    }
}
