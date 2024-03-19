public class Exercicio16 {
    public static void executar() {
        double nota1 = Prompt.lerDecimal("Digite a primeira nota:");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota:");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota:");
        
        double media = (nota1 + nota2 + nota3) / 3;
        Prompt.imprimir(String.format("Média aritmética: %.2f", media));
    }
}
