package epam;

public class Chocolate {
	double weight;
	int price;
	Chocolate(int price,double weight)
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
