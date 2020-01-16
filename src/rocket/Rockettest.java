package rocket;
public class Rockettest 
{
	static Rocket launch_list[] = new Rocket[5];

	static Rocket rock1 = new Rocket("CHANDRAYAN","INDIA",562,230,97,5600);
	static Rocket rock2 = new Rocket("VOYAGER","USA",623,205,85,4922);
	static Rocket rock3 = new Rocket("SPUTNIK","USSR",423,285,89,4978);
	static Rocket rock4 = new Rocket("YINGHUO","CHINA",456,245,90,5123);
	static Rocket rock5 = new Rocket("QUASSAM","ISRAEL",398,233,92,5060);
	
	public Rockettest()
	{
	launch_list[0]= rock1;
	launch_list[1]= rock2;
	launch_list[2]= rock3;
	launch_list[3]= rock4;
	launch_list[4]= rock5;
	}
	
	public static void storerocketlist()
	{
	for (int i = 0; i < launch_list.length ; i++)
	{
		Rocket rock_database = launch_list[i];			  // assigning the constructed details to object 'rok'
		rock_database.totalweight();
		System.out.println("\n"+ (i+1)+".)" + rock_database);               
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
	}}
 	 	
 	public static void main(String args[]) 
	{	
		System.out.println("\n  ASSIGNMENT-2" + "\n NAVEEN RAJENDRAN " + "\n NUID:001304569");
		System.out.println("\n ROCKET DATABASE"); 
		System.out.println("PRINTING THE DETAILS");
		Rockettest rocket = new Rockettest();
		//storerocketlist();
		LaunchSheduler l1 = new LaunchSheduler();
		MSrocket.buildrocket();
		RocketIO io = new RocketIO();
		Tractor t = new Tractor();
	}
	
}