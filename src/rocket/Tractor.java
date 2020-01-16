package rocket;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tractor {
	String base = "src/rocket/";
	String file_name;
	public void load(String file_name) 
	{
	try {
			FileReader reader = new FileReader(base + file_name);
			int inVal = reader.read();
			while(inVal >= 0)
			{
				System.out.print("");
				System.out.print((char) inVal);
				inVal = reader.read();
			}
				reader.close();
			} 
			catch (FileNotFoundException e) {
				System.out.println("FILE NOT FOUND");
				e.printStackTrace();
			} 
			catch (IOException e) {
				System.out.println("IO ERROR");
				e.printStackTrace();
			}
		}
	public Tractor() 
	{
		System.out.println("\n"+"\n READING ROCKET1 FROM DISK FROM LOCATION " + base + "ROCKET5_DETAILS.txt");
		load("ROCKET1_DETAILS.txt");
		
		System.out.println("\n"+"\n READING ROCKET2 FROM DISK FROM LOCATION " + base + "ROCKET5_DETAILS.txt");
		load("ROCKET2_DETAILS.txt");
		
		System.out.println("\n"+"\n READING ROCKET3 FROM DISK FROM LOCATION " + base + "ROCKET5_DETAILS.txt");
		load("ROCKET3_DETAILS.txt");
		
		System.out.println("\n"+"\n READING ROCKET4 FROM DISK FROM LOCATION " + base + "ROCKET4_DETAILS.txt");
		load("ROCKET4_DETAILS.txt");
		
		System.out.println("\n"+"\n READING ROCKET5 FROM DISK FROM LOCATION " + base + "ROCKET5_DETAILS.txt");
		load("ROCKET5_DETAILS.txt");
		
		System.out.println("\n"+"\n READING ROCKET LIST FROM DISK FROM LOCATION " + base + "TOTAL_ROCKET_LIST.txt" );
		load("TOTAL_ROCKET_LIST.txt");
	}
}
