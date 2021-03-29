public class BusinessLoan extends LoanType
{
	public BusinessLoan()
	{
		  super();
	}
	public BusinessLoan(double loanAmount,double duration,Person p)
	{
		  super(loanAmount,duration,p);		
	}
	public boolean loanRequest()
	{
		  if(super.getLoanAmount()<=1500000 && super.getDuration()<=6)
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
		  System.out.println("Business Loan       "+getName()+"               "+getCNICNumber()+"     "+getDate()+"         $"+super.getLoanAmount());
	      return "";
	}
}