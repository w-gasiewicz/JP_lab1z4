package er;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	

	private static Scanner get;

	public static void main(String[] args) throws IOException  {
		
		Menu menu=new Menu();
		int x;
		get = new Scanner(System.in);
		
		System.out.println("Program generujacy auta!");
		
		System.out.print("Podaj ile aut chcesz wygenerowac: ");
		x=get.nextInt();
		menu.dialog(x);		
	}

}
