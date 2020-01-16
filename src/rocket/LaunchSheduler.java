package rocket;
import java.util.ArrayList;
import java.util.HashMap;

class LaunchSheduler 
{	
	private ArrayList<LaunchEvent> final_schedule = new ArrayList<LaunchEvent>();
	private HashMap<Integer, LaunchEvent> myMap = new HashMap<Integer,LaunchEvent>();
		
	static LaunchEvent event_list[] = new LaunchEvent[5];
	
	public LaunchSheduler()
	{
		
		Rockettest.rock1.totalweight();
		LaunchEvent le1 = new LaunchEvent("MOON","10.03.2019", Rockettest.rock1);		
		event_list[0] = le1;
				
		Rockettest.rock2.totalweight();
		LaunchEvent le2 = new LaunchEvent("JUPITER","05.02.2019", Rockettest.rock2);	
		event_list[1] = le2;
		
		
		Rockettest.rock3.totalweight();
		LaunchEvent le3 = new LaunchEvent("SATURN","22.05.2019", Rockettest.rock3);	
		event_list[2] = le3;
		
			
		Rockettest.rock4.totalweight();
		LaunchEvent le4 = new LaunchEvent("VENUS","05.06.2019", Rockettest.rock4);	
		event_list[3] = le4;
		

		Rockettest.rock5.totalweight();
		LaunchEvent le5 = new LaunchEvent("UCO","01.01.2019", Rockettest.rock5);	
		event_list[4] = le5;
		add(le3);
		add(le5);
		add(le1);
		add(le2);
		add(le4);
		add(le3);
		add(le1);
		add(le5);
		add(le2);
		add(le4);
		printschedule();           //printing the original schedule
		//remove(le3);               // removing the 3rd object
		//printschedule1();          // printing the updated list
		//printhash();               // printing updated hashmap 
		quickSort(final_schedule);
	    print_quicksorted(quickSort(final_schedule));
		}
	
	public void print_quicksorted(ArrayList<LaunchEvent> quickSort) {
			
		
		System.out.println("-----------------------QUICK SORTED LAUNCH LIST-------------------------------");
		for(LaunchEvent s1: quickSort(final_schedule))
		{
			System.out.println("\n" +  s1);
		}		
	}

	public  void add(LaunchEvent ele)
	{
		final_schedule.add(ele);
		myMap.put(ele.getLaunchid(), ele);
	}	
	
	public void remove(LaunchEvent ele)
	{
		final_schedule.remove(ele);
		myMap.remove(ele.getLaunchid());
	}
	
	public void printschedule()
	{
	System.out.println("-----------------------------Final launch List-------------------------------");
		for(LaunchEvent fl: final_schedule)
		{
			System.out.println("\n" +  fl);
		}		
	}
	
	public void printschedule1()
	{
	System.out.println("-----------------------------Modified launch List (Array)-------------------------------");
		for(LaunchEvent fl: final_schedule)
		{
			System.out.println("\n"+  fl);
		}		
	}
	
	public  void printhash()
	{
		System.out.println("\n ------------------------Modified Hash Map Data----------------------------------");
		myMap.forEach((k,v)-> System.out.println(k + "-" + v));
	}

	
	public ArrayList<LaunchEvent> quickSort(ArrayList<LaunchEvent> list)
	{
	    if (list.size() <= 1) 
	        return list; // Already sorted  

	    ArrayList<LaunchEvent> sorted = new ArrayList<LaunchEvent>();
	    ArrayList<LaunchEvent> lesser = new ArrayList<LaunchEvent>();
	    ArrayList<LaunchEvent> greater = new ArrayList<LaunchEvent>();
	    LaunchEvent pivot = list.get(list.size()-1); // Use last launch event as pivot
	    int j;
		int k;
	    for (int i = 0; i < list.size()-1; i++)
	    { 
	    	j = list.get(i).getLaunchid();
	    	k = pivot.getLaunchid();
	    	if (j<k)
	            lesser.add(list.get(i));    
	        else
	            greater.add(list.get(i));   
	    }
	    lesser = quickSort(lesser);
	    greater = quickSort(greater);
	    lesser.add(pivot);
	    lesser.addAll(greater);
	    sorted = lesser;

	    return sorted;
	
	}











}
	