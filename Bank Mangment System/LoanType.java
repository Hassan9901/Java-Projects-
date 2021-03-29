public class LoanType
{
	private double loanAmount;
	private double duration;
	private Person p;

	public LoanType()
	{	
		 this.setLoanAmount(0.0);
	   	 this.setDuration(0);
	}
	public LoanType(double loanAmount,double duration,Person p)
	{
		 this.setLoanAmount(loanAmount);
		 this.setDuration(duration);
		 this.p = p;
	}
	public LoanType(LoanType l)
	{
		 this.setLoanAmount(l.getLoanAmount());
		 this.setDuration(l.getDuration());
	}
	public void setLoanAmount(double loanAmount)
	{
		 this.loanAmount=loanAmount;
	}
	public double getLoanAmount()
	{
		 return loanAmount;
	}
	public void setDuration(double duration)
	{
		 this.duration=duration;
	}
	public double getDuration()
	{
		 return duration;
	}
	public boolean loanRequest()
	{
		 return true;
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
		 System.out.println("None             "+getName()+"                 "+getCNICNumber()+"     "+getDate()+"         $"+getLoanAmount());
	     return "";
	}
}