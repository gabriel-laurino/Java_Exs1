public class Exercicio04 {
    public static void executar() {
        double num1 = Prompt.lerDecimal("Digite o primeiro número:");
        double num2 = Prompt.lerDecimal("Digite o segundo número:");

        Prompt.imprimir("Soma: " + (num1 + num2));
        Prompt.imprimir("Subtração: " + (num1 - num2));
        Prompt.imprimir("Multiplicação: " + (num1 * num2));
        
        double div = num1 / num2;
        Prompt.imprimir(String.format("Divisão: %.2f", div));
    }
}
