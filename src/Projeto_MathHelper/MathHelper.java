package Projeto_MathHelper;

public class MathHelper {

    public static int numeroSeguinte(int numero)
    {
        return numero + 1;
    }

    public static String juntarNome(String nome, String apelido)
    {
        return nome.concat(" " + apelido);
    }

    public static int maior(int[] numeros)
    {
        int maior = 0;
        int i = 0;
        while (i < 5)
        {
            if (numeros[i] > numeros[i++])
            {
                maior = numeros[i];
            }
            else
            {
                maior = numeros[i++];
            }
            i++;
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
