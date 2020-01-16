package rocket;
public class Rocket  
{
	public String rocket_name;
	public String manufacturer;     // public variables
	private double shuttle_mass;
	private double fuel_load;        // private variables( sensitive information which will be retrieved & assigned)
	private double payload_weight;   // through getter & setter methods
	private double engine_thrust;
	private double launchpad_mass;
	
	public Rocket(String rocket_name,String manufacturer, double shuttle_mass, double fuel_load, double payload_weight, double engine_thrust) 
	{
		this.rocket_name = rocket_name;
		this.manufacturer = manufacturer;
		setShuttle_mass(shuttle_mass);
		setFuel_load(fuel_load);
		setPayload_weight(payload_weight);
		setEngine_thrust(engine_thrust);
	}

	
	public void setShuttle_mass(double shuttle_mass)
	{
		this.shuttle_mass = shuttle_mass;	          //setter 
	}
	public double getShuttle_mass()
	{
		return this.shuttle_mass;                     //getter
	}
	public void setFuel_load(double fuel_load)
	{
		this.fuel_load = fuel_load;						//setter
	}
	public double getFuel_load()
	{
		return this.fuel_load;                       //getter
	}
	public void setPayload_weight(double Payload_weight )	
	{
		this.payload_weight = Payload_weight;         //setter
	}
	public double getPayload_weight()
	{
		return this.payload_weight;					//getter+
	}
	
	public void setEngine_thrust(double engine_thrust )	
	{
		this.engine_thrust = engine_thrust;			//setter
	}
	public double getEngine_thrust()
	{
		return this.engine_thrust;					//getter
	}	

	public double totalweight()
	{	
		setLaunchpad_mass(shuttle_mass+fuel_load+payload_weight);     // launch_pad weigher
		return getLaunchpad_mass();              
	} 
	
	public void setLaunchpad_mass(double launchpad_mass)
	{
	
	this.launchpad_mass = launchpad_mass;
		
	}	
	public double getLaunchpad_mass() {
		return launchpad_mass;
	}
	
	
	public String toString() 
	{
		return ("\n\n ROCKET SPECS \n ROCKET NAME = " + rocket_name + "\n MANUFACTURER = " + manufacturer +
				"\n SHUTTLE MASS = " + getShuttle_mass() + " Tonnes"  + "\n FUEL LOAD = " + getFuel_load() +" Tonnes" + "\n PAYLOAD WEIGHT = " + getPayload_weight() + " Tonnes" 
				+ "\n ENGINE THRUST = " + getEngine_thrust() + "N" + "\n TOTAL WEIGHT =" + getLaunchpad_mass() + " Tonnes" );      // formatter
	}


}