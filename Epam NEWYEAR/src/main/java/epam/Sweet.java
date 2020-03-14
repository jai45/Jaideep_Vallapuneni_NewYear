package epam;

public class Sweet {
	double weight;
	int price;
	Sweet(int price,double weight)
	{
		this.price=price;
		this.weight=weight;
	}
	int getPrice()
	{
		return price;
	}
	double getWeight()
	{
		return weight;
	}
}
