public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = amount + sum;
        System.out.println("Я положил деньги в размере" + sum + "сом на карту");
    }
    public void withDraw(int sum) throws LimitException{
        if (sum <amount){
            throw new LimitException("Недостаточно средств", amount);
        }else {
            amount = amount - sum;
            System.out.println("\uD83D\uDC4BЯ снял:" + sum + "\uD83D\uDCB5Сом");
        }
    }
}
