import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		String Original, Reverse = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Original word: ");
		Original = scan.nextLine();
		String[] strArray = Original.split(" ");
		
		for (int i = 0; i < strArray.length; i++) {
			
			for (int j = strArray[i].length()- 1; j >= 0; j--) {
				System.out.print(strArray[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
