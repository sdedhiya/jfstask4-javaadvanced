package VoteIDmanagement;
import java.util.Scanner;

public class VoterMain {

		int voterid, age;
		String name;
		
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your voterid, name, age");
			int voterid=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			
			
			Voter v1=new Voter(voterid, name, age);
			
			
		}

	}

	

//Output:
//
//	Enter your voterid, name, age
//	100 sneha 12
//	Age is invalid