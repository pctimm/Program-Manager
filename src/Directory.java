import java.util.ArrayList;
public class Directory {
	String name;
	String path;
	int numberFiles;
	int numberProgram;
	int numberDirectories;
	
	Directory (String name) {
		this.name = name;
	}
	ArrayList <File> dirFiles = new ArrayList <File> ();
	ArrayList <Program> dirPrograms = new ArrayList <Program> ();
	ArrayList <Directory> dirDirectories = new ArrayList <Directory> ();
	
	public void moveFile(File fileMoving) {
		dirFiles.add(fileMoving);
		System.out.println("Moved ".concat(fileMoving.getName().concat(" succesfully.")));
	}
	
	public void moveProgram(Program programMoving) {
		dirPrograms.add(programMoving);
		System.out.println("Moved ".concat(programMoving.getName().concat(" succesfully.")));
	}
	public void moveDirectory(Directory dirName) {
		dirDirectories.add(dirName);
		System.out.println("Moved Directory Succesfully.");
	}
	
	public void createDirectory(String name) {
		moveDirectory(new Directory(name));
	}
	
	
}
