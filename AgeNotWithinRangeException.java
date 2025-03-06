package StudentManagementSystem;

public class AgeNotWithinRangeException extends Exception {
	
	public String toString(){
		return ("Age Should be between 15 and 21");
	}

}
