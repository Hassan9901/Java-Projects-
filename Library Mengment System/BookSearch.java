import java.util.*;
public class BookSearch {
	private String title;
	Database data=new Database();
	
	
		public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		
		this.title = title;
	}

		public void searchBook() throws Exception {
			ArrayList <String> array=new ArrayList <String> ();
		 array=data.loadData("src/Database.txt");
		 for (int i=0;i<array.size() ;i++ ) {
				if (array.get(i).contains(getTitle())) {
					System.out.println(array.get(i));
				}
			}
		
			
			
		}
}
