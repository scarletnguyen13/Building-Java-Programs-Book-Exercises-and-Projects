import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class DirectoryCrawler {
	public static void main (String[] args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		System.out.print("directory or file name? ");
		String name = console.nextLine();
		File f = new File(name);
		if (!f.exists()) {
			System.out.println("No such file/directory");
		} else {
			print(f,0);
		}
	}
	
	public static void print(File f, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("	");
		}
		System.out.println(f.getName());
		if (f.isDirectory()) {
			for (File subF : f.listFiles()) {
				print(subF, level + 1);
			}
		}
	}
}
