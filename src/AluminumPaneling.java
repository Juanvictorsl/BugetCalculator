import java.util.Scanner;

public class AluminumPaneling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receber as dimensões do portão do usuário
        System.out.print("Informe o comprimento do portão em metros: ");
        double comprimentoPortao = scanner.nextDouble();

        System.out.print("Informe a altura do portão em metros: ");
        double alturaPortao = scanner.nextDouble();

        // Receber as dimensões do lambri do usuário
        System.out.print("Informe a largura do lambri de alumínio em metros: ");
        double larguraLambri = scanner.nextDouble();

        // Calcular a área total do portão
        double areaTotal = comprimentoPortao * alturaPortao;

        // Calcular a quantidade total de lambris necessários
        double quantidadeLambris = areaTotal / larguraLambri;

        // Exibir os resultados
        System.out.println("A quantidade total de metros de lambris de alumínio necessária é: " + quantidadeLambris + " metros.");

        // Calcular a quantidade de varas de lambris necessárias (considerando o comprimento padrão de 6 metros)
        int quantidadeVaras = (int) Math.ceil(quantidadeLambris / 6.0);

        // Exibir a quantidade de varas necessárias
        System.out.println("Isto equivale a aproximadamente " + quantidadeVaras + " varas de lambris.");

        scanner.close();
    }
}
