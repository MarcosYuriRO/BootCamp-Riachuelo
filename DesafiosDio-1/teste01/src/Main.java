import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra = scanner.nextDouble();
        double porcentagemDesconto;

        if(valorCompra >= 0 && valorCompra < 50) {
            porcentagemDesconto = 0;
        } else if (valorCompra >= 50 && valorCompra <= 100){
            porcentagemDesconto = 0.1;
        } else {
            porcentagemDesconto = 0.2;
        }

        if (porcentagemDesconto == 0) {
            System.out.println("Desconto de " + (int) (porcentagemDesconto) + "%");
        } else {
            int valorPorcentagem = porcentagemDesconto == 0.1 ? 10 : 20;
            System.out.println("Desconto de " + valorPorcentagem + "%");
        }
    }
}