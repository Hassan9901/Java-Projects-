public class Person
{
	private String name;
	private String cnicNumber;
	private Date dateOfBirth;
	public Person()
	{
		 name = null;
		 cnicNumber= null;
		 dateOfBirth = new Date();
	}
	public Person(String name,String cnicNumber,Date dateOfBirth)
	{
		 this.dateOfBirth= dateOfBirth;
		 this.setName(name);
		 this.setCNICNumber(cnicNumber);
		
	}
	public Person(Person p)
	{
		 this.setName(p.getName());
		 this.setCNICNumber(p.getCNICNumber());
		 this.setDate(p.dateOfBirth);
	}
	public void setName(String name)
	{
		 this.name = name;	
	}
	public void setCNICNumber(String cnicNumber)
	{	
		 this.cnicNumber=cnicNumber;
	}
	public void setDate(Date dateOfBirth)
	{
		 this.dateOfBirth=dateOfBirth;
	}
	public String getName()
	{
		 return name;
	}
	public String getCNICNumber()
	{
		 return cnicNumber;
	}
	public String getDate()
	{
		 return dateOfBirth.getDate();
	}
	public void draw()
	{
		 System.out.println("Name: "+getName());
		 System.out.println("CNIC Number: "+getCNICNumber());
		 System.out.println("Date Of Birth: "+getDate());
	}
	
}