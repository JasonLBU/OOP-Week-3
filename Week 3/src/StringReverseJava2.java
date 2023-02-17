import java.util.Scanner;
public class StringReverseJava2 {

	public static void main(String[] args) {
		String sentence, output = " ";
		char ch;
		
		System.out.print("Please enter a string:");
		Scanner scan = new Scanner(System.in);
		sentence = scan.nextLine();
		scan.close();
		
		for (int i = 0; i < sentence.length(); i++) {
			ch = sentence.charAt(i);
			
			if (!Character.isWhitespace(i)){
				output = ch+ output;
			}
			else if (Character.isWhitespace(ch)) {
				System.out.print(output);
				output = "  ";
			}
			if (i == sentence.length() - 1){
				System.out.print(output);
			}
		}
	}

}
