package account;

public class Access {
		
	public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(524902010106579L, "Nabi Hasan", 7869297887L, "12/may/1998", 250000.34);
        System.out.println("Name : " + sa.getName());
        sa.closeAccount();
        sa.withDraw();
        sa.deposite();
        sa.fixedDeposite();
        System.out.println("=========================================");
        
        LoanAccount la = new LoanAccount(524902010106578L, "Daksh", 9981132278L, "15/June/1999", 897000.98);
        System.out.println("Name : " + la.getName());
        
        la.closeAccount();
        la.payEMI();
        la.repayment();
        la.topUpLoan();
    }
}
