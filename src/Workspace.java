import java.util.ArrayList;
import java.util.Scanner;
public class Workspace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Directory rootDir = new Directory("root");
		System.out.println("Create new directory?");
		String n = in.nextLine();
		
		rootDir.createDirectory(n);
		
		

	}

}
