import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Operadores de Atribuição e Lógicos:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int age = scanner.nextInt();
        System.out.println("Você é Emancipado(a)?");
        boolean isEmancipated = scanner.nextBoolean();
        boolean canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);

        //Operadores Aritméticos:
        System.out.println("Digite um número:");
        int value1 = scanner.nextInt();
        System.out.printf("A raíz de %d é %.2f\n", value1, Math.sqrt(value1));

        System.out.println("Digite outro número:");
        int value2 = scanner.nextInt();
        System.out.printf("A potência de %d é igual a %.2f\n", value2, Math.pow(value2, 2));
    }
}