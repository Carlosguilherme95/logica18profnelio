import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero de teste N");
        int n = Integer.parseInt(scanner.nextLine());
        int contador = 0;
        while(n > contador){
            System.out.println("digite a nota1");
            double nota1 = Double.parseDouble(scanner.nextLine());
            System.out.println("digite a nota2");
            double nota2 = Double.parseDouble(scanner.nextLine());
            System.out.println("digite a nota3");
            double nota3 = Double.parseDouble(scanner.nextLine());
            double notaOficial = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
            System.out.print("A média ponderada é ");
            System.out.printf("%.1f %n", notaOficial);
            contador++;

        }
    }
}

/**
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
 * Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal.
 * Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
 * o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 * Entrada
 * 3
 * 6.5 4.3 6.2
 * 5.1 4.2 8.1
 * 8.0 9.0 10.0
 * : Saída:
 * 5.7
 * 6.3
 * 9.3
 */
