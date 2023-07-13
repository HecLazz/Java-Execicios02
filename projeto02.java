/* 
Hector Lazzari
Exercício 02
13-07-2023
 */
import java.util.Scanner;
public class projeto02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        // 0. Write a Java program to print 'Hello' on screen and your name on a separate line.
        System.out.println("Hello.\nHector Lazzari");

        // 1. Write a Java program to print the sum of two numbers. 
        int soma = 75 + 35;
        System.out.println(soma);

        // 2. Write a Java program to print the results of the following operations.
        int op1 = -5 + 8 * 6;
        int op2 = (55+9) % 9;
        int op3 = 20 + -3*5 / 8;
        int op4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("a - "+op1+"\nb - "+op2+"\nc - "+op3+"\nd - "+op4);

        // 3. Escreva um algoritmo que exiba 20 vezes a mensagem Eu gosto de estudar Algoritmos.
        for(int contador = 1; contador <= 20; contador++){
            System.out.println(contador+" - Eu gosto de estudar Algoritmos.");
        }

        // 4. Leia o nome do usuário e escreva o nome dele na tela 10 vezes
        System.out.println("Escreva seu nome: ");
        String nome = scanner.next();

        for(int list = 1; list < 10; list++){
            System.out.println("Olá, "+nome);
        }

        // 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
        System.out.println("Primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();

        int mult = num1 * num2;
        System.out.println(num1+" X "+num2+" = "+mult);

        // 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        System.out.println("Digite um número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite outro: ");
        double segundoNumero = scanner.nextDouble();

        double sum = primeiroNumero + segundoNumero;
        double multiply = primeiroNumero * segundoNumero;
        double subtract = primeiroNumero - segundoNumero;
        double divide = primeiroNumero / segundoNumero;

        System.out.println("Soma: "+sum+"\nMultiplicação: "+multiply+"\nSubtração: "+subtract+"\nDivisão: "+divide);

        // 7. Write a Java program that takes a number as input and prints its multiplication table up to 10. 
        System.out.println("Digite um número para saber a tabuada: ");
        int number = scanner.nextInt();

        for(int contador = 0; contador <= 10; contador++){
            int operacao = number * contador;
            if(contador > 10){
                break;
            }
             System.out.println(number+" X "+contador+" = "+operacao);
        }


        scanner.close(); // fechar a função scanner.
    }
}