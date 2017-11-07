package er;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("serial")
public class Sets implements Serializable {
	String name;
	Double price;
	Integer year;
	Car c=new Car();
	 Set<Car> carsSet=new HashSet<Car>();
	Set<Car> carsTreeSet=new TreeSet<Car>();
	
	public Set<Car> getCarSet()
	{
		return carsSet;
	}
	public Set<Car> getCarTreeSet()
	{
		return carsTreeSet;
	}
	
	public void generateSet(int x)
	{long start=System.nanoTime();
		for(int i=0;i<x;i++)
		{
		 name=c.randname();
		 price=c.randprice();
		 year=c.randyear();
		carsSet.add(new Car(name,price,year));
		}
	long stop=System.nanoTime();
	long time=stop-start;
	System.out.println("Auta wygenerowane do HashSet w czasie: "+time+" nanosekund = "+time/1000000+"milisekund.");
	}
	public void generateTreeSet(int x)
	{long start=System.nanoTime();
	int i=0;
		do
		{
		 name=c.randname();
		 price=c.randprice();
		 year=c.randyear();
		 carsTreeSet.add(new Car(name,price,year));
		
		i++;
		}while(i<x);
	long stop=System.nanoTime();
	long time=stop-start;
	System.out.println("Auta wygenerowane do TreeSet w czasie: "+time+" nanosekund = "+time/1000000+"milisekund.");
	}

	void showset()
	{System.out.println("Hash Set: ");
		for(Car car:carsSet)
		{
			System.out.println("Marka: " +car.getName()+" | Rok produkcji: "+car.getYear()+" | Cena: "+car.getPrice());
		}
		System.out.println("Auta zostaly wyswietlone!");
	}
	void showTreeSet()
	{System.out.println("Tree Set: ");
		for(Car car:carsTreeSet)
		{
			System.out.println("Marka: " +car.getName()+" | Rok produkcji: "+car.getYear()+" | Cena: "+car.getPrice());
		}
		System.out.println("Auta zostaly wyswietlone!");
	}
	
	void searchSet(String name,Double price1,Double price2 ,int year1,int year2)
	 {
	System.out.println("Wyszukanie w HashSet: ");
	 int test=0;
	 String tempName;
	 Double tempPrice;
	 int tempYear;
	 System.out.println("Auta pasuj¹ce do zadanego wyszukiwania: ");
	 for(Car car:carsSet)
	 	{	
	 	tempName=car.getName();
	 	tempPrice=car.getPrice();
	 	tempYear=car.getYear();
	 		
	 		if (tempName.equals(name) && tempPrice>=price1 && tempPrice<=price2 && tempYear>=year1 && tempYear<=year2 )
	 		{
	 			
	 			System.out.println("MARKA: "+ tempName+" ROK PRODUKCJI: "+tempYear+" CENA: "+tempPrice);
	 			test++;
	 		}
	 	}
	 	if(test==0)
	 	{
	 		System.out.println("Nie uda³o siê dopasowaæ ¿adnych aut do zadanego wyszukiwania.");
	 	}
	 }
}
