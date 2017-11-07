package er;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Lists {
	String name;
	Double price;
	Integer year;
	Car c=new Car();
	 List<Car> carsArray= new ArrayList<Car>();
	 List<Car> cars=new LinkedList<Car>();
	
	 public List<Car> getCarArray()
	 {
	 	return carsArray;
	 }
	 public List<Car> getCar()
	 {
	 	return cars;
	 }
	 
	 public void generate(int x)
	 {long start=System.nanoTime();
	 	for(int i=0;i<x;i++)
	 	{
	 	 name=c.randname();
	 	 price=c.randprice();
	 	 year=c.randyear();
	 	
	 	cars.add(new Car(name,price,year));
	 	}
	 long stop=System.nanoTime();
	 long time=stop-start;
	 System.out.println("Auta wygenerowane do Linked List w czasie: "+time+" nano sekund = "+time/1000000+"milisekund.");
	 }
	 
	 void showlist()
	 {System.out.println("Linked List: ");
		 Car temp;
	 	for(int i=0;i<getCar().size();i++)
	 	{
	 		 temp=getCar().get(i);
	 		System.out.println("Marka: "+temp.getName()+" | Rok produkcji: "+temp.getYear()+" | Cena: "+temp.getPrice());
	 	}
	 	System.out.println("Auta zostaly wyswietlone!");
	 }
	 
	 public void generateArrayList(int x)
	 {long start=System.nanoTime();
	 	for(int i=0;i<x;i++)
	 	{
	 	 name=c.randname();
	 	 price=c.randprice();
	 	 year=c.randyear();
	 	
	 	carsArray.add(new Car(name,price,year));
	 	}
	 long stop=System.nanoTime();
	 long time=stop-start;
	 System.out.println("Auta wygenerowane do Array List w czasie: "+time+" nano sekund = "+time/1000000+"milisekund.");
	 }
	 
	 void showArrayList()
	 {Car temp;
	 System.out.println("Array List: ");
	 	for(int i=0;i<getCarArray().size();i++)
	 	{
	 		 temp=getCarArray().get(i);
	 		System.out.println("Marka: "+temp.getName()+" | Rok produkcji: "+temp.getYear()+" | Cena: "+temp.getPrice());
	 	}
	 	System.out.println("Auta zostaly wyswietlone!");
	 }
	 
	 void searchList(String name,Double price1,Double price2 ,int year1,int year2)
	 {
		 System.out.println("Wyszukanie w Linked List: ");
	 int test=0;
	 Car car; 
	 String tempName;
	 Double tempPrice;
	 int tempYear;
	 System.out.println("Auta pasuj¹ce do zadanego wyszukiwania: ");
	 	for(int i=0;i<cars.size();i++)
	 	{	
	 	car=getCar().get(i);
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
	 
	 void searchArrayList(String name,Double price1,Double price2 ,int year1,int year2)
	 {
		 System.out.println("Wyszukanie w Array List: ");
	 int test=0;
	 Car car; 
	 String tempName;
	 Double tempPrice;
	 int tempYear;
	 System.out.println("Auta pasuj¹ce do zadanego wyszukiwania: ");
	 	for(int i=0;i<carsArray.size();i++)
	 	{	
	 	car=getCarArray().get(i);
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
