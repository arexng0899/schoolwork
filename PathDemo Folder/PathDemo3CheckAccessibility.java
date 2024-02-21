
import static java.nio.file.AccessMode.EXECUTE;
import static java.nio.file.AccessMode.READ;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo3CheckAccessibility {
	public static void main(String[] args) {
		Path filePath = Paths.get("C:\\Java\\Chapter.13\\PathDemo.txt");
		System.out.println("Path is " + filePath.toString());
		try {
			filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
			System.out.println("File can be read and executed");
		} catch (IOException e) {
			System.out.println("File cannot be used for this application");
		}
	}
}
