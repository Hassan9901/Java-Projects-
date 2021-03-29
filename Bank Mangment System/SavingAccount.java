public class SavingAccount extends Accounts
{
	private double balanceStatus;
	private double interestRate;

	public SavingAccount()
	{
		 super();
		 interestRate = 1.1;
	}
	public SavingAccount(String type,double totalBalance,Person p)
	{
		 super(type,totalBalance,p);
		 balanceStatus=0;
		 interestRate = 1.1;
	}
	
	public double depositAmount(double amount)
	{
		 balanceStatus =((balanceStatus)+interestRate*amount);
      	 return balanceStatus;
	}
	public double withdrawAmount(double amount)
	{
		 canWithdraw(amount);
		 if(canWithdraw(amount))
		 {
		   	  balanceStatus =  balanceStatus-amount;
			  return balanceStatus;
		 }
		 else
		 {
			  return -999;
		 }
	}
	public boolean canWithdraw(double amount)
	{
		 if(balanceStatus>(amount+10))
		 {
			  return true;
		 }
		 else
		 {
			  return false;
		 }
	}
	public String getName()
	{
		 return super.getName();
	}
	public String getCNICNumber()
	{
		 return super.getCNICNumber();
	}
	public String getDate()
	{ 
		 return super.getDate();
	 }
	public String draw()
	{
		 System.out.println("Saving Account   "+getName()+"                 "+getCNICNumber()+"     "+getDate()+"           $"+balanceStatus);
	     return "";
	}
}