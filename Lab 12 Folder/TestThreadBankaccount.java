

public class TestThreadBankaccount {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(); 
		final double AMOUNT = 100;
		final int REPETITIONS = 4;
		final int THREADS = 7;
		
		for (int i = 1; i <= THREADS; i++) {
			DepositRunnable d = new DepositRunnable( account, AMOUNT, REPETITIONS);
			WithdrawRunnable w = new WithdrawRunnable( account, AMOUNT, REPETITIONS);
			Thread dt = new Thread(d); 
			Thread wt = new Thread(w);
			dt.start();
			wt.start();
		}
	}
}