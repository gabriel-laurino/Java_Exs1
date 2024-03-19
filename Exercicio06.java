public class Exercicio06 {
    public static void executar() {
        double celsius = Prompt.lerDecimal("Digite a temperatura em Celsius:");

        double fahrenheit = (9 * celsius + 160) / 5;
        Prompt.imprimir("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
