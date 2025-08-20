import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Operadores de Atribuição e Lógicos:
        /*System.out.println("Qual a sua idade?");
        int age = scanner.nextInt();
        System.out.println("Você é Emancipado(a)?");
        boolean isEmancipated = scanner.nextBoolean();
        boolean canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);*/

        //Operadores Aritméticos:
        /*System.out.println("Digite um número:");
        int value1 = scanner.nextInt();
        System.out.printf("A raíz de %d é %.2f\n", value1, Math.sqrt(value1));

        System.out.println("Digite outro número:");
        int value2 = scanner.nextInt();
        System.out.printf("A potência de %d é igual a %.2f\n", value2, Math.pow(value2, 2));*/

        //Estruturas Condicionais;
        //"Elvis Operator" / Operador ternário:
        /*System.out.println("Qual o seu nome?");
        String name = scanner.nextLine();
        System.out.println("Qual a sua idade?");
        int age = scanner.nextInt();
        System.out.println("Você é emancipado(a)? (s/n)");
        boolean isEmancipated = scanner.next().equalsIgnoreCase("s");

        boolean canDrive = (age >= 18 || age >= 16 && isEmancipated);
        String message = canDrive ?
                "Você pode dirigir, " + name + "\n" :
                "Você não pode dirigir, " + name + "\n";
        System.out.println(message);*/

        //Switch Case:
        /*System.out.println("informe um número de 1 a 7:");
        int option = scanner.nextInt();
        String message = switch (option) {
            case 1, 7 -> {
                String day = option == 1 ? "Domingo" : "Sábado";
                //yield = return (para um switch case);
                yield String.format("Hoje é %s, bom final de semana!", day);
            }
            //"->" para cases de uma linha e sem necessitar de um break;
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção Inválida";
        };
        System.out.println(message);*/

        //Estruturas de Repetição;
        //for:
        /*for (int i = 0; i <= 100; i++){
           if (i % 2 == 0) {
               //imprime apenas numeros ímpares;
               continue;
               //continue = ignora os comandos quando entrar neste if e prossegue;
           }
            System.out.println(i);
        }*/

        //
    }
}