public class Exercicio02 {
    public static void executar() {
        int num1 = Prompt.lerInteiro("Digite o primeiro número:");
        int num2 = Prompt.lerInteiro("Digite o segundo número:");

        int soma = num1 + num2;
        Prompt.imprimir("A soma é: " + soma);

    }
}
