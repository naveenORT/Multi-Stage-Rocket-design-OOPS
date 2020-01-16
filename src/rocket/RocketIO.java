package rocket;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class RocketIO {
	
	static String base = "src/rocket/";
	String file_name;
	ArrayList<MSrocket> store_details = new ArrayList<MSrocket>();

	MSrocket m1 = MSrocket.build_list[0];
	MSrocket m2 = MSrocket.build_list[1];
	MSrocket m3 = MSrocket.build_list[2];
	MSrocket m4 = MSrocket.build_list[3];
	MSrocket m5 = MSrocket.build_list[4];
	
	public RocketIO()
	{	
		
		store_list(); // storing all instances to file
		store_individual(); //storing details of each rocket in separate files
	}
	
	private static void list_save(String file_name, ArrayList<MSrocket> store_list) 
	{
	try {	
		FileWriter writer  = new FileWriter(base + file_name); //getting file name & rocket list as parameters
		writer.write("\n"+ store_list);	      // storing rocket_list
		writer.close();
		}
	catch (FileNotFoundException e) 
		{
		System.out.println("FILE NOT FOUND");
		e.printStackTrace();
		} 
	catch (IOException e) 
	{
		System.out.println("IO ERROR");
		e.printStackTrace();
	}}
	
	private static void individual_save(String file_name, MSrocket m) //getting file name & rocket list as parameters
	{
	try {		
			FileWriter writer  = new FileWriter(base + file_name);
			writer.write("\n"+ m);	
			writer.close();
		}
	catch (FileNotFoundException e) 
	{
		System.out.println("FILE NOT FOUND");
		e.printStackTrace();
	} 
	catch (IOException e) 
	{
		System.out.println("IO ERROR");
		e.printStackTrace();
	}}
	
	public void store_individual() 
	{
		RocketIO.individual_save("ROCKET1_DETAILS.txt",m1); //passing file name & rocket list as parameters
		
		RocketIO.individual_save("ROCKET2_DETAILS.txt",m2); //passing file name & rocket list as parameters
		
		RocketIO.individual_save("ROCKET3_DETAILS.txt",m3); //passing file name & rocket list as parameters
		
		RocketIO.individual_save("Rocket4_DETAILS.txt",m4); //passing file name & rocket list as parameters
			
		RocketIO.individual_save("ROCKET5_DETAILS.txt",m5); //passing file name & rocket list as parameters
	} 
	
	public void store_list() 
	{
		
		
		store_details.add(m1); //adding object to list
		
		store_details.add(m2); //adding object to list	
		
		store_details.add(m3); //adding object to list
	
		store_details.add(m4); //adding object to list
		
		store_details.add(m5); //adding object to list
		
		RocketIO.list_save("TOTAL_ROCKET_LIST.txt", store_details);  //passing file name & rocket list as parameters	
	}
}
