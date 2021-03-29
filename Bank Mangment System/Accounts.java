public class Accounts
{
	private String type;
	private double totalBalance;
	private Payments payments;
	private Person p;
	


	public Accounts()
	{
		  type = "Saving Account";
		  totalBalance=0.0;
	}
	public Accounts(String type,double totalBalance,Person p)
	{
		  this.setType(type);
		  this.setTotalBalance(totalBalance);
		  this.p = p;
	}
	public Accounts(Accounts t,Person p)
	{
		  this.setType(t.getType());
		  this.setTotalBalance(t.getTotalBalance());
		  this.p=p;
	}
	public void setType(String type)
	{
		  this.type=type;
	}
	public void setTotalBalance(double totalBalance)
	{
		  this.totalBalance=totalBalance;
	}
	public String getType()
	{
		  return type;
	}
	public double getTotalBalance()
	{
		  return totalBalance;
	}
	public double depositAmount(double amount)
	{
		  return totalBalance;
	}
	public double withdrawAmount(double amount)
	{
		  return getTotalBalance()-amount;
	}
	public String getName()
	{
		  return p.getName();
	}
	public String getCNICNumber()
	{
	 	  return p.getCNICNumber(); 
	}
	public String getDate()
	{
		  return p.getDate();
	}
	public String draw()
	{
		  System.out.println("None             "+getName()+"                 "+getCNICNumber()+"     "+getDate()+"         $"+getTotalBalance());
	      return "";
	}
}