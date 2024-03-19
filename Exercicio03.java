public class Exercicio03 {
    public static void executar() {
        int A = Prompt.lerInteiro("Digite o valor de A:");
        int B = Prompt.lerInteiro("Digite o valor de B:");

        if (A > B) {
            Prompt.imprimir("A é maior que B.");
        } else if (B > A) {
            Prompt.imprimir("B é maior que A.");
        } else {
            Prompt.imprimir("A sequência de números informados é inválida (A e B são iguais).");
        }
    }
}
