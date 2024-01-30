import java.util.Scanner;

public class TestBuget {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Padrão para verificar se a entrada é um número positivo com até dois decimais
        String padraoCentimetros = "^\\d+(\\.\\d{1,2})?$";

        System.out.print("Digite o valor em centímetros: ");
        String entradaUsuario = scanner.nextLine();

        if (entradaUsuario.matches(padraoCentimetros)) {
            double valorCentimetros = Double.parseDouble(entradaUsuario);
            System.out.println("Valor inserido em centímetros: " + valorCentimetros);
            // Aqui você pode usar o valorCentimetros conforme necessário
        } else {
            System.out.println("Entrada inválida. Por favor, insira um valor válido em centímetros.");
        }

        scanner.close();

    }

}
