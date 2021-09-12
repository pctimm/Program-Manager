
public class File {
	private String name;
	private final int byteSize; // inaltered
	private String description;
	private boolean root; // Whether the archive needs to be altered in root mode or not.
	
	File (String name, int size, String description, boolean root) { // constructor
		this.name = name;
		this.byteSize = size;
		this.description = description;
		this.root = root;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
		System.out.printf("The file has been renamed to %d succesfully.\n", newName);
	}
	
	public int getFileSize() {
		return byteSize;
	}
	public int getFileSize(int M) {
		int returningSize = byteSize;
		for (int i = 1; i <= M; i ++) {
			returningSize = returningSize / 1000;
		}
		return returningSize;
	}
	public String getFileDescription() {
		return this.description;
	}
	public boolean isRoot() {
		return this.root;
	}
	public void openFile() {
		System.out.println("The file is opened.");
	}
}
