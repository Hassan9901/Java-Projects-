import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Database {
	
	
		public ArrayList<String> loadData(String fileName) throws Exception{
			File f=new File(fileName);
			ArrayList <String> arraylist=new ArrayList<String>(); 
			Scanner read=new Scanner(f);
			while(read.hasNext()) {
				arraylist.add(read.nextLine());
				
				
			}
			
			
			return arraylist;
		}
		
		
		// Complete the implementation for this method
		// This method will accept an arrayList and a file name and store the
		// complete data from ArrayList to the file
		public void storeData(ArrayList<String> list, String fileName) throws IOException {
			FileWriter fw=new FileWriter(fileName);
			for(String w:list) {
				fw.write(w+"\n");
				
			}
			fw.close();
		
		}
}
