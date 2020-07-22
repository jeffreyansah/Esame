package it.enaip.cinema;

import java.util.Date;

public class Spettatore {
	//per semplicita considero il biglietto un oggetto di tipo string anche se in realta deve essere un oggetto di tipo biglietto.
	
 private int idSpettatore;
private String nome;
private String cognome;
private int eta;
private  Date birthDate;
private String biglietto;



public Spettatore() {
}

public Spettatore(String nome, String cognome, int eta, Date birthDate, String biglietto) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.eta = eta;
	this.birthDate = birthDate;
	this.biglietto = biglietto;
}

public Spettatore(int idSpettatore, String nome, String cognome, int eta, Date birthDate) {
	this.idSpettatore = idSpettatore;
	this.nome = nome;
	this.cognome = cognome;
	this.eta = eta;
	this.birthDate = birthDate;
}

public Spettatore(int idSpettatore, String nome, String cognome, int eta, Date birthDate, String biglietto) {
	
	this.idSpettatore = idSpettatore;
	this.nome = nome;
	this.cognome = cognome;
	this.eta = eta;
	this.birthDate = birthDate;
	this.biglietto = biglietto;
}

public boolean minore() {
	return (eta < 14);
}
public boolean maggiorene() {
	return (eta > 14);
}

public boolean etaMaggioredi70() {
	return (eta > 70);
}
public boolean etaminredi5() {
	return( eta < 5);
}

public int getIdSpettatore() {
	return idSpettatore;
}

public void setIdSpettatore(int idSpettatore) {
	this.idSpettatore = idSpettatore;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public int getEta() {
	return eta;
}

public void setEta(int eta) {
	this.eta = eta;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public String getBiglietto() {
	return biglietto;
}

public void setBiglietto(String biglietto) {
	this.biglietto = biglietto;
}

}
