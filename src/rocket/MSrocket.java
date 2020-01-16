package rocket;
public class MSrocket   
	{
	private int stage_num;
	private double updated_mass;
	private double updated_thrust;
	static MSrocket build_list[] = new MSrocket[5];
	int flag = 3 ;
	LaunchEvent le;
	
	static LaunchEvent le1 = LaunchSheduler.event_list[0];
	static LaunchEvent le2 = LaunchSheduler.event_list[1];
	static LaunchEvent le3 = LaunchSheduler.event_list[2];
	static LaunchEvent le4 = LaunchSheduler.event_list[3];
	static LaunchEvent le5 = LaunchSheduler.event_list[4];
		
	public MSrocket(LaunchEvent l) 
	{	
		this.le = l;
		this.setStage_num(3);
		this.setUpdated_mass(updated_mass);
		this.setUpdated_thrust(updated_thrust);
	}	
	
	public static void buildrocket() 
	{	
		
		MSrocket m1 = new MSrocket(le1);		
		m1.updated_weight();
		m1.updated_thrust();
		build_list[0] = m1;
		
		MSrocket m2 = new MSrocket(le2);		
		m2.updated_weight();
		m2.updated_thrust();
		build_list[1] = m2;

		MSrocket m3 = new MSrocket(le3);	
		m3.updated_weight();
		m3.updated_thrust();
		build_list[2] = m3;

		MSrocket m4 = new MSrocket(le4);		
		m4.updated_weight();
		m4.updated_thrust();
		build_list[3] = m4;
		
		MSrocket m5 = new MSrocket(le5);		
		m5.updated_weight();
		m5.updated_thrust();
		build_list[4] = m5;
	
		print(); 
	}
	
	public void setUpdated_mass(double updated_mass) {
		this.updated_mass = updated_mass;
	}
	public static void print()
	{	
		System.out.println("UPDATED DETAILS OF ROCKET AFTER DETACHING");
		for (int i = 0; i < build_list.length ; i++)
		{
			MSrocket rock_stage = build_list[i];			  // assigning the constructed details to object 'rok'
			System.out.println("\n"+ (i+1)+".)" + rock_stage);               
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
			
		}
	} 
	public int getStage_num() {
		return stage_num;
	}

	public void setStage_num(int stage_num) {
		this.stage_num = stage_num;
	}

	public double getUpdated_mass() {
		return updated_mass;
	}
	
	public double updated_weight()
	{
		if(flag > 0)
		{
			if(flag == 3)
			{
			setUpdated_mass(le.getRocket().getLaunchpad_mass() - 100);	// using super to access parent class
			System.out.println("\n\n WEIGHT AFTER STAGE 1 ="+ updated_mass);
			flag--;
			}
			if(flag == 2)
			{
			setUpdated_mass(getUpdated_mass() - 200);	// using super to access parent class
			System.out.println("\n\n WEIGHT AFTER STAGE 2 ="+ updated_mass);
			flag--;
			}
		
			if(flag == 1)
			{
			setUpdated_mass(getUpdated_mass() - 300);	// using super to access parent class
			System.out.println("\n\n WEIGHT AFTER STAGE 3 ="+ updated_mass);
			}
		
		}				
		
		return getUpdated_mass();
	}
	
	public double getUpdated_thrust() {
		
		return updated_thrust;
	}

	public void setUpdated_thrust(double updated_thrust) {
		this.updated_thrust = updated_thrust;
	}

	public double updated_thrust()
	{
		if (stage_num == 2)
		{
			setUpdated_thrust(le.getRocket().getEngine_thrust() - 2000);	  // using super to access parent class
		
		}	
		if (stage_num == 3)
		{
			setUpdated_thrust(le.getRocket().getEngine_thrust() - 2500);		// using super to access parent class
		
		}
		if (stage_num == 4)
		{
			setUpdated_thrust(le.getRocket().getEngine_thrust() - 3000);		// using super to access parent class
		
		}	
		return getUpdated_thrust();
	}
	
	public String toString() 
	{
			return ( "\n "+  "\n LAUNCH-id = " + le.getLaunchid() + ",  MISSION-NAME - " + le.getMissionname()  + 
					", LAUNCH-DATE -  " + le.getLaunch_date() + "\n" + le.getRocket()+ 
					"\n No of STAGES= "+ getStage_num() + "\n WEIGHT AFTER DETACHING STAGE 3,2,1 ="  + getUpdated_mass() +"T"
					+ "\n UPDATED THRUST=" + getUpdated_thrust() +"N");      // formatter
	}
	
}
	
	