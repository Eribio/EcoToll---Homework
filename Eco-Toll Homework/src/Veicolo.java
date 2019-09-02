public class Veicolo {
	
	public String modello;
	public String marca;
	public int anno;
	public String targa;
	public float peso;
	public float altezza;
	public int n_assi;
	public char classe_veicolo;
	
	
	//Metodi get e set

	public int getNAssi() {return n_assi;}
	public void setNAssi(int n_assi) {this.n_assi = n_assi;}
	
	public char getClasseveicolo() {return classe_veicolo;}
	public void setClasseveicolo(char classe_veicolo) {this.classe_veicolo = classe_veicolo;}
	
	public String getModello() {return modello;}
	public void setModello(String modello) {this.modello = modello;}
	
	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}
	
	public int getAnno() {return anno;}
	public void setAnno(int anno) {this.anno = anno;}
	
	public String getTarga() {return targa;}
	public void setTarga(String targa) {this.targa = targa;}
	
	public float getPeso() {return peso;}
	public void setPeso(float peso) {this.peso = peso;}
	
	public float getAltezza() {return altezza;}
	public void setAltezza(float altezza) {this.altezza = altezza;}
	
	
	//Costruttore
	
	public Veicolo(String modello, String marca, int anno, String targa, float peso, float altezza, int n_assi,char classe_veicolo) {
		
		this.modello = modello;
		this.marca = marca;
		this.anno = anno;
		this.targa = targa;
		this.peso = peso;
		this.altezza = altezza;
		this.n_assi = n_assi;
		this.classe_veicolo = classe_veicolo;
	}
	
	
	/*
	 * Costruttore vuoto
	 */
	
	public Veicolo() {}
	
	
	//Metodo toString
	
	@Override
	public String toString() {
		return "Veicolo [modello=" + modello + ", marca=" + marca + ", anno=" + anno + ", targa=" + targa + ", peso="
				+ peso + ", altezza=" + altezza + ", numero assi=" + n_assi + ", classeveicolo=" + classe_veicolo + "]";
	}
	
	

}