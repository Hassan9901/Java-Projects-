import java.io.FileWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BookCheckout {
	int mem_id;
	String bookid;
	Database db=new Database();
	ArrayList<String> arraylist=new ArrayList<String>();
	String [] arrayOfString;
	int index=-1;
	
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public boolean isAvailable() throws Exception {
		arraylist=db.loadData("src/Database.txt");
		for(int i=0;i<arraylist.size(); i++) {
			this.arrayOfString=arraylist.get(i).split(",");
			
			if(arrayOfString[0].equals(getBookid())) {
				
				if(arrayOfString[5].equals("0")) {
					
					index=i;
					return true;
				}
			}
			
		}
		return false;
	}
     public void checkOut(int id) throws Exception  {
    	 setMem_id(id);
    	
    	 String[] tem=arraylist.get(index).split(",");
    	 
    	 tem[5]=String.valueOf(getMem_id());
    	 
    	 String temp= "";
    	 for(int i=0;i<tem.length;i++) {
    		 if(i==tem.length-1) {
    			 temp+=tem[i]; 
    		 }else {
    			 temp+=tem[i]+",";
    		 }
    		 
    	 }
    	 arraylist.set(index, temp);
    	 db.storeData(arraylist,"src/Database.txt");
    	 
    	 ArrayList<String> print=new ArrayList<String>();
    	 print=db.loadData("src/Database.txt"); 
    	 for (int i = 0; i < print.size(); i++) {
    		 System.out.println(print.get(i));
		}
    	
    	 
	}
     public void log() throws Exception {
    	 ArrayList<String> log=new ArrayList<String>();
    	 log=db.loadData("src/Log.txt");
    	 String [] arr=arraylist.get(index).split(",");
    	 DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         Date dateobj = new Date();
         String date=df.format(dateobj);
         
    	 String borrow="borrow,"+ arr[0]+ ","+ arr[2] + "," + date;
    	 
    	 
    	 
    	 log.add(borrow);
    	
    	 db.storeData(log,"src/Log.txt");
    	 ArrayList<String> print=new ArrayList<String>();
    	 print=db.loadData("src/Log.txt"); 
    	 for (int i = 0; i < print.size(); i++) {
    		 System.out.println(print.get(i));
		}
    	 
    	 
     }
}
