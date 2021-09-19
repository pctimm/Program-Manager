import java.util.Scanner;
public class Program {
	Scanner keyboard = new Scanner(System.in);
	private String name;
	private final int byteSize; // inaltered
	private String description;
	private boolean root; // Whether the program needs to be altered in root mode or not.
	private boolean running;
	
	private static int numberOfRunning = 0;
	
	// Constructor 1. Putting arguments within the collons;
	Program (String name, int size, String description, boolean root) {
		this.name = name;
		this.description = description;
		this.byteSize = size;
		this.root = root;
		this.running = false;
	}
	
	// Constructor 2. Reading from keyboard the info.
	Program () {
		System.out.println("The name of the program: ");
		this.name = keyboard.nextLine();
		System.out.println("Description: ");
		this.description = keyboard.nextLine();
		System.out.println("Size in KB ");
		this.byteSize = keyboard.nextInt();
		System.out.println("Requires root access? ");
		this.root = keyboard.nextBoolean();
		System.out.println("Program created succesfully.");
		this.running = false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
		System.out.printf("The file has been renamed to %s succesfully.\n", newName);
	}
	
	public int getProgramSize() {
		return byteSize;
	}
	public int getProgramSize(int M) {
		int returningSize = byteSize;
		for (int i = 1; i <= M; i ++) {
			returningSize = returningSize / 1000;
		}
		return returningSize;
	}
	public String getProgramDescription() {
		return this.description;
	}
	public void setProgramDescription(String newDescription) {
		this.description = newDescription;
	}
	public boolean isRoot() {
		return this.root;
	}
	public boolean isRunning() {
		return this.running;
	}
	public void runProgram() {
		System.out.printf("You have opened %s.\n", this.name);
		numberOfRunning ++;
		this.running = true;
	}
	public void closeProgram() {
		System.out.printf("You have closed %s.\n", this.name);
		numberOfRunning --;
		this.running = false;
	}
	
	public static int getNumberOfRunning() {
		return numberOfRunning;
	}
}
