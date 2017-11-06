package er;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps{
	String name;
	Double price;
	Integer year;
	Car c=new Car();
	Map<Integer,Car> carsMap=new HashMap<Integer,Car>();
	Map<Integer,Car> carsLHMap=new LinkedHashMap<Integer,Car>();
	
	public Map<Integer,Car> getCarMap()
	{
		return carsMap;
	}
	public Map<Integer,Car> getCarLHMap()
	{
		return carsLHMap;
	}
	
	public void generateMap(int x)
	{long start=System.nanoTime();
		for(int i=0;i<x;i++)
		{
		 name=c.randname();
		 price=c.randprice();
		 year=c.randyear();
		
		carsMap.put(i,new Car(name,price,year));
		}
	long stop=System.nanoTime();
	long time=stop-start;
	System.out.println("Auta wygenerowane do Hash Map w czasie: "+time+" nanosekund = "+time/1000000+"milisekund.");
	}
	public void generateLHMap(int x)

	{long start=System.nanoTime();
		for(int i=0;i<x;i++)
		{
		 name=c.randname();
		 price=c.randprice();
		 year=c.randyear();
		carsLHMap.put(i,new Car(name,price,year));
		}
	long stop=System.nanoTime();
	long time=stop-start;
	System.out.println("Auta wygenerowane do LinkedHash Map w czasie: "+time+" nanosekund = "+time/1000000+"milisekund.");
	}
	
	void showmap()
	{System.out.println("Hash Map: ");
		Car show;
		for(int i=0;i<getCarMap().size();i++)
		{
		//temp=getCarMap();
		show=carsMap.get(i);
			//System.out.println("Auto nr: "+ temp);
			System.out.println("Marka: "+show.getName()+"| Cena: "+ show.getPrice()+"| Rok produkcji: "+show.getYear());
		}

		System.out.println("Auta zostaly wyswietlone!");
	}
	void showLHMap()
	{System.out.println("LinkedHash Map: ");
		Car temp = null;
		for(int i=0;i<getCarLHMap().size();i++)
		{
		temp=carsLHMap.get(i);
		System.out.println("Marka: "+temp.getName()+"| Cena: "+ temp.getPrice()+"| Rok produkcji: "+temp.getYear());
		}
		System.out.println("Auta zostaly wyswietlone!");
	}
}
