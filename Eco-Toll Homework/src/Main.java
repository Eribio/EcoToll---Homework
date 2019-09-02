/*
 * Calcolo esempio 3 pedaggi
 */

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Nuovi veicoli
		 */
		
	     Veicolo v1 = new Veicolo("AUDI a4","AUDI",2015,"DV201TB",15, (float) 1.20,2, 'A');
	     Veicolo v2 = new Veicolo("FIAT 500X","FIAT",2018,"EH182HG",(float)25.7, (float) 1.90,2,'B');
	     Veicolo v3 = new Veicolo("Golf","Volkswagen",2018,"EK955VH",(float)25.7, (float) 1.70, 2, '3');
	     
	     
	     
	     /*
	      * Nuove autostrade
	      */
	     
	     Autostrada a1 = new Autostrada("a24",(float)1.50,"Teramo","Roma",(float) 158.3, null);
	     Autostrada a2 = new Autostrada("a2",(float)1.90,"Milano","Roma",(float) 448.3, null);
	     
	     
	     /*
	      * Caselli delle autostrade
	      */
	     
	     a1.addCasello(a1, "Colledara",(float)15); 
	     a1.addCasello(a1, "L'Aquila Ovest", (float)45);
	     
	     
	     /*
	      * Aggiungo prima i caselli poi li aggiungo nella lista dei caselli in Autostrada
	      */
	     
	     Casello c4 = new Casello(a2,"Avezzano",(float)20);
	     a2.addCasello(c4);
	     Casello c3 = new Casello(a2,"Roma",(float)70);
	     a2.addCasello(c3);
	     Casello c5 = new Casello(a1,"Assergi",(float)50);
	     a1.addCasello(c5);
	     Casello c6 = new Casello(a1,"Roma",(float)3.6);
	     a1.addCasello(c6); 
	     Casello c7 = new Casello(a1,"L'Aquila Est",(float)59.7);
	     a1.addCasello(c7);
	     
	    
	     /*
	      * Pedaggi calcolati con caselli e veicoli creati in precedenza
	      */
	     
		 Pedaggio p1 = new Pedaggio(c7,c6,v1);
	     Pedaggio p2 = new Pedaggio(c6,c7,v2);
	     Pedaggio p3 = new Pedaggio(c4,c3,v3);
	     
	     
	     /*
	      * Stampa dei pedaggi calcolati
	      */
	     
	     System.out.println(p1.calcolaPedaggio() + " € calcolo primo pedaggio");
	     System.out.println(p2.calcolaPedaggio() + " € calcolo secondo pedaggio");
	     System.out.println(p3.calcolaPedaggio() + " € calcolo terzo pedaggio");
	}

}
