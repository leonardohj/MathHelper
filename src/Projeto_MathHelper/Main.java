package Projeto_MathHelper;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    int[] numeros = new int[50];
    double[] numerosDouble = new double[50];
    int quantosNumeros;
    String nome, apelido;
    int menu;
        boolean voltar = true;
    do {

        if(!voltar)
        {
            break;
        }
        menu = MathHelper.Menu(scanner);
        switch (menu) {
            case 0:
                System.out.println("\nObrigada por usar o meu programa!");
                break;
            case 1:
                System.out.println("\nQuantos números quer somar?");
                quantosNumeros = scanner.nextInt();
                if(quantosNumeros <= 1)
                {
                    System.out.println("Não podes somar só 1 número...");
                }
                else
                {
                    MathHelper.InserirNumeros(scanner, quantosNumeros, numeros);
                    System.out.println("\nA soma dos números inseridos foi: " + MathHelper.soma(numeros, quantosNumeros) + "!");
                }
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
            case 2:
                quantosNumeros = 2;
                MathHelper.InserirNumeros(scanner, quantosNumeros, numeros);
                System.out.println("\nA subtração dos números inseridos foi: " + MathHelper.subtracao(numeros) + "!");
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
            case 3:
                quantosNumeros = 2;
                MathHelper.InserirNumeros(scanner, quantosNumeros, numeros);
                System.out.println("\nA multiplicação dos números inseridos foi: " + MathHelper.multiplicacao(numeros) + "!");
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
            case 4:
                quantosNumeros = 2;
                MathHelper.InserirNumerosDouble(scanner, quantosNumeros, numerosDouble);
                double divisaofeita = MathHelper.divisao(numerosDouble);
                if(divisaofeita == 0)
                {
                    System.out.println("Erro! Os números inseridos não podem ser divididos!");
                }
                else
                {
                    System.out.println("\nA divisão dos números inseridos foi: " + MathHelper.divisao(numerosDouble) + "!");
                }
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
            case 5:
                System.out.println("\nQual é o número que quer inserir?");
                numero = scanner.nextInt();
                System.out.println("O número a seguir ao número " + numero + " é " + MathHelper.numeroSeguinte(numero) + "!");
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
            case 6:
                System.out.println("\nInsira o nome!");
                nome = scanner.next();
                System.out.println("Insira o apelido");
                apelido = scanner.next();
                System.out.println("O nome junto fica: " + MathHelper.juntarNome(nome, apelido));
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
            case 7:
                System.out.println("\nQuer inserir quantos números? (Max 50)");
                quantosNumeros = scanner.nextInt();
                MathHelper.InserirNumeros(scanner, quantosNumeros, numeros);
                System.out.println("\nO maior número que foi inserido é o: " + MathHelper.maior(numeros, quantosNumeros) + "!");
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
            case 8:
                System.out.println("\nQuer inserir quantos números? (Max 50)");
                quantosNumeros = scanner.nextInt();
                MathHelper.InserirNumerosDouble(scanner, quantosNumeros, numerosDouble);
                System.out.println("\nA média dos números inseridos é: " + MathHelper.media(numerosDouble, quantosNumeros) + "!");
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
            default:
                System.out.println("\nResposta inválida!");
                voltar = MathHelper.VoltarAoMenu(scanner);
                break;
        }
    }while(menu != 0);
    }
}
