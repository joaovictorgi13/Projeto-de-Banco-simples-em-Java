import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        // Declarar variaveis

        double saldo = 0;
        boolean rodando = true;
        int opcao;


        while(rodando){
            //MENU
            System.out.println("-------PROGRAMA DE BANCO-------");
            System.out.println("1. Mostrar Saldo.");
            System.out.println("2. Depositar na Conta.");
            System.out.println("3. Realizar saque.");
            System.out.println("4. Sair.");

            // Escolhas do usuario
            System.out.print("Digite sua escolha (1 - 4):");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> mostrarSaldo(saldo);
                case 2 -> saldo += fazerDeposito();
                case 3 -> saldo -= fazerSaque(saldo);
                case 4 -> rodando = false;
                default -> System.out.println("Opcao Invalida");
            }
        }

        System.out.println("PROGRAMA ENCERRADO!");

        scanner.close();
    }

    //Saldo
    static void mostrarSaldo(double saldo){
        System.out.printf("R$%.2f\n", saldo);

    }

    //deposito
    static double fazerDeposito(){
        double quantidade;

        System.out.print("Digite a quantia a ser depositada:");
        quantidade = scanner.nextDouble();

        if(quantidade < 0){
            System.out.println("O valor nao pode ser negativo!");
            return 0;
        } else{
            return quantidade;
        }


    }

    //saque
    static double fazerSaque(double saldo){
        double quantidade;

        System.out.print("Digite o valor do saque:");
        quantidade = scanner.nextDouble();

        if(quantidade > saldo){
            System.out.println("Saldo insuficiente!!!");
            return 0;
        } else if( quantidade < 0){
            System.out.println("O valor nao pode ser negativo!");
            return 0;
        }else {
            return quantidade;
        }
    }


}