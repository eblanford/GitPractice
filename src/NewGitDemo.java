import java.util.Scanner;

public class NewGitDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;

		System.out.println("Please tell me your name: ");
		userName = scan.nextLine();

		System.out.println("Your name is: " + userName);
		scan.close();

	}

}
