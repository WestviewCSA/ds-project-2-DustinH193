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
			
			int numRows  = scanner.nextInt();
			int numCols  = scanner.nextInt();
			int numRooms = scanner.nextInt();

			int rowIndex = 0;
			
			//process the map!
			while(scanner.hasNextLine()) {
				//grab a line (one row of the map0
				String row = scanner.nextLine();
				
				if(row.length()>0) {
					for(int i = 0; i < numCols && i < row.length(); i++) {
						char el = row.charAt(i);
						Tile obj = new Tile(rowIndex, i, el);
					}
				}
				
		}
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//handle exception
		}
		
	}
}
