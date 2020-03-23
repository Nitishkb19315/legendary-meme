import java.util.*;
import java.io.*;

class Items
{
	String item_name;
	int price;
	int s_no;
	ArrayList itemsList = new ArrayList();

	Items()
	{

	}

	Items(String item_name, int price, int s_no)
	{
		this.item_name = item_name;
		this.price = price;
		this.s_no = s_no;
	}

	/*public void added_items(ArrayList al)
	{
		al = itemsList;
	}

	public void available_items()
	{
		Iterator itr = itemsList.iterator();
		while(itr.hasNext())
		{
			Object i = itr.next();
			System.out.println(i);
		}
	}*/

	public void add_items()
	{
		while(true)
		{
			//ArrayList<Items> itemsList = new ArrayList<Items>();
			System.out.println("Press 1 to add more items: ");
			System.out.println("Press 2 to break");
			Scanner input1 = new Scanner(System.in);
			int choice1 = input1.nextInt();
			int s_no = 1;
		    
			    if (choice1 == 1)
			    {
			    	
			    	Scanner input2 = new Scanner(System.in);  
			    	System.out.println("Enter the dish name: ");
				    String item_name = input2.nextLine();
				    System.out.println("Enter the price:");
				    int price = input2.nextInt();

				
				    itemsList.add(new Items(item_name, price, s_no));
				    //Items.added_items(itemsList);
				    s_no++;
			    }

			    else if(choice1 == 2)
			    {
			    	break;
			    }
		}
	}
}


class Restaurant
{
	public static void main(String[] args)
	{

		while(true)
		{
			ArrayList itemsList = new ArrayList();
			Scanner input = new Scanner(System.in);

			System.out.println("Press 1 to add items: ");
			int choice = input.nextInt();
			if(choice == 1)
			{
				Items i = new Items();
				i.add_items();
			}

			else if(choice == 2)
			{
				System.out.println("Welcome to the Restaurant");
			}

			else if(choice == 3)
			{
				break;
			}

			
		}
	}
}