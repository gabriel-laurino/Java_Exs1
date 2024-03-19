public class Exercicio09 {
    public static void executar() {
        int A = Prompt.lerInteiro("Digite o primeiro número:");
        int B = Prompt.lerInteiro("Digite o segundo número:");

        if (A == B) {
            Prompt.imprimir("Os números são iguais.");
        } else {
            Prompt.imprimir("Os números são diferentes.");
            if (A > B) {
                Prompt.imprimir("O maior número é: " + A);
            } else {
                Prompt.imprimir("O maior número é: " + B);
            }
        }
    }
}
