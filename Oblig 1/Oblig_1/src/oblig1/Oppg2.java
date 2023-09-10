package oblig1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Oppg2 {

	public static void lonnsoppgjor(List<Ansatt> ansatte, Consumer<Ansatt> nyLonn) {
		ansatte.forEach(nyLonn);
		
	}
	
	public static void main(String[] args) {

		List<Ansatt> ansatte = new ArrayList<>();
		
		ansatte.add(new Ansatt("Sara", "Thon", Kjonn.Kvinne, "Sekretær", 350000));
		ansatte.add(new Ansatt("Matea", "Hundberg", Kjonn.Kvinne, "Sjef", 860000));
		ansatte.add(new Ansatt("Bernt", "Fredriksen", Kjonn.Mann, "Assisterende sjef", 600000));
		ansatte.add(new Ansatt("Vetle", "Christensen", Kjonn.Mann, "Sekretær", 300000));
		
		System.out.println("Alle ansatte: ");
		ansatte.stream().forEach(a -> System.out.println(a.toString()));

		System.out.println("Alle ansatte etter et fast kronetillegg: ");
		ansatte.stream().peek(a -> a.setAarslonn(a.getAarslonn()+5000)).forEach(a -> System.out.println(a.toString()));
		
		System.out.println("Alle ansatte etter et fast prosenttillegg: ");
		ansatte.stream().peek(a -> a.setAarslonn(a.getAarslonn()*1.05)).forEach(a -> System.out.println(a.toString()));

		System.out.println("Alle ansatte med lav lønn etter et fast kronetillegg: ");
		ansatte.stream().filter(a -> a.getAarslonn() < 350000).peek(a -> a.setAarslonn(a.getAarslonn()+10000)).forEach(a -> System.out.println(a.toString()));

		System.out.println("Alle mannlige ansatte etter et fast kronetillegg: ");
		ansatte.stream().filter(a -> a.getKjonn() == Kjonn.Mann).peek(a -> a.setAarslonn(a.getAarslonn()*1.01)).forEach(a -> System.out.println(a.toString()));
	}

}