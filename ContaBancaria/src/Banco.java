/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author williany62977696
 */import java.util.Scanner;

public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner entrada = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria("Williany");

        int opcao;

        do {

            System.out.println();
            System.out.println("===== CONTA BANCÁRIA =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Verificar situação da conta");
            System.out.println("5 - Sair");
            System.out.print("Digite uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = entrada.nextDouble();

                    conta1.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = entrada.nextDouble();

                    conta1.sacar(saque);
                    break;

                case 3:
                    System.out.println("Saldo atual: R$ " + conta1.getSaldo());
                    break;

                case 4:
                    conta1.verificarSaldo();
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        entrada.close();
    }
} 
    

