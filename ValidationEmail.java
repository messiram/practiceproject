package emailvalidation;
import java.util.ArrayList;
import java.util.Scanner;
public class ValidationEmail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> mail = new ArrayList<String>();
		mail.add("sriram@gmail.com");
		mail.add("praveen@gmail.com");
		mail.add("master@gmail.com");
		mail.add("shiva@gmail.com");
		mail.add("kiran@gmail.com");
		System.out.println("ENTER USER EMAIL ID:");
		String userId = input.nextLine();
		//checks user mail id and shows found or not
			if (mail.contains(userId)) {
				System.out.println();
				System.out.println("Email ID " + userId + " found");
			} 
			else {
				System.out.println("Email ID " + userId + " Not found");

			}
			input.close();
			}
	
	}
