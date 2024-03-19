public class Exercicio12 {
    public static void executar() {
        int mes = Prompt.lerInteiro("Digite o número do mês (1-12):");
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        if (mes < 1 || mes > 12) {
            Prompt.imprimir("Mês inválido!");
        } else {
            Prompt.imprimir("Mês correspondente: " + meses[mes - 1]);
        }
    }
}
