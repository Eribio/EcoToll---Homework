import java.util.TreeSet;

public class Autostrada {

	public String idAutostrada;
	public double tariffa_km;
	public String Inizio;
	public String Fine;
	public float km_totali;
	TreeSet<Casello> listaCaselli ;
	
	
	/*
	 * Metodi get e set
	 */
	
	public String getInizio() {return Inizio;}
	public void setInizio(String Inizio) {this.Inizio = Inizio;}
	
	
	public String getFine() {return Fine;}
	public void setFine(String Fine) {this.Fine = Fine;}
	
	
	public float getlunghezza() {return km_totali;}
	public void setlunghezza(float lunghezza) {this.km_totali = lunghezza;}
	
	
	public String getIdAutostrada() {return idAutostrada;}
	public void setCodiceAutostrada(String idAutostrada) {this.idAutostrada = idAutostrada;}
	
	
	public double getTariffa() {return tariffa_km;}
	public void setTariffa(float tariffa_km) {this.tariffa_km = tariffa_km;}
	
	
	public TreeSet<Casello> getCaselliList() {return listaCaselli;}
	public void setCaselliList(TreeSet<Casello> caselliList) {this.listaCaselli = caselliList;}
	
	
	/*
	 * Costruttore
	 */
	
	public Autostrada(String idAutostrada, float tariffa_km, String Inizio, String Fine, float lunghezza,
			TreeSet<Casello> listacaselli) {
		this.idAutostrada = idAutostrada;
		this.tariffa_km = tariffa_km;
		this.Inizio = Inizio;
		this.Fine = Fine;
		this.km_totali = lunghezza;
		this.listaCaselli= new TreeSet<Casello>();
	}
	
	
	/*
	 * Costruttore vuoto
	 */
	
	public Autostrada() {}
	
	
	
	/*
	 * Metodo toString
	 */
	
	@Override
	public String toString() {
		return "Autostrada [idAutostrada=" + idAutostrada + ", tariffa=" + tariffa_km + ", Inizio="
				+ Inizio + ", Fine=" + Fine + ", Km totali=" + km_totali + ", listaCaselli=" + listaCaselli + "]";
	}
	
	
	/*
	 * Metodi che mi permettono di inserire caselli
	 */

	public boolean addCasello(Autostrada autostrada, String nome, float km) {
		Casello casello = new Casello (autostrada, nome, km);
		 return listaCaselli.add(casello);	
	}
	
	
	public boolean addCasello(Casello c) {
		return listaCaselli.add(c);	
	}
}