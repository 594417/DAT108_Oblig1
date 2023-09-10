package oblig1;

public class Oppg1b {

	public static int beregn(int a, int b, BeregningsFunksjon operator) {
		return operator.beregn(a, b);
	} 

	public static void main(String[] args) {
		// Definer tre forskjellige beregningsfunksjoner som 
		//implementerer interfacet Beregningsfunksjon
		BeregningsFunksjon summerFunksjon = (x, y) -> x + y;
		BeregningsFunksjon maksFunksjon = (x, y) -> Math.max(x, y);
		BeregningsFunksjon avstandFunksjon = (x, y) -> Math.abs(x - y);

		// Eksempler på bruk av beregn-metoden
		int sum = beregn(12, 13, summerFunksjon);
		int maksimum = beregn(-5, 3, maksFunksjon);
		int avstand = beregn(54, 45, avstandFunksjon);

		System.out.println("Summen av 12 og 13 er: " + sum);
		System.out.println("Den største av -5 og 3 er: " + maksimum);
		System.out.println("Avstanden mellom 54 og 45 er: " + avstand);
	}

}

