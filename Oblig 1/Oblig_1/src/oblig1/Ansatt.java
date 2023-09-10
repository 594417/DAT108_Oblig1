package oblig1;

public class Ansatt {

	private String fornavn;
	private String etternavn;
	private Kjonn kjonn;
	private String stilling;
	private double aarslonn;
	
	public Ansatt(String fornavn, String etternavn, Kjonn kjonn, String stilling, double aarslonn) {
		
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.stilling = stilling;
		this.aarslonn = aarslonn;
		
	}
	
	public String getFornavn() {
		return fornavn;
	}
	
	public String getEtternavn() {
		return etternavn;
	}

	public Kjonn getKjonn() {
		return kjonn;
	}

	public String getStilling() {
		return stilling;
	}

	public double getAarslonn() {
		return aarslonn;
	}
	
	public void setAarslonn(double aarslonn) {
		this.aarslonn = aarslonn;
	}
	
	@Override
	public String toString() {
		return "Fornavn: " + fornavn + ", " + "Etternavn: " + etternavn + ", " + "Kjønn: " + kjonn + ", " + "Stilling: " + stilling + ", " + "Årslønn: " + aarslonn + "\n";
	}


}