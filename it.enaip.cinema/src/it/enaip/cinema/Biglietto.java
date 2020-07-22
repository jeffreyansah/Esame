package it.enaip.cinema;

public class Biglietto {
private int posizione;
private int prezzo;

public Biglietto() {
}
public Biglietto(int posizione, int prezzo) {
	super();
	this.posizione = posizione;
	this.prezzo = prezzo;
}
public int getPosizione() {
	return posizione;
}
public void setPosizione(int posizione) {
	this.posizione = posizione;
}
public double getPrezzo() {
	return prezzo;
}
public void setPrezzo(int prezzo) {
	this.prezzo = prezzo;
}

 public void applicaRiduzioneAnziani() {
  Spettatore speta= new Spettatore();
  if(speta.etaMaggioredi70()) {
	  prezzo=prezzo*(10/100);
  }
 }
	public void calcolaRiduzioneBambini() {
		Spettatore speta= new Spettatore();
		if(speta.etaminoredi5()) {
			prezzo=prezzo*(50/100);
		}
	}
}
