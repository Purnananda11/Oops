import java.util.*;
class Account{
    double account_num;
    double bal;
   public void account_info(double account_num, double bal)
    {
        this.bal=bal;
        this.account_num=account_num;
        System.out.println(" Account number is "+account_num+" and balance "+bal);
    }

}

class Savings extends  Account{
    double interest;
   public Savings(double interest)
    {
        this.interest = interest;
    }
    @Override
   public void account_info(double account_num, double bal) {
        super.account_info(account_num, bal);
        System.out.println("Account information account number is "+account_num+" and balance "+bal+" and interest rate is "+interest);
    }
    public void  cal_interest()
    {
        double interest_amount = bal*(interest/100);
        bal = bal+interest_amount;
        System.out.println("Balance is "+bal);
    }
}
class Current extends  Account{
    double overDraft;
    public Current(double overDraft)
    {
        this.overDraft = overDraft;
    }
    @Override
   public void account_info(double account_num, double bal) {
        super.account_info(account_num, bal);
        System.out.println("Account information account number is "+account_num+" and balance "+bal+" and overdrate rate is "+overDraft);
    }
    public void cal_interest()
    {
        if(bal<0)
        {
            double overdraft_amount = bal*(overDraft/100);
            bal = bal+overdraft_amount;
            System.out.println("account balance is "+bal);
        }
        else
        {
            System.out.println("no Overdraft");
        }
    }
}
public class Overriding {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Enter the Acccount number");
        account.account_num = scan.nextDouble();
        System.out.println("Enter the balance account");
        account.bal = scan.nextDouble();
        account.account_info(account.account_num, account.bal);
        Savings savings = new Savings(5);
        savings.account_info(account.account_num, account.bal);
        savings.cal_interest();
        Current current = new Current(6);
        current.account_info(account.account_num, account.bal);
        current.cal_interest();

    }

}