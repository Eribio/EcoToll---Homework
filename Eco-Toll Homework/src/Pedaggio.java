
public class Pedaggio {
	
	public static final double IVA = 0.22;

	public Casello caselloIn;
	public Casello caselloOut;
	public Veicolo veicolo;
	
	
	/*
	 *  Costruttore
	 */
	
	public Pedaggio(Casello caselloIn, Casello caselloOut, Veicolo veicolo) {
		this.caselloIn = caselloIn;
		this.caselloOut = caselloOut;
		this.veicolo = veicolo;
	}
	
	
	/*
	 * Metodo che calcola il pedaggio
	 */
	
	public double calcolaPedaggio() {
		
		Autostrada a=caselloIn.codiceAutostrada;
		Autostrada b=caselloOut.codiceAutostrada;
		double y=a.getTariffa();
		double aggiunta=0;
		
		/*
		 * Mi prendo la classe del veicolo per poi calcolare
		 * l'aggiunta della classe di appartenenza
		 */
		char x=veicolo.getClasseveicolo();
		
		switch(x) {
		case 'B':
			aggiunta=0.10;
			break;
		case '3':
			aggiunta=0.30;
			break;
		case '4':
			aggiunta = 0.50;
			break;
		case '5':
			aggiunta=0.70;
			break;
		default :
			aggiunta=0.05; //Per default calcola  l'aggiunta della classe A
		}
		
		
		if(a.equals(b)){
				double e=Math.abs(caselloIn.getAltezzaKm()-caselloOut.getAltezzaKm());
				y= y*aggiunta;
				double tot = e*y;
				float aggIVA= (float) (tot*(IVA)) ;
				double arr=(Math.round((tot + aggIVA)*10)/10);
				return arr;		
				}
		
		return 0;
		
	}
	
	

}