package er;

import java.util.Random;

public class Car implements Comparable<Car> {

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


@Override
public int compareTo(Car o) {
	if(this == o) return 0; 
	
	int comparison = this.name.compareTo(o.getName());
	if(comparison != 0) return comparison;

	return 0;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + year;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (year != other.year)
		return false;
	return true;
}






}
