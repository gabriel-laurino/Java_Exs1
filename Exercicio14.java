public class Exercicio14 {
    public static void executar() {
        int a1 = Prompt.lerInteiro("Digite o primeiro termo da PA (a1):");
        int n = Prompt.lerInteiro("Digite o número do termo que deseja encontrar (n):");
        int r = Prompt.lerInteiro("Digite a razão da PA (r):");
        
        int an = a1 + (n - 1) * r;
        Prompt.imprimir("O " + n + "º termo da PA é: " + an);
    }
}
