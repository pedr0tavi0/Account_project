package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;


    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public Account(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
        deposit(initialDeposit); //TODO: inicializa o saldo com o valor passado por parâmetro
    }

    public Integer getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    //TODO:metodo para depositar dinheiro
   public void deposit(double amount){
        balance += amount;
   }
   //TODO:metodo para sacar dinheiro com uma taxa de 5.0
   public void withdraw(double amount){
        balance -= amount + 5.0;
   }

@Override
public String toString() {
    return "Numero da conta = " +  number + ", Titular = " +  holder + ", Saldo = $" +  String.format("%.2f",balance);
}
   
}