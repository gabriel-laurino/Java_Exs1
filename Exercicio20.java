public class Exercicio20 {
    public static void executar() {
        double tempo = Prompt.lerDecimal("Digite o tempo da viagem em horas:");
        double velocidadeMedia = Prompt.lerDecimal("Digite a velocidade média da viagem em km/h:");
        
        double distancia = tempo * velocidadeMedia;
        double litrosUsados = distancia / 12;
        
        Prompt.imprimir(String.format("Quantidade de combustível gasto na viagem: %.2f litros", litrosUsados));
    }
}
