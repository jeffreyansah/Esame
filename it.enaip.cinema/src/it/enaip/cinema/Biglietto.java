package it.enaip.cinema;

public class Biglietto {
private int posizione;
private double prezzo;
public Biglietto() {
}
public Biglietto(int posizione, double prezzo) {
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
public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}
	
}
