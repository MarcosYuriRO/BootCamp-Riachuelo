import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Operadores de Atribuição e Lógicos:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanl a sua idade");
        var age = scanner.nextInt();
        System.out.println("Você é Emancipado(a)?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
}