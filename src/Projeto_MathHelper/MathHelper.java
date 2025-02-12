package Projeto_MathHelper;

import java.util.Scanner;

public class MathHelper {

    public static String Menu(Scanner scanner)
    {
        System.out.println("+-------+-----------------------------------+-------+");
        System.out.println("+\\     /+            Math Helper            +\\     /+");
        System.out.println("+ \\   / +-----------------------------------+ \\   / +");
        System.out.println("+  \\ /  +                                   +  \\ /  +");
        System.out.println("+   X   + <1> Soma                          +   X   +");
        System.out.println("+  / \\  +                                   +  / \\  +");
        System.out.println("+ /   \\ + <2> Subtração                     + /   \\ +");
        System.out.println("+ \\   / +                                   + \\   / +");
        System.out.println("+  \\ /  + <3> Multiplicação                 +  \\ /  +");
        System.out.println("+   X   +                                   +   X   +");
        System.out.println("+  / \\  + <4> Divisão                       +  / \\  +");
        System.out.println("+ /   \\ +                                   + /   \\ +");
        System.out.println("+ \\   / + <5> Proximo número                + \\   / +");
        System.out.println("+  \\ /  +                                   +  \\ /  +");
        System.out.println("+   X   + <6> Juntar nome e apelido         +   X   +");
        System.out.println("+  / \\  +                                   +  / \\  +");
        System.out.println("+ /   \\ + <7> Maior número                  + /   \\ +");
        System.out.println("+/     \\+                                   +/     \\+");
        System.out.println("+-------+ <8> Média dos números             +-------+");
        System.out.println("+-------+                                   +-------+");
        System.out.println("+//////// <0> Sair                          \\\\\\\\\\\\\\\\+");
        System.out.println("+\\\\\\\\\\\\\\\\___________________________________////////+");
        System.out.println("+-------+-----------------------------------+-------+\n");

        String menu = scanner.next();
        return menu;
    }

    public static boolean VoltarAoMenu(Scanner scanner)
    {
        System.out.println("Deseja voltar ao menu? (S\\N)");
        String resposta = scanner.next();

        while(true) {
            if (resposta.equals("S")) {

                return true;

            }
            if (resposta.equals("N")) {

                System.out.println("Obrigada por usar o meu programa!");
                return false;

            } else {
                System.out.println("Resposta inválida!\nTenta novamente...");
                resposta = scanner.next();
            }
        }

    }

    public static void InserirNumeros(Scanner scanner, int quantosNumeros, int[] numeros)
    {
        System.out.println("\nOk! Insira os " + quantosNumeros + " números.");
        for(int i = 0; i < quantosNumeros; i++)
        {
            numeros[i] = scanner.nextInt();
        }
    }

    public static void InserirNumerosDouble(Scanner scanner, int quantosNumeros, double[] numerosDouble)
    {
        System.out.println("\nOk! Insira os " + quantosNumeros + " números.");
        for(int i = 0; i < quantosNumeros; i++)
        {
            numerosDouble[i] = scanner.nextDouble();
        }
    }

    public static int numeroSeguinte(int numero)
    {
        return numero + 1;
    }

    public static int subtracao(int[] numeros)
    {
    return numeros[0] - numeros[1];
    }

    public static int multiplicacao(int[] numeros)
    {
        return numeros[0] * numeros[1];
    }

    public static double divisao(double[] numeros)
    {
        if(numeros[0] == 0 || numeros[1] == 0)
        {
            System.out.println("Não podes dividir números por zero!");
            return 0;
        }
        return numeros[0] / numeros[1];
    }

    public static String juntarNome(String nome, String apelido)
    {
        return nome.concat(" " + apelido);
    }

    public static int maior(int[] numeros, int quantidadeNumeros)
    {
        int maior = 0;
        int i = 0;
        int j = 1;
        int contador = 0;

        while (contador < quantidadeNumeros)
        {
            if (numeros[i] > numeros[j])
            {
                maior = numeros[i];
                j++;
            }
            else
            {
                i++;
                maior = numeros[j];
            }
            contador++;
        }
        return maior;
    }

    public static int soma(int[] numeros, int quantosNumeros)
    {
    int soma = 0;
    for(int i = 0; i < quantosNumeros; i++)
    {
        soma += numeros[i];
        soma = soma + numeros[i];
    }
    return soma;
    }

    public static double media(double[] numeros, int quantosNumeros)
    {
        int soma = 0;
        for(int i = 0; i < quantosNumeros; i++)
        {
            soma += numeros[i];
        }
        return soma / (double)quantosNumeros;
    }
}
