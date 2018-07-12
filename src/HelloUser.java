import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		System.out.println("Ievadi savu vardu un uzvardu ");
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		
		//String str1 = "Emils Lapins";
		
		String toCut = " ";
		int index = str1.indexOf(toCut);
		System.out.println("TEST : index: " + index);
		
		//String name = str1.substring(0, index);
		String nameC = str1.substring(0,1).toUpperCase() + str1.substring(1, index).trim();
		System.out.println(nameC);
		
		String surname = str1.substring(index + 1).trim().toUpperCase();
		
		System.out.println("'"+ nameC + " " + surname + "'");
		
		
	
		
		
		
	}

}
