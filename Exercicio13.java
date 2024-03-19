public class Exercicio13 {
    public static void executar() {
        double A = Prompt.lerDecimal("Digite o valor de A:");
        double B = Prompt.lerDecimal("Digite o valor de B:");
        String operador = Prompt.lerLinha("Digite o operador aritmético (+, -, *, /):");

        switch (operador) {
            case "+":
                Prompt.imprimir("Resultado: " + (A + B));
                break;
            case "-":
                Prompt.imprimir("Resultado: " + (A - B));
                break;
            case "*":
                Prompt.imprimir("Resultado: " + (A * B));
                break;
            case "/":
                if (B == 0) {
                    Prompt.imprimir("Erro: Divisão por zero não é permitida.");
                } else {
                    Prompt.imprimir("Resultado: " + (A / B));
                }
                break;
            default:
                Prompt.imprimir("Operador não definido.");
                break;
        }
    }
}
