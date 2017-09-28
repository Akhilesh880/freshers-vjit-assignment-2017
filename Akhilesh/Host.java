
public class Host {
	
	private int numberOfTables=10;
	private int numberOfAllocatedTables=0;
	private boolean availability;
	public boolean getAllocationStatus()
	{
		if(numberOfAllocatedTables<numberOfTables)
		{
			System.out.println("Host allots a table for customer");
			numberOfAllocatedTables++;
			availability=true;
		
		}
		else if(numberOfAllocatedTables==numberOfTables)
		{
			System.out.println("Sorry You need to wait in the queue");
			availability=false;
		}
		return availability;
	}

}
