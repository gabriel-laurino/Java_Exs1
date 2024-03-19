public class Exercicio05 {
    public static void executar() {
        int A = Prompt.lerInteiro("Digite o valor de A:");
        int B = Prompt.lerInteiro("Digite o valor de B:");

        Prompt.imprimir("Valores originais: A = " + A + ", B = " + B);
        
        // Troca de valores
        int C = A;
        A = B;
        B = C;

        Prompt.imprimir("Valores trocados: A = " + A + ", B = " + B);
    }
}
