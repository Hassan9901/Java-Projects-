public class EgriculturalLoan extends LoanType
{
	public EgriculturalLoan()
	{
		 super();
	}
	public EgriculturalLoan(double loanAmount,double duration,Person p)
	{
		 super(loanAmount,duration,p);		
	}
	public boolean loanRequest()
	{
		 if(super.getLoanAmount()<=200000 && super.getDuration()<=3)
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
		 System.out.println("Agricultural Loan       "+getName()+"               "+getCNICNumber()+"     "+getDate()+"         $"+super.getLoanAmount());
	     return "";
	}
}