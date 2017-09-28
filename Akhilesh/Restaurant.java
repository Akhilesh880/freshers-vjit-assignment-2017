import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Restaurant {

	public static void main(String[] args) {	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Host host=new Host();
		
		
		int itemId;
		if(host.getAllocationStatus()==true)
		{
			BusBoy busBoy=new BusBoy();
			busBoy.getWater();
			manager.getMenu();
			System.out.println("Select the food to order:");
			int numberOfItems=Integer.parseInt(br.readLine());
			for(int i=0;i<numberOfItems;i++)
			{
			System.out.println("Enter number of Items:");
			itemId=Integer.parseInt(br.readLine());	
			OrderItems.add(manager.getItem(itemId)))
			}
			order.addOrder(OrderItems);	
			
			chef.getOrder(manager.placeOrder(order));
			chef.placeOrderToLineCooks();
			manager.getBill(OrderItems);
			
					
		}
	}
		

	}

}
