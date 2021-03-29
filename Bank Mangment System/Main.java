//Hassan Raza
// Final Project for 2nd Semmester
import java.util.Scanner;
import java.util.*;
public class Main//
{
	public static void main(String[] args)
	{
		  Scanner sc = new Scanner(System.in);
		  header();
		  display1();
		  String choice = getChoice1(sc);
          String choiceAfterLogin ="0";
		  boolean bool = false;
          boolean flag = false;
          boolean pass = false;
          int count=0;
		  BankAccount ba = new BankAccount();
          while(bool==false)
          {
           		if(choice.equals("0"))
           		{
           		      bool=true;
           		}
           		else if(choice.equals("1"))
           		{
           		      OperationOfChoice1(sc,ba);
           		      display1();
           		      choice = getChoice1(sc);
           		}
           		else if(choice.equals("2"))
           		{
           		      OperationOfChoice2(sc,ba);
           		      display1();
           		      choice = getChoice1(sc);
           		}
                else if(choice.equals("3"))
                {
                  while(flag==false)
                  {
                       String login = getcnicNumber(sc);
                       if(ba.getRecord(login))
                       {
                             int indexAt = ba.getIndex(login);
                             System.out.println("\nLoged In!\n");
                             display(login);
                             count=1;
                             choiceAfterLogin = getChoice(sc);
                             while(count==1)
                             {
                                   if(choiceAfterLogin.equals("1"))
                                   {
                                          OperationOfChoice2(sc,ba);
                                          display(login);
                                          choiceAfterLogin=getChoice(sc);
                                   }
                                   else if(choiceAfterLogin.equals("2"))
                                   {
                                          OperationOfChoice3(sc,ba,login);
                                          display(login);
                                          choiceAfterLogin = getChoice(sc);
                                   }
                                   else if(choiceAfterLogin.equals("3"))
                                   {
                                          OperationOfChoice4(sc,ba,login);
                                          display(login);
                                          choiceAfterLogin=getChoice(sc);

                                   }
                                   else if(choiceAfterLogin.equals("4"))
                                   {
                                          OperationOfChoice5(sc,ba,login);
                                          display(login);
                                          choiceAfterLogin=getChoice(sc);
                                   }
                                   else if(choiceAfterLogin.equals("5"))
                                   {
                                          OperationOfChoice6(sc,ba,login);
                                          display(login);
                                          choiceAfterLogin=getChoice(sc);
                                   }
                                   else if(choiceAfterLogin.equals("6"))
                                   {
                                          if(OperationOfChoice7(sc,ba,login))
                                          {
                                               count=0;
                                               flag=true;
                                          }
                                          else
                                          {
                                                display(login);
                                                choiceAfterLogin=getChoice(sc);
                                          }
                                   }
                                   else if(choiceAfterLogin.equals("7"))
                                   {
                                          OperationOfChoice8(sc,ba,login);
                                          display(login);
                                          choiceAfterLogin=getChoice(sc);
                                   }
                                   else if(choiceAfterLogin.equals("8"))
                                   {
                                          OperationOfChoice9(ba);
                                          display(login);
                                          choiceAfterLogin=getChoice(sc);
                                   }
                                   else if(choiceAfterLogin.equals("9"))
                                   {
                                          OperationOfChoice10(ba);
                                          display(login);
                                          choiceAfterLogin=getChoice(sc);
                                   }
                                   else
                                   {
                                          count=0;
                                          flag=true;
                                   }
                             }

                       }
                       else
                       {
                             System.out.println("\nSoory! we found no record against this CNIC Number.\n"); 
                             System.out.println("You wanna Login Again");
                             System.out.println("   1-Yes");
                             System.out.println("   2-No");
                             System.out.print("Please Enter your choice: ");
                             String option=yesOrNo(sc);
                             sc.nextLine();
                             if(option.matches("[2]")) 
                             {
                                   flag=true;
                                   
                             }
                       }
                 }
                  flag=false;
                  count=0;
                  display1();
                  choice=getChoice1(sc);
           }
      }
      System.out.println("\nThanks for visiting LAN LIMITED BANK!\n");
	}	
	public static void header()
	{
		    System.out.println();
		    System.out.println("                                           ************************");
		    System.out.println();
		    System.out.println("                                           WELLCOME TO BANK OF LAN");
		    System.out.println(); 
		    System.out.println("                                           ************************");
		    System.out.println();
	}
  public static void display1()
  {
  	        System.out.println("     ******* Main Menu *******      \n");
  	        System.out.println("       1-Open New Account");
  	        System.out.println("       2-Loan Request");
  	        System.out.println("       3-Login");
  	        System.out.println("       0-Exit");
  }

