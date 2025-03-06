package VoteIDmanagement;

public class Voter {

	int voterid;
	int age;
	String name;
	
	Voter(int voterid, String name, int age)
	{
		int v=voterid;
		int a=age;
		String n=name;
		
		try {
			if (a <18)
				throw new InvalidAgeforVoterException();
		}catch(InvalidAgeforVoterException e){
			System.out.println("Age is invalid");
		}
	}
	
}
