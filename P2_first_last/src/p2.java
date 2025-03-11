import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p2");
		
		readMap("TestO1");
	}

	public static void readMap(String filename) {
		
		try {
			File file = new File(filename);
			Scanner scanner= new Scanner(file);
			
			int numRows = scanner.nextInt();
			int numCols = scanner.nextInt();
			int numRooms = scanner.nextInt();

		} catch (FileNotFoundException e) {
			System.out.println(e);
			//handle exception
		}
		
	}
}
