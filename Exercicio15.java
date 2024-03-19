public class Exercicio15 {
    public static void executar() {
        double x1 = Prompt.lerDecimal("Digite a coordenada x de P1:");
        double y1 = Prompt.lerDecimal("Digite a coordenada y de P1:");
        double x2 = Prompt.lerDecimal("Digite a coordenada x de P2:");
        double y2 = Prompt.lerDecimal("Digite a coordenada y de P2:");
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Prompt.imprimir(String.format("Distância entre P1 e P2: %.2f", distancia));
    }
}
