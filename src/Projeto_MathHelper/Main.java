package Projeto_MathHelper;


import java.util.Scanner;

public class Main {
    public static int Menu(Scanner scanner)
    {
        System.out.println("+-------+-----------------------------------+-------+");
        System.out.println("+\\     /+            Math Helper            +\\     /+");
        System.out.println("+ \\   / +-----------------------------------+ \\   / +");
        System.out.println("+  \\ /  +                                   +  \\ /  +");
        System.out.println("+   X   + <1> Próximo número                +   X   +");
        System.out.println("+  / \\  +                                   +  / \\  +");
        System.out.println("+ /   \\ + <2> Juntar nome e apelido         + /   \\ +");
        System.out.println("+ \\   / +                                   + \\   / +");
        System.out.println("+  \\ /  + <3> Maior número                  +  \\ /  +");
        System.out.println("+   X   +                                   +   X   +");
        System.out.println("+  / \\  + <4> Soma dos números              +  / \\  +");
        System.out.println("+ /   \\ +                                   + /   \\ +");
        System.out.println("+/     \\+ <5> Média dos números             +/     \\+");
        System.out.println("+-------+                                   +-------+");
        System.out.println("+//////// <0> Sair                          \\\\\\\\\\\\\\\\+");
        System.out.println("+\\\\\\\\\\\\\\\\___________________________________////////+");
        System.out.println("+-------+-----------------------------------+-------+");

        int menu = scanner.nextInt();
        return menu;
    }

    public static void VoltarAoMenu(Scanner scanner)
    {
        System.out.println("Deseja voltar ao menu? (S\\N)");
        String resposta = scanner.nextLine();
        do {
            if (resposta.equals("S"))
            {

                Menu(scanner);
                break;
            }
            else if(resposta.equals("N"))
            {
                System.out.println("Obrigada por usar o meu programa!");
                break;
            }
            else {
                System.out.println("Resposta inválida!\nTenta novamente...");
            }
        }while(true);

    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    int[] numeros = new int[50];
    int QuantosNumeros = 0;
    String nome, apelido;
    int menu = Menu(scanner);
    switch(menu)
    {
        case 1:
            System.out.println("Qual é o número que quer inserir?");
            numero = scanner.nextInt();
            System.out.println("O numero a seguir ao numero " + numero + " é " + MathHelper.numeroSeguinte(numero) + "!");
            VoltarAoMenu(scanner);
            break;
        case 2:
            System.out.println("Insira o nome!");
            nome = scanner.nextLine();
            System.out.println("Insira o apelido");
            apelido = scanner.nextLine();
            System.out.println("O nome junto fica: " + MathHelper.juntarNome(nome,apelido));
            VoltarAoMenu(scanner);
        case 3:
            System.out.println("Quer inserir quantos numeros? (Max 50)");
            QuantosNumeros = scanner.nextInt();
            System.out.println("Ok! Insira os " + QuantosNumeros + " numeros.");
            for(int i = 0; i < QuantosNumeros; i++)
            {
                numeros[i] = scanner.nextInt();
            }
            System.out.println("O maior numero que foi inserido é o: " + MathHelper.maior(numeros) + "!");

    }

    }
}
