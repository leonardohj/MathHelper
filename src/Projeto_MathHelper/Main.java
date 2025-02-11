package Projeto_MathHelper;


import java.util.Scanner;

public class Main {
    public static int Menu(Scanner scanner)
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
        System.out.println("+   X   + <6> Juntar nome e apelido        +   X   +");
        System.out.println("+  / \\  +                                   +  / \\  +");
        System.out.println("+ /   \\ + <7> Maior numero                  + /   \\ +");
        System.out.println("+/     \\+                                   +/     \\+");
        System.out.println("+-------+ <8> Média dos números             +-------+");
        System.out.println("+-------+                                   +-------+");
        System.out.println("+//////// <0> Sair                          \\\\\\\\\\\\\\\\+");
        System.out.println("+\\\\\\\\\\\\\\\\___________________________________////////+");
        System.out.println("+-------+-----------------------------------+-------+\n");

        int menu = scanner.nextInt();
        return menu;
    }

    public static boolean VoltarAoMenu(Scanner scanner)
    {
        System.out.println("Deseja voltar ao menu? (S\\N)");
            String resposta = scanner.next();
            int contador = 0;
            while(contador == 0) {
                if (resposta.equals("S")) {
                    contador++;
                    return true;

                }
                if (resposta.equals("N")) {
                    contador++;
                    System.out.println("Obrigada por usar o meu programa!");
                    return false;

                } else {
                    System.out.println("Resposta inválida!\nTenta novamente...");
                }
            }
            return false;
    }
    public static void InserirNumeros(Scanner scanner, int quantosNumeros, int[] numeros)
    {
        System.out.println("Ok! Insira os " + quantosNumeros + " numeros.");
        for(int i = 0; i < quantosNumeros; i++)
        {
            numeros[i] = scanner.nextInt();
        }
    }
    public static void InserirNumerosDouble(Scanner scanner, int quantosNumeros, double[] numeros)
    {
        System.out.println("Ok! Insira os " + quantosNumeros + " numeros.");
        for(int i = 0; i < quantosNumeros; i++)
        {
            numeros[i] = scanner.nextInt();
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int[] numeros = new int[50];
    double[] numerosDouble = new double[50];
    int quantosNumeros = 0;
    String nome, apelido;
    int menu = 0;
        boolean voltar = true;
    do {

        if(voltar == false)
        {
            break;
        }
        menu = Menu(scanner);
        switch (menu) {
            case 1:
                System.out.println("Quantos numeros quer somar?");
                quantosNumeros = scanner.nextInt();
                InserirNumeros(scanner, quantosNumeros, numeros);
                System.out.println("\nA soma dos numeros inseridos foi: " + MathHelper.soma(numeros) + "!");
                voltar = VoltarAoMenu(scanner);
                break;
            case 2:
                System.out.println("Insira 2 numeros para se subtrairem!");
                quantosNumeros = 2;
                InserirNumeros(scanner, quantosNumeros, numeros);
                System.out.println("\nA subtração dos numeros inseridos foi: " + MathHelper.subtracao(numeros) + "!");
                voltar = VoltarAoMenu(scanner);
                break;
            case 3:
                System.out.println("Insira 2 numeros para se multiplicarem!");
                quantosNumeros = 2;
                InserirNumeros(scanner, quantosNumeros, numeros);
                System.out.println("\nA multiplicação dos numeros inseridos foi: " + MathHelper.multiplicacao(numeros) + "!");
                voltar = VoltarAoMenu(scanner);
                break;
            case 4:
                System.out.println("Insira 2 numeros para se dividirem!");
                quantosNumeros = 2;
                InserirNumeros(scanner, quantosNumeros, numeros);
                double divisaofeita = MathHelper.divisao(numerosDouble);
                if
                System.out.println("\nA divisão dos numeros inseridos foi: " + MathHelper.divisao(numerosDouble) + "!");
                voltar = VoltarAoMenu(scanner);
                break;
            case 5:
                System.out.println("\nQual é o número que quer inserir?");
                numero = scanner.nextInt();
                System.out.println("O numero a seguir ao numero " + numero + " é " + MathHelper.numeroSeguinte(numero) + "!");
                voltar = VoltarAoMenu(scanner);
                break;
            case 6:
                System.out.println("\nInsira o nome!");
                nome = scanner.nextLine();
                System.out.println("Insira o apelido");
                apelido = scanner.nextLine();
                System.out.println("O nome junto fica: " + MathHelper.juntarNome(nome, apelido));
                voltar = VoltarAoMenu(scanner);
                break;
            case 7:
                System.out.println("\nQuer inserir quantos numeros? (Max 50)");
                quantosNumeros = scanner.nextInt();
                InserirNumeros(scanner, quantosNumeros, numeros);
                System.out.println("\nO maior numero que foi inserido é o: " + MathHelper.maior(numeros, quantosNumeros) + "!");
                voltar = VoltarAoMenu(scanner);
                break;
            case 8:


            default:
        }
    }while(menu != 0);
    }
}
