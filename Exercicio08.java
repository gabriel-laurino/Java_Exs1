public class Exercicio08 {
    public static void executar() {
        int numero = Prompt.lerInteiro("Digite um número:");

        if (numero >= 50) {
            Prompt.imprimir("O número é maior ou igual a 50.");
        } else {
            Prompt.imprimir("O número é menor que 50.");
        }
    }
}
