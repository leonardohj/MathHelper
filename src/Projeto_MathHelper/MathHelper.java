package Projeto_MathHelper;

public class MathHelper {

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
            System.out.println("Não podes dividir numeros por zero!");
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
    public static int soma(int[] numeros)
    {
    int soma = 0;
    for(int i : numeros)
    {
        soma += numeros[i];
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
        return soma / quantosNumeros;
    }
}
