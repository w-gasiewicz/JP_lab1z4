package er;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	int choose;
	
	Car x=new Car();
	Lists list=new Lists();
	Sets set=new Sets();
	Maps map=new Maps();
	Scanner get = new Scanner(System.in);
	String name;
	int year1,year2;
	Integer cardelete;
	Double price1,price2;
	
	void tofind()
	{
		System.out.println("Podaj marke szukanego samochodu: ");
		name=get.next();
		System.out.println("Podaj dolny zakres ceny: ");
		price1=get.nextDouble();
		System.out.println("Podaj gorny zakres ceny: ");
		price2=get.nextDouble();
		System.out.println("Podaj dolny zakres roku produkcji: ");
		year1=get.nextInt();
		System.out.println("Podaj gorny zakres roku produkcji: ");
		year2=get.nextInt();
	}
	Integer carToRemove()
	{
		System.out.print("Podaj numer auta do usuniecia: ");
		cardelete=get.nextInt();
		return cardelete;
	}
	public void dialog(int car_number)
	{
		
			do{
		try{
		System.out.println("***MENU***");
		System.out.println("0 - zamknij program.");
		System.out.println("1 - wygeneruj auta do List.");
		System.out.println("2 - wygeneruj auta do Zbiorow.");
		System.out.println("3 - wygeneruj auta do Map.");
		System.out.println("4 - wyswietl auta z List.");
		System.out.println("5 - wyswietl auta ze Zbiorow.");
		System.out.println("6 - wyswietl auta ze Map.");
		System.out.println("7 - wyszukaj auto.");
		System.out.println("8 - usun auto.");
		System.out.print("Wybierz jedna z opcji: ");
		choose=get.nextInt();
		
		switch(choose){
		case 0: System.exit(0);
		case 1: list.generate(car_number); list.generateArrayList(car_number); break;
		case 2: set.generateSet(car_number); set.generateTreeSet(car_number); break;
		case 3: map.generateMap(car_number); map.generateLHMap(car_number);break;
		case 4: list.showlist(); list.showArrayList(); break;
		case 5: set.showset(); set.showTreeSet(); break;
		case 6: map.showmap(); map.showLHMap(); break;
		case 7: tofind(); list.searchList(name, price1, price2, year1, year2); list.searchArrayList(name, price1, price2, year1, year2); set.searchSet(name, price1, price2, year1, year2);set.searchTreeSet(name, price1, price2, year1, year2);map.searchMap(name, price1, price2, year1, year2); map.searchLHMap(name, price1, price2, year1, year2);break;
		case 8: carToRemove(); list.deleteFromList(cardelete); list.deleteFromArList(cardelete); set.deleteFromSet(cardelete); set.deleteFromTreeSet(cardelete); map.removeFromMap(cardelete); map.removeFromLHMap(cardelete); break;
		default: break;
		}
	}
	catch(InputMismatchException e){System.out.println("Podaj poprawna wartosc z MENU!"); System.out.println("opcja: "); choose=get.nextInt();}
			}
	while(choose!=0);
	}
}
