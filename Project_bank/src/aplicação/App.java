package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args)  {
       Locale.setDefault(Locale.US); //TODO: para formatar os números com ponto
       Scanner sc = new Scanner(System.in);
       Account account;


        System.out.print("Coloque o número da conta: ");
        int number = sc.nextInt() ;
        System.out.print("Coloque o nome do titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Voce irá fazer um deposito inicial (s/n)? ");
        char response = sc.next().charAt(0);
        if(response == 's'){
            System.out.print("Qual o valor do deposito inicial? ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }else{
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(account);

        System.out.println();
        System.out.println("Qual o valor do deposito? ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("valor do deposito alterado para :");
        System.out.println(account);

        System.out.println();
        System.out.println("Qual o valor do saque? ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Seu saldo foi atualizado:");
        System.out.println(account);


        sc.close();



    }
}
