package epam;
import java.util.*;
public class NewYear {
		 ArrayList<Sweet> sweets=new ArrayList<Sweet>();
		 ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>();
	public static void main(String args[])
	{
		System.out.println("Hi! there.select \n1)chocolates\n2)sweets\n3)To get total weight\n4)To get total price\n5)Exit");
		Scanner s=new Scanner(System.in);
		
		NewYear ny= new NewYear();
		while(true) {
			int op=s.nextInt();
		if(op==1)
		{
			ny.inpchocolates();
		}
		else if(op==2)
		{
			ny.inpsweets();
		}
		else if(op==3)
		{
			System.out.println("Total weight is: "+ny.totalweight());
		}
		else if(op==4)
		{
			System.out.println("Total price is: "+ny.totalprice());
		}
		else {
			System.out.println("Thank You!");
			break;}
		System.out.println("select \n1)chocolates\n2)sweets\n3)To get total weight\n4)To get total price\n5)Exit");
		}
		s.close();
	}
	public double totalweight()
	{
		double totweight=0;
		for(Chocolate cs:chocolates)
		{
			totweight+=cs.getWeight();
		}
		for(Sweet s:sweets)
		{
			totweight+=s.getWeight();
		}
		return totweight;
	}
	public int totalprice()
	{
		int totprice=0;
		for(Chocolate cs:chocolates)
		{
			totprice+=cs.getPrice();
		}
		for(Sweet s:sweets)
		{
			totprice+=s.getPrice();
		}
		return totprice;
	}
	public void inpsweets()
	{
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("Enter your Sweet name:");
		String name=s.next();
		System.out.println("Enter Price:");
		int price=s.nextInt();
		System.out.println("Enter weight:");
		double weight=s.nextDouble();
		if(name.equals("kajubarfi"))
		{
			KajuBarfi kb=new KajuBarfi(price,weight);
			sweets.add(kb);
		}
		else
		{
			Laddu l=new Laddu(price,weight);
			sweets.add(l);
		}
		System.out.println("Do you want to enter another sweets or exit(yes/no)");
		String op=s.next();
		if(op.contentEquals("no"))
			break;
		}
		//s.close();
	}
	public void inpchocolates()
	{
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("Enter your Chocolate name:");
		String name=s.next();
		System.out.println("Enter Price:");
		int price=s.nextInt();
		System.out.println("Enter weight:");
		double weight=s.nextDouble();
		//System.out.print("something");
		if(name.equals("fivestar"))
		{
			//System.out.println("in fivestar");
			Fivestar kb=new Fivestar(price,weight);
			
			chocolates.add(kb);
			//System.out.print("after");
		}
		else
		{
			Bournville l=new Bournville(price,weight);
			chocolates.add(l);
		}
		System.out.println("Do you want to enter another chocolates or exit(yes/no)");
		String op=s.next();
		if(op.contentEquals("no"))
			break;
		}
	}


}
