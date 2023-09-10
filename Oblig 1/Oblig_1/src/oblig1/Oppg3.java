package oblig1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Oppg3 {

	public static void main(String[] args) {

			List<Ansatt> ansatte = new ArrayList<>();
			
			ansatte.add(new Ansatt("Sara", "Thon", Kjonn.Kvinne, "Sekretær", 350000));
			ansatte.add(new Ansatt("Matea", "Hundberg", Kjonn.Kvinne, "Sjef", 860000));
			ansatte.add(new Ansatt("Bernt", "Fredriksen", Kjonn.Mann, "Assisterende sjef", 600000));
			ansatte.add(new Ansatt("Vetle", "Christensen", Kjonn.Mann, "Sekretær", 300000));
			
			//a
			List<String> etternavn = ansatte.stream().map(Ansatt::getEtternavn).toList();
			System.out.println("Etternavn: " + etternavn + "\n");
			
			//b
			long alleKvinner = ansatte.stream().filter(d -> d.getKjonn() == Kjonn.Kvinne).count();
			System.out.println("Antall kvinner: " + alleKvinner + "\n");
			
			//c
			double gjennomsnittslonn = ansatte.stream().filter(g -> g.getKjonn() == Kjonn.Kvinne).mapToDouble(Ansatt::getAarslonn).average().getAsDouble();
			System.out.println("Gjennomsnittslønn for kvinner: " + gjennomsnittslonn + "\n");
			
			//d
			System.out.println("Lønn til sjef etter lønnsøkning: " );
			ansatte.stream().filter(s -> s.getStilling() == "Sjef").peek(s -> s.setAarslonn(s.getAarslonn()*1.07)).forEach(s -> System.out.println(s.getAarslonn()));
			System.out.println("\n");
			
			//e
			boolean tjenerMerEnn = ansatte.stream().anyMatch(t -> t.getAarslonn() > 800000);
			System.out.println("Det finnes noen som tjener mer enn 800000: " + tjenerMerEnn + "\n");
			
			//f
			System.out.println("Alle ansatte: ");
			ansatte.stream().forEach(a -> System.out.println(a.toString()));

			//g
			Optional<Ansatt> lavestLonn = ansatte.stream().min(Comparator.comparing(Ansatt::getAarslonn));
			System.out.println("Den som har lavest lønn: " + lavestLonn.orElseThrow());
			
			//h
			List<Integer> heltall = new ArrayList<>();
			for (int i = 1; i < 1000; i++) {
				heltall.add(i);
			}
			
			int alleTall = heltall.stream().filter(x -> (x % 3 == 0 || x % 5 == 0)).mapToInt(Integer::intValue).sum();
			System.out.println("Summen av alle heltall: " + alleTall);
			
	}

}
