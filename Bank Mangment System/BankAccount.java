import java.util.*;
class BankAccount extends Accounts implements Interface
{
    private ArrayList<Accounts> accounts;
    private ArrayList<LoanType> loanType;
    
    public BankAccount()
    {
         accounts = new ArrayList<Accounts>();
         loanType = new ArrayList<LoanType>();	
    }
    public boolean addAccount(Accounts a)
    {
         if((verifyIdentity(a)))
         {
              accounts.add(a);
              return true; 
         }
         else
         { 
              return false;
         }
    }
     public boolean addLoanAccount(LoanType l)
     { 
          if((verifyIdentityforLoan(l)))
          {
               loanType.add(l);
               return true; 
          }
          else
          { 
               return false;
          }
    }
    public void removeAccount(Accounts a)
    {
          accounts.remove(a);
    }
    public boolean verifyIdentity(Accounts a)
    {
          boolean bool = true;
          if(accounts.size()!=0)
          {
               for(int i=0;i<accounts.size();i++)
               {
                    if(accounts.get(i).getCNICNumber().equals(a.getCNICNumber()))
                    {
                         bool=false; 
                    } 
               }
          }
          return bool;
    }
    public boolean verifyIdentityforLoan(LoanType l)
    {
          boolean bool = true;
          if(loanType.size()!=0)
          {
               for(int i=0;i<loanType.size();i++)
               {
                    if(loanType.get(i).getCNICNumber().equals(l.getCNICNumber()))
                    {
                         bool=false; 
                    } 
               }
          }
          return bool;
    }
    public int getAccountsSize()
    {
          return accounts.size();
    }
    public int getLoanAccountsSize()
    {
          return loanType.size();
    }
    public ArrayList<Accounts> getAccounts()
    {
          return accounts;
    }
     public ArrayList<LoanType> getLoanAccounts()
    {
          return loanType;
    }
    public boolean getRecord(String cnic)
    {
          boolean bool =false;
          for(int i=0;i<accounts.size();i++)
          {
               if(accounts.get(i).getCNICNumber().equals(cnic)) 
               {
                     bool= true; 
               }
          }
          return bool;
    }
    @Override
    public boolean getRecordforLoan(String cnic)
    {
          boolean bool =false;
          for(int i=0;i<loanType.size();i++)
          {
               if(loanType.get(i).getCNICNumber().equals(cnic)) 
                {
                     bool= true; 
                }
          }
          return bool;
    }
    public int getIndex(String cnic)
    {
          int bool =0;
          for(int i=0;i<accounts.size();i++)
          {
                if(accounts.get(i).getCNICNumber().equals(cnic)) 
                {
                     bool= i; 
                }
          }
          return bool;
    }
    public int getIndexforLoan(String cnic)
    {
          int bool =0;
          for(int i=0;i<loanType.size();i++)
          {
                if(loanType.get(i).getCNICNumber().equals(cnic)) 
                {
                     bool= i; 
                }
        }
        return bool;
    }
    @Override
    public void remainingBalance()
    {
      double remainingAmount=getTotalBalance()-depositAmount(4577);
      System.out.println(remainingAmount);
    }
}