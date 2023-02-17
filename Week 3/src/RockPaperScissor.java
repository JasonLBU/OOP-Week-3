import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

	public static void main(String[] args) {

	    String personPlay;    //User's play -- "R", "P", or "S"
	  	String computerPlay = "";  //Computer's play -- "R", "P", or "S"
	  	int computerInt;      //Randomly generated number used to determine
	  	                      //computer's play

	  	Scanner scan = new Scanner(System.in);
	  	Random generator = new Random();
	  	
	  	System.out.print("(R), (P), (S):");
	  	personPlay = scan.next();
	  	computerInt = generator.nextInt(0,3);
	  	System.out.println(computerInt);
	  	
		//Get player's play -- note that this is stored as a string
		//Make player's play uppercase for ease of comparison
		//Generate computer's play (0,1,2)
		//Translate computer's randomly generated play to string
	  	
		switch (computerInt){
		case 0:
			computerPlay = "R";
			break;
		case 1:
			computerPlay = "P";
			break;
		case 2:
			computerPlay = "S";
			break;
		}
		
		System.out.printf("The computer has chosen: '%s'", computerPlay);

		//Print computer's play
		//See who won.  Use nested ifs instead of &&.
		if (personPlay.equals(computerPlay)) {
		    System.out.println("It's a tie!");
		}
		else if (personPlay.equals("R")) {
		    if (computerPlay.equals("S")) {
		    	System.out.println("Rock crushes scissors.  You win!!");
		    }
		
		    else {
		    	System.out.println("Paper crushes Rock. You lose!!");
		    	
		    }

			//...  Fill in rest of code
		}
		else if (personPlay.equals("S")) {
			if (computerPlay.equals("P")) {
				System.out.println("Scissors cuts paper. You win!!");
			}
			else {
				System.out.println("Rock crushes scissors. You lose!!");
			}
		}
		else if (personPlay.equals("P")) {
			if (computerPlay.equals("R")) {
				System.out.println("Paper folds rock. You win!!");
			}
			else {
				System.out.println("Scissors cuts paper. You lose!!");
			}
		}
	}

}
