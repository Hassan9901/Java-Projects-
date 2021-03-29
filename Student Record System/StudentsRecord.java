//Hassan Raza 
//Roll # 191370067
//Section (A)
import java.util.*;
public class StudentsRecord{
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Number of Students : ");
		int num = input.nextInt();
		 
		while (!(num >= 5 && num <= 10)) {
			System.out.println("You can choose numbers between 5 to 10");
			System.out.print("Enter again Number of Students : ");
			num = input.nextInt();
		}
		
		String[][] students = new String[num][3];
		
		manu();
		
		System.out.print("Enter Your choice : ");
		int choice = input.nextInt();
		
		while (!(choice >= 0 && choice <= 9)) {
			System.out.println("Invalid choice......!!!!!");
			System.out.print("Enter choice again : ");
			choice = input.nextInt();
		}
	
		int currentsize = 0;
		
		while (!(choice == 0)) {
			
			if (choice == 1) {
				if (add(students,currentsize)) {
					System.out.print("Enter ID : ");
					students[currentsize][0] = input.next();
					System.out.print("Enter Age : ");
					students[currentsize][1] = input.next();
					System.out.print("Student name : ");
					students[currentsize][2] = input.next();
					currentsize++;
				}
				else
					System.out.println("\nThe list is full. No more students can be added\n");
			}
			
			else if (choice == 2) {
				System.out.print("Enter ID you want : ");
				String key = input.next();
				int index = searchByID(students,currentsize,key);
				if (index >= 0) {
					System.out.println("Student ID found At : "+index);
					System.out.println("Student Name is "+students[index][2]);
					System.out.println("Student Age is "+students[index][1]);
				}
				else if (index == -1) {
					System.out.print("Student ID not FOUND!!!");
				}
			}
			
			else if (choice == 3) {
				System.out.print("Enter AGE of student you want : ");
				String key = input.next();
				int index = searchByAGE(students,currentsize,key);
				if (index >= 0) {
					System.out.print("Student AGE found At : "+index);
					System.out.println("Student Name is "+students[index][2]);
					System.out.println("Student ID is "+students[index][0]);
				}
				else if (index == -1) {
					System.out.print("Student AGE not FOUND!!!");
				}
			}
			
			else if (choice == 4) {
				System.out.print("Enter NAME of student you want : ");
				String key = input.nextLine();
				input.next();
				int index = searchByNAME(students,currentsize,key);
				if (index >= 0) {
					System.out.print("Student NAME found At : "+index);
					System.out.println("Student ID is "+students[index][0]);
					System.out.println("Student Age is "+students[index][1]);
				}
				else if (index == -1) {
					System.out.print("Student NAME not FOUND!!!");
				}
			}
			
			else if (choice == 5) {
				sortByID(students,currentsize);
			}
			
			else if (choice == 6) {
				sortByAGE(students,currentsize);
			}
			
			else if (choice == 7) {
				sortByNAME(students,currentsize);
			}
			
			else if (choice == 8) {
				display(students,currentsize);
			}
			
			else if (choice == 9) {
				reverse(students,currentsize);
			}
			
			manu();
			System.out.print("Enter your choice : ");
			choice = input.nextInt();
			while(!(choice >= 0 && choice <= 9)){
				System.out.println("InValid choice!!!");
				System.out.print("Enter your choice : ");
				choice = input.nextInt();
			}
		}
	}
	public static void manu(){
		
		System.out.println("Press 0 to exit");
		System.out.println("Press 1 to Add a new Student");
		System.out.println("Press 2 to search by ID");
		System.out.println("Press 3 to search by Age");
		System.out.println("Press 4 to search by Name");
		System.out.println("Press 5 to sort by ID");
		System.out.println("Press 6 to sort by Age");
		System.out.println("Press 7 to sort by Name");
		System.out.println("Press 8 to Display all students");
		System.out.println("Press 9 to Display all students in reverse order");
		
	}
	public static boolean add(String[][] students , int currentsize){
		
		boolean can_add = false;
		if (currentsize < students.length) {
			can_add = true;
		}
		return can_add;
	}
	public static int searchByID(String[][] students,int currentsize , String key){
		
		int col = 0;
		int found = -1;
		for (int i = 0;i < currentsize ;i++ ) {
			if (key.equalsIgnoreCase(students[i][0])) {
				found = i;
			}
		}
		return found;
	}
	public static int searchByAGE(String[][] students,int currentsize , String key){
		
		int col = 1;
		int found = -1;
		for (int i = 0;i < currentsize ;i++ ) {
			if (key.equalsIgnoreCase(students[i][1])) {
				found = i;
			}
		}
		return found;
	}
	public static int searchByNAME(String[][] students,int currentsize , String key){
		
		int col = 2;
		int found = -1;
		for (int i = 0;i < currentsize ;i++ ) {
			if (key.equalsIgnoreCase(students[i][2])) {
				found = i;
			}
		}
		return found;
	}
	public static void sortByID(String[][] students , int currentsize){
		
		String[][] newA = new String[currentsize][3];
		int minindex;
		String minValue0 = "";
		String minValue1 = "";
		String minValue2 = "";
		for (int i = 0;i < currentsize-1 ;i++ ) {
			minindex = i;
			minValue0 = students[i][0];
			minValue1 = students[i][1];
			minValue2 = students[i][2];
			int j;
			for (j = i+1;j < currentsize ;j++ ) {
				if (Integer.parseInt(minValue0) > Integer.parseInt(students[j][0])) {
					minValue0 = students[j][0];
					minValue1 = students[j][1];
					minValue2 = students[j][2];
					minindex = j;
				}
			}
			students[minindex][0] = students[i][0];
			students[minindex][1] = students[i][1];
			students[minindex][2] = students[i][2];
			students[i][0] = minValue0;
			students[i][1] = minValue1;
			students[i][2] = minValue2;
		}
		for (int i = 0;i < currentsize ;i++ ) {
			for (int j = 0;j < students[0].length ;j++ ) {
				System.out.print(students[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void sortByAGE(String[][] students , int currentsize){
		
		String[][] newA = new String[currentsize][3];
		int minindex;
		String minValue0 = "";
		String minValue1 = "";
		String minValue2 = "";
		for (int i = 0;i < currentsize-1 ;i++ ) {
			minindex = i;
			minValue0 = students[i][0];
			minValue1 = students[i][1];
			minValue2 = students[i][2];
			int j;
			for (j = i+1;j < currentsize ;j++ ) {
				if (Integer.parseInt(minValue1) > Integer.parseInt(students[j][1])) {
					minValue0 = students[j][0];
					minValue1 = students[j][1];
					minValue2 = students[j][2];
					minindex = j;
				}
			}
			students[minindex][0] = students[i][0];
			students[minindex][1] = students[i][1];
			students[minindex][2] = students[i][2];
			students[i][0] = minValue0;
			students[i][1] = minValue1;
			students[i][2] = minValue2;
		}
		for (int i = 0;i < currentsize ;i++ ) {
			for (int j = 0;j < students[0].length ;j++ ) {
				System.out.print(students[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void sortByNAME(String[][] students , int currentsize){
		
		String[][] newA = new String[currentsize][3];
		int minindex;
		String minValue0 = "";
		String minValue1 = "";
		String minValue2 = "";
		for (int i = 0;i < currentsize-1 ;i++ ) {
			minindex = i;
			minValue0 = students[i][0];
			minValue1 = students[i][1];
			minValue2 = students[i][2];
			int j;
			for (j = i+1;j < currentsize ;j++ ) {
				if (minValue2.charAt(0) > students[j][2].charAt(0)) {
					minValue0 = students[j][0];
					minValue1 = students[j][1];
					minValue2 = students[j][2];
					minindex = j;
				} 
			}
			students[minindex][0] = students[i][0];
			students[minindex][1] = students[i][1];
			students[minindex][2] = students[i][2];
			students[i][0] = minValue0;
			students[i][1] = minValue1;
			students[i][2] = minValue2;
		}
		for (int i = 0;i < currentsize ;i++ ) {
			for (int j = 0;j < students[0].length ;j++ ) {
				System.out.print(students[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void display(String[][] students,int currentsize){
		
		for (int i = 0;i < currentsize ;i++ ) {
			for (int j = 0;j < students[0].length ;j++ ) {
				System.out.print(students[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void reverse(String[][] students, int currentsize){
		
		for (int i = currentsize-1;i >=0 ;i--) {
			for (int j = students[0].length-1;j >= 0 ;j-- ) {
				System.out.print(students[i][j]+" ");
			}
			System.out.println();
		}
	}
}