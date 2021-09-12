
public class Program {
	private String name;
	private final int byteSize; // inaltered
	private String description;
	private boolean root; // Whether the program needs to be altered in root mode or not.
	private boolean running;
	Program (String name, int size, String description, boolean root) {
		this.name = name;
		this.description = description;
		this.byteSize = size;
		this.root = root;
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
		this.running = true;
	}
	public void closeProgram() {
		System.out.printf("You have closed %s.\n", this.name);
		this.running = false;
	}
}
