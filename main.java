package average;
import java.util.*;
public class main {
	public static void main(String[] args)  
	{  
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter id ");  
	int id = sc.nextInt();  
	System.out.print("enter name ");  
	String name = sc.nextLine();  
	System.out.print("enter exp ");  
	int exp = sc.nextInt();  
	System.out.print("enter matches played ");  
	int mp = sc.nextInt();
	System.out.print("runs scored ");
	int runs = sc.nextInt();
	int avg = runs/mp;
	if (avg >= 80 && avg <=100) {
		System.out.print("Grade A");
	}
	else if (avg >= 50 && avg <=79) {
		System.out.print("Grade B");
	}
	else {
		System.out.print("Grade C");
	}
	}  
	} 
