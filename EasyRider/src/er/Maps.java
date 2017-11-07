package er;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	Set<Entry<Integer, Car>> entrySet = carsMap.entrySet();
	Car showcar;
	int x=0;
	for(Entry<Integer, Car> entry: entrySet) {
		 showcar = carsMap.get(x); 
        System.out.println("Numer klucza: " + entry.getKey() + "\n Marka: "+showcar.getName()+"| Cena: "+ showcar.getPrice()+"| Rok produkcji: "+showcar.getYear() );
    x++;
	}
	System.out.println("Auta zostaly wyswietlone!");
	}
	void showLHMap()
	{System.out.println("LinkedHash Map: ");
	Set<Entry<Integer, Car>> entrySet = carsLHMap.entrySet();
	Car showcar;
	int x=0;
	for(Entry<Integer, Car> entry: entrySet) {
		 showcar = carsLHMap.get(x); 
        System.out.println("Numer klucza: " + entry.getKey() + "\n Marka: "+showcar.getName()+"| Cena: "+ showcar.getPrice()+"| Rok produkcji: "+showcar.getYear() );
    x++;
	}
	System.out.println("Auta zostaly wyswietlone!");
	}
	
	void searchMap(String name,Double price1,Double price2 ,int year1,int year2)
	 {
		 System.out.println("Wyszukanie w HashMap: ");
	 int test=0;
	 Car car; 
	 String tempName;
	 Double tempPrice;
	 int tempYear;
	 System.out.println("Auta pasuj¹ce do zadanego wyszukiwania: ");
	 	for(int i=0;i<carsMap.size();i++)
	 	{	
	 	car=carsMap.get(i);
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
	 
	void searchLHMap(String name,Double price1,Double price2 ,int year1,int year2)
	 {
		 System.out.println("Wyszukanie w LinkedHashMap: ");
	 int test=0;
	 Car car; 
	 String tempName;
	 Double tempPrice;
	 int tempYear;
	 System.out.println("Auta pasuj¹ce do zadanego wyszukiwania: ");
	 	for(int i=0;i<carsLHMap.size();i++)
	 	{	
	 	car=carsLHMap.get(i);
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
