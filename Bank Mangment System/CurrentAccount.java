public class CurrentAccount extends Accounts implements CashInterface
{
	private double balanceStatus;
	public CurrentAccount()
	{
		 super();
	}
	public CurrentAccount(String type,double totalBalance,Person p)
	{
		 super(type,totalBalance,p);
		 balanceStatus=0;
	}
	public double depositAmount(double amount)
	{
		 balanceStatus =(balanceStatus+amount);
      	 return balanceStatus;
	}
	@Override
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
	@Override
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
		 System.out.println("Current Account  "+getName()+"                 "+getCNICNumber()+"     "+getDate()+"           $"+balanceStatus);
	     return "";
	}
}