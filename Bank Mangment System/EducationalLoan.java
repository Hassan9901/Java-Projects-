public class EducationalLoan extends LoanType
{
	public EducationalLoan()
	{
		  super();
	}
	public EducationalLoan(double loanAmount,double duration,Person p)
	{
		  super(loanAmount,duration,p);		
	}
	public boolean loanRequest()
	{
		  if(super.getLoanAmount()<=500000 && super.getDuration()<=4)
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
		  System.out.println("Educational Loan   "+getName()+"               "+getCNICNumber()+"     "+getDate()+"         $"+super.getLoanAmount());
	      return "";
	}
}