import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathDemo2 {
	public static void main(String[] args) {
		String name;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a file name >> ");
		name = keyboard.nextLine();
		Path inputPath = Paths.get(name);
		Path fullPath = inputPath.toAbsolutePath();
		System.out.println("Full path is " + fullPath.toString());
	}
}