	public static void display(String loginCNIC)
	{
	     	System.out.println("     ******* "+loginCNIC+" *******      \n");
		    System.out.println("       1-Loan Request");
		    System.out.println("       2-Payments");
		    System.out.println("       3-Deposit Amount");
		    System.out.println("       4-Withdraw Amount");
		    System.out.println("       5-View Account");
		    System.out.println("       6-Delete Account");
            System.out.println("       7-Transfer Amount");
            System.out.println("       8-Detail of all Account Holders");
            System.out.println("       9-Detail of all Loan Accounts");
		    System.out.println("       0-Log Out");
	}
  public static String getChoice1(Scanner sc)    
  {
            boolean bool = false;
            System.out.print("Please enter your choice: ");
            String choice = sc.next();
            while(bool==false)
            { 
                   if(!(choice.matches("[0-3]+") && choice.length()==1))
                   {
                         System.out.println("Invalid Input Enter Again");
                         choice=sc.next();
                   }
                   else
                   {
                         bool=true;
                         sc.nextLine();
                   }
            }
            return choice;
  }
  public static String getChoice(Scanner sc)
  { 
            boolean bool = false;
	        System.out.print("Please enter your choice: ");
            String choice = sc.next();
            while(bool==false)
            {
                
                   if(!(choice.matches("[0-9]+") && choice.length()==1))
                   {
        		             System.out.println("Invalid Input Enter Again");
        		             choice=sc.next();
      	           }
                   else
                   {
	             	         bool=true;
	        	             sc.nextLine();
	               }
    	    
            }
    	    return choice;
	}
	public static String getChoiceforOption1(Scanner sc)
	{
		    boolean bool = false;
		    System.out.print("Please enter your choice: ");
            String choice = sc.next();
  	        while(bool==false)
  	        {
             	   if(!(choice.matches("[0-2]+")) || choice.length()!=1)
      	           {
              		         System.out.println("Invalid Input Enter Again");
              		         choice=sc.next();
      	           }
             	   else
      	           {
	              	         bool=true;
                   } 
            }
    	    return choice;
	}
  public static String yesOrNo(Scanner sc)
  {
            boolean bool = false;
            String choice = sc.next();
            while(bool==false)
            {
                   if(!(choice.matches("[1-2]+")) || choice.length()!=1)
                   {
                        System.out.println("Invalid Input Enter Again");
                        choice=sc.next();
                   }
                   else
                   {
                        bool=true;
                   }
            }
            return choice;
  }
  public static String getName(Scanner sc)
  {
            sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            while(!(name.matches("[A-Za-z. ]+") && name.length()>=3 && name.length()<=50))
            {
                   if(!(name.matches("[A-Za-z. ]+")))
                   {
                        System.out.println("Invalid Input Enter again");
                        name = sc.nextLine();
                   }
                   else
                   {
                        System.out.println("Invalid Input Enter again");
                        name = sc.nextLine(); 
                   }
            }
        return name;
  }
	public static String getcnicNumber(Scanner sc)
	{
		    System.out.print("CNIC Number: ");
		    String cnic = sc.nextLine();
		    while(!(cnic.matches("[0-9-]+") && cnic.length()==13))
		    {
		   	       System.out.println("Invalid Input Enter Again");
				   cnic = sc.nextLine();
		    }
		    return cnic;
	}
	public static Date getDateOfBirth(Scanner sc)
	{
    		System.out.println("Date of Birth:  ");
		    System.out.print("Date: ");
		    int day = sc.nextInt();
            while(day>31 || day<1)
            {
                   System.out.println("Invalid Input Enter Again");
                   day = sc.nextInt();
            }
		    System.out.print("Month: ");
		    int month = sc.nextInt();
            while(month>12 || month<1)
            {
                   System.out.println("Invalid Input Enter Again");
                   month = sc.nextInt();
            }
		    System.out.print("Year: ");
		    int year = sc.nextInt();
            while(year>2019 || year<1900)
            {
                   System.out.println("Invalid Input Enter Again");
                   year = sc.nextInt();
            }
		    Date d = new Date(day,month,year);
		    return d;
	}
	public static void displayOption1(Scanner sc)
	{
		    System.out.println("   1-Current Account");
		    System.out.println("   2-Saving Account");
            System.out.println("   0-Back");
	}
	public static void OperationOfChoice1(Scanner sc,BankAccount ba)
	{
		   displayOption1(sc);
	       String choice1 = getChoiceforOption1(sc);
	       if(choice1.matches("[1]+"))
	       {
                   System.out.println("Please Enter your Personal Detail here");
                   Person p = new Person(getName(sc),getcnicNumber(sc),getDateOfBirth(sc));
  	       	       Accounts a = new CurrentAccount(choice1,0.0,p);
	    		   if(ba.addAccount(a))
	               {
	                       System.out.println("\nYour Account has been Successfully Created!\n");
	         	   }
	       	       else
	    		   {
	    			       System.out.println("\nSorry! account already exits against this CNIC Number.\n");
	    		   }
	       }  
		   else if(choice1.matches("[2]+"))
	       {
                   System.out.println("Please Enter your Personal Detail here");
                   Person p = new Person(getName(sc),getcnicNumber(sc),getDateOfBirth(sc));
	               Accounts a = new SavingAccount(choice1,0.0,p);
	               if(ba.addAccount(a))
	               {
	                       System.out.println("\nYour Account has been Successfully Created!\n");
	       	       }
	    	       else
	    		   {
	    		   	       System.out.println("\nSorry! account already exits against this CNIC Number.\n");
                   }
	   	   }
   }
   public static void displayOption2(Scanner sc)
   {
		   System.out.println("   1-Educational Loan");
		   System.out.println("   2-Business Loan");
		   System.out.println("   3-Egricultural Loan");
           System.out.println("   0-Back");
	}
   public static String getChoiceforOption2(Scanner sc)
	{
		   boolean bool = false;
		   System.out.println("Please enter your choice:");
           String choice = sc.next();
    	   while(bool==false)
    	   {
        	       if(!(choice.matches("[0-3]+")) || choice.length()!=1)
        	       {
          	     	       System.out.println("Invalid Input Enter Again");
        	   	           choice=sc.next();
        	       }
          	       else
        	       {
	        	           bool=true;
  	               }
    	   }
    	   return choice;
	}
   public static void OperationOfChoice2(Scanner sc,BankAccount ba)
   { 
   		   boolean   bool=false;
   		   displayOption2(sc);
   	 	   String choice2 = getChoiceforOption2(sc);
           if(choice2.matches("[0]+"))
           {
                   bool=true;
           }
   		   while(bool==false)
   		   {
                   System.out.println("Please Enter your Personal Detail here");
                   Person p = new Person(getName(sc),getcnicNumber(sc),getDateOfBirth(sc));
   		       	   if(choice2.matches("[1]+"))
   		           {   
   			               System.out.print("Enter the Amount of Loan: ");
   		               	   double amount = sc.nextDouble();
   	          	 	       System.out.print("Enter the Duration of Loan: ");
   		           	       double duration = sc.nextDouble();
   			               LoanType l = new EducationalLoan(amount,duration,p);
   		           	       if(l.loanRequest()==false)
   			               {
   			                       System.out.println("Your Request Has been Denied.Your request must be less than or equal to 500000 and duration must be less than or equal to 4 years");
   			                       System.out.println("Do you wanna make Again LoanRequest?");
   			                       System.out.println("   1-Yes");
				                   System.out.println("   2-No");
   			                       System.out.print("Please enter your Choice: ");
   			                       String option = yesOrNo(sc);
   			                       if(option.matches("[2]+"))
  			                       {
   				                	       bool=true;
   			   	                   }
   			               }
   			               else
   			               {	 
                                   if(ba.addLoanAccount(l))
                                   {
   				       	                   System.out.println("\nYour LoanRequest has been granted!\n");
   				       	                   bool=true;
                                   }
                                   else
                                   {
                                           System.out.println("\nSorry! Loan already taken  against this CNIC Number.\n"); 
                                           bool=true;
                                   }
   			                }
   		           }
   		           else if(choice2.matches("[2]+"))
   		           {
   			                System.out.print("Enter the Amount of Loan: ");
   		                    double amount = sc.nextDouble();
   			                System.out.print("Enter the Duration of Loan: ");
   			                double duration = sc.nextDouble();
   			                LoanType l = new BusinessLoan(amount,duration,p);
   			                if(l.loanRequest()==false)
   			                {
   		 	                       System.out.println("Your Request Has been Denied.Your request must be less than or equal to 1500000 and duration must be less than or equal to 6 years");
   			                       System.out.println("Do you wanna make Again LoanRequest?");
   			                       System.out.println("   1-Yes");
   			                       System.out.println("   2-No");
   			                       System.out.print("Please enter your Choice: ");
  			                       String option = yesOrNo(sc);
   			                       if(option.matches("[2]+"))
   			                       {
   			      	                       bool=true;
 			   	                   }
   			                }   
   			                else
   			                {
                                   if(ba.addLoanAccount(l))
                                   {
                                           System.out.println("\nYour LoanRequest has been granted!\n");
                                           bool=true;
                                   }
                                   else
                                   {
                                           System.out.println("\nSorry! Loan already taken  against this CNIC Number.\n"); 
                                           bool=true;
                                   }
  			                }
   		           }
   		           else if(choice2.matches("[3]+"))
   		           {
   			                System.out.print("Enter the Amount of Loan: ");
   			                double amount = sc.nextDouble();
   			                System.out.print("Enter the Duration of Loan: ");
   			                double duration = sc.nextDouble();
   			                LoanType l = new EgriculturalLoan(amount,duration,p);
   		     	            if(l.loanRequest()==false)
   			                {
   			                       System.out.println("Your Request Has been Denied.Your request must be less than or equal to 200000 and duration must be less than or equal to 3 years");
   			                       System.out.println("Do you wanna make Again LoanRequest?");
   			                       System.out.println("   1-Yes");
   			                       System.out.println("   2-No");
   			                       System.out.print("Please enter your Choice: ");
                                   String option = yesOrNo(sc);
   			                       if(option.matches("[2]+"))
   			                       {
   			      	                       bool=true;
 			   	                   }
   			                }
   			                else
   			                {
                                   if(ba.addLoanAccount(l))
                                   {
                                           System.out.println("\nYour LoanRequest has been granted.\n");
                                           bool=true;
                                   }
                                   else
                                   {
                                           System.out.println("\nSorry! Loan already taken  against this CNIC Number.\n"); 
                                           bool=true;
                                   }
  			                }
   		           }
   	        }
   }
   public static void OperationOfChoice3(Scanner sc,BankAccount ba,String login)
   {
        
     	    ArrayList<Accounts> accounts = ba.getAccounts();
      	    int indexAt = ba.getIndex(login);
    	    System.out.print("Enter the amount you wanna pay:");
    	    double amount = sc.nextDouble();
    	    Payments payments = new Payments(0.0,accounts.get(indexAt));
      	    if(payments.payRequest(amount)==1)
      	    {
      	   		   System.out.println("\nYour Payment has been made Successfully!\n");
      	    } 
         	else
            {
      	   		   System.out.println("\nSorry! you have insuficient balance.Your account must be contain 10$ extra to make any Payment Request.\n");
      	    }
   }
   public static void OperationOfChoice4(Scanner sc,BankAccount ba,String login)
   {
      	    ArrayList<Accounts> accounts = ba.getAccounts();
            int indexAt = ba.getIndex(login);
            System.out.print("Enter Your Amount:");
            double amount = sc.nextDouble();
            accounts.get(indexAt).depositAmount(amount);
            System.out.println("\nYour amount has been Credited!\n");
   }
   public static void OperationOfChoice5(Scanner sc,BankAccount ba,String login)
   {
            ArrayList<Accounts> accounts = ba.getAccounts();
            int indexAt = ba.getIndex(login);
            System.out.print("Enter Your Amount:");
            double amount = sc.nextDouble();
            double updatedBalance = accounts.get(indexAt).withdrawAmount(amount);
            if(updatedBalance==-999)
            {
                   System.out.println("\nInsufficient Balance! You must have atleast $10 in your account to make any transaction!\n");
            }
            else
            {
                   System.out.println("\nYour amount has been Successfully debited!\n");
            }
   }
   public static void OperationOfChoice6(Scanner sc,BankAccount ba,String login)
   {
            ArrayList<Accounts> accounts = ba.getAccounts();
            int indexAt = ba.getIndex(login);
            System.out.println("Type           "+"  Name               "+ "CNIC Number         "+"Date Of Birth    "+"Account Balance\n   ");
            accounts.get(indexAt).draw();
   }
   public static boolean OperationOfChoice7(Scanner sc,BankAccount ba,String login)
   {
            ArrayList<Accounts> accounts = ba.getAccounts();
            int indexAt = ba.getIndex(login);
            System.out.println("\n Are Sure wanna delete your Account\n");
            System.out.println("  1-Yes");
            System.out.println("  2-No");
            System.out.print("Please enter yout choice: ");
            String option = yesOrNo(sc);
            if(option.matches("[1]+"))
            {
           	       ba.removeAccount(accounts.get(indexAt));
           	       System.out.println("\nYour Account has been Successfully deleted!\n");
                   return true;
            }
            else
            {
                   return false;
            }
   }
   public static void OperationOfChoice8(Scanner sc,BankAccount ba,String login)
   {
            boolean bool=false;
            ArrayList<Accounts> accounts = ba.getAccounts();
            while(bool==false)
            {
                   System.out.print("Enter CNIC number whom you want to transfer amount: ");
                   String receivingAmountCNICNumber = sc.nextLine();
                   if(ba.getRecord(receivingAmountCNICNumber) && (!login.equals(receivingAmountCNICNumber)))
                   {
                           System.out.print("Enter amount you want to transfer: ");
                           double amount = sc.nextDouble();
                           int transferingIndex = ba.getIndex(login);
                           int receivingIndex = ba.getIndex(receivingAmountCNICNumber);
                           double updatedBalance = accounts.get(transferingIndex).withdrawAmount(amount);
                           if(updatedBalance!=-999)
                           {
                                   accounts.get(receivingIndex).depositAmount(amount);
                                   System.out.println("\nYour amount has been Successfully transfered.\n");
                           }
                           else
                           {
                                   System.out.println("\nInsufficient Balance! You must have atleast $10 in your account to make any transaction.\n");
                                   bool=true;
                           }
                   }
                   else
                   {
                           System.out.println("\nSoory! we found no record against this CNIC Number.\n");
                           System.out.println("Do you wanna make Again Transfer Amount?");
                           System.out.println("   1-Yes");
                           System.out.println("   2-No");
                           System.out.print("Please enter your Choice: ");
                           String option = yesOrNo(sc);
                           sc.nextLine();
                           if(option.equals("2"))
                           {
                                   bool=true;
                           }
                   }
           }
   }
   public static void OperationOfChoice9(BankAccount ba)
   {
           ArrayList<Accounts> accounts = ba.getAccounts();
           if(accounts.size()!=0)
           {  
                   System.out.println("Type           "+"  Name               "+ "CNIC Number         "+"Date Of Birth    "+"Account Balance\n   ");
                   for(int i=0;i<accounts.size();i++)
                   {
                           System.out.println(accounts.get(i).draw());
                   }
           }
           else
           {
                   System.out.println("\nNo any account Registered yet.\n");
           }
   }	
   public static void OperationOfChoice10(BankAccount ba)
   {
           ArrayList<LoanType> loanType = ba.getLoanAccounts();
           if(loanType.size()!=0)
           {  
                   System.out.println("Type           "+"    Name             "+ "CNIC Number         "+"Date Of Birth    "+"Loan Amount\n   ");
                   for(int i=0;i<loanType.size();i++)
                   {
                          System.out.println(loanType.get(i).draw());
                   }
           }
           else
           { 
                   System.out.println("\nNo any loan account Registered yet.\n");
           }
   }
     
}