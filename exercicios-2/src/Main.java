import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Exercício 1:
        /*System.out.println("Digite um número para saber a tabuada de 1 a 10 do mesmo:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = i * number;
            System.out.printf("%d * %d = %d\n", i, number, result);*/

        //Desafio 2:
        /*System.out.println("Digite o seu peso  em quilos:");
        double weight = scanner.nextDouble();
        System.out.println("E, agora, digite a sua altura em metros:");
        double height = scanner.nextDouble();
        double imc = weight / (height * height);

        if (imc >= 30) {
            if (imc >= 35) {
                String imcCalculated = imc >= 40 ? "Obesidade Grau III" :
                        "Obesidade Grau II";
                System.out.println(imcCalculated);
            } else {
                System.out.println("Obesidade grau I");
            }
        } else {
            if (imc >= 25) {
                System.out.println("Levemente acima do peso");
            } else {
                String imcCalculated = imc >= 18.6 ? "Peso Ideal" :
                        "Abaixo do Peso";
                System.out.println(imcCalculated);
            }
        }*/

        //Exercício 3:
        /*System.out.println("Digite um número:");
        int number1 = scanner.nextInt();
        System.out.println("Digite um outro número, maior que o anterior:");
        int number2 = scanner.nextInt();
        System.out.println("Escolha entre:");
        System.out.println("Opção 1: Apresentar somente os números ímpares;");
        System.out.println("Opção 2: Apresentar somente os números pares;");
        int answer = scanner.nextInt();

        for (int i = number1; i <= number2; i++) {
            switch (answer) {
                case 1:
                    if (i % 2 == 0) {
                        continue;
                    }
                    break;
                case 2:
                    if (!(i % 2 == 0)) {
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
            System.out.println(i);
        }*/

        //Exercício 4:
        /*System.out.println("Escreva um número:");
        int initialNumber = scanner.nextInt();

        while (true){
            System.out.println("Escreva outro número:");
            int number = scanner.nextInt();
            if (number < initialNumber){
                System.out.printf("Valor inválido. Deve ser maior que %d\n", initialNumber);
                continue;
            }
            if (number % initialNumber != 0) {
                System.out.println("Fim da Execução");
                break;
            }
        }*/

    }
}