package rocket;
	
public class LaunchEvent  
	{
	static int launchidcount = 1; 
	private int launchid;
	private String missionname;
	private String launch_date;
	private Rocket a;
	
	public Rocket getRocket() {
		return a;
	}
	public void setRocket(Rocket a) {
		this.a = a;
	}

	public LaunchEvent( String missionname, String launch_date, Rocket rt) 
	{
		setLaunchid(launchid);
		setMissionname(missionname);
		setLaunch_date(launch_date);
		this.a = rt;
	}
		
	public int getLaunchid() 
	{
		return launchid;
	}

	public void setLaunchid(int launchid) 
	{
		launchid = launchidcount++;    //ini
		this.launchid = launchid;
	}

	public String getMissionname() {
		return missionname;
	}

	public void setMissionname(String missionname) {
		this.missionname = missionname;
	}

	public String getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(String launch_date) {
		this.launch_date = launch_date;
	}
		
	public String toString() 
	{
			return ( "\n LAUNCH-id = " + launchid + ",  MISSION-NAME - " + missionname  + ", LAUNCH-DATE -  " + launch_date + "\n ROCKET NAME = " + a.rocket_name + "\n MANUFACTURER = " + a.manufacturer +
					"\n SHUTTLE MASS = " + a.getShuttle_mass() + " Tonnes"  + "\n FUEL LOAD = " + a.getFuel_load() +" Tonnes" + "\n PAYLOAD WEIGHT = " + a.getPayload_weight() + " Tonnes" 
					+ "\n ENGINE THRUST = " + a.getEngine_thrust() + "N" + "\n Total weight=" + a.totalweight() );      // formatter
	}

	}
   
	
	
	















