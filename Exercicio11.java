import java.util.Arrays;

public class Exercicio11 {
    public static void executar() {
        int[] numeros = new int[3];
        numeros[0] = Prompt.lerInteiro("Digite o primeiro número:");
        numeros[1] = Prompt.lerInteiro("Digite o segundo número:");
        numeros[2] = Prompt.lerInteiro("Digite o terceiro número:");

        Arrays.sort(numeros);
        Prompt.imprimir("Números em ordem crescente: " + Arrays.toString(numeros));
    }
}
