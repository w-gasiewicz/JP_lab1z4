package er;

import java.util.Random;

public class Car {

	Name cn;
	String name;
	double price;
	int year;
	static Random generator = new Random();

public Car(String cname, double cprice, int cyear)
{	
	name=cname;
	price=cprice;
	year=cyear;
}

	
	public double randprice()
	{
		return Math.round(generator.nextDouble()*(35000-500)+500);
	}
	
	public String randname()
	{
		Name[] names=Name.values();
		Name value=names[(int) (Math.random()*names.length)];

		return value.toString();	
	}
	
	public int randyear()
	{
	return  generator.nextInt(2001-1960+1)+1960;	
	}
	
public void setname(String cname)
{
		name= cname;
}

public void setprice(double cprice)
{				
		price=cprice;
}

public  void setyear(int cyear)
{		
		year=cyear;
}

public Car()
{

}

public String getName() {return name;}

public int getYear() {return year;}

public double getPrice() {return price;}

}
