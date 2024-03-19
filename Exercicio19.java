public class Exercicio19 {
    public static void executar() {
        double raio = Prompt.lerDecimal("Digite o raio do cilindro:");
        double altura = Prompt.lerDecimal("Digite a altura do cilindro:");
        
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        Prompt.imprimir(String.format("Volume do cilindro: %.2f", volume));
    }
}
