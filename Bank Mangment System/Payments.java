public class Payments
{
	private double amount;
	private Accounts a;
	

	public Payments()
	{
	}
	public Payments(double amount,Accounts a)
	{

		 this.setAmount(amount);
		 this.a = a;
	}
	public void setAmount(double amount)
	{
		 this.amount=amount;
	}
	public double getAmount()
	{
		 return amount;
	}
	public double payRequest(double amount)
	{
		 if(a.withdrawAmount(amount)!=-999)
		 {
			  return 1;
		 }
		 else
		 {
			  return -999;
		 }
	}
}