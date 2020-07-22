package it.enaip.cinema;

public class Film {

private	String titolo;
private String autore;
private String produttore;
private double durata;
private genere gene;


public Film(String titolo, String autore, String produttore, double durata, genere gene) {
	super();
	this.titolo = titolo;
	this.autore = autore;
	this.produttore = produttore;
	this.durata = durata;
	this.gene = gene;
}

public Film(String titolo, String autore, String produttore, double durata) {
	super();
	this.titolo = titolo;
	this.autore = autore;
	this.produttore = produttore;
	this.durata = durata;
}

private enum genere{horror("h"),detective("d"),giallo("g"),romantico("r"),comico("c");

	protected String descGenere;

	genere(String descType) {
		this.descGenere = descType;
	}

	public String getDescGenere() {
		return descGenere;
	}

	public void setDescGenere(String descGenere) {
		this.descGenere = descGenere;
	}
	
}
public String getTitolo() {
	return titolo;
}

public void setTitolo(String titolo) {
	this.titolo = titolo;
}

public String getAutore() {
	return autore;
}

public void setAutore(String autore) {
	this.autore = autore;
}

public String getProduttore() {
	return produttore;
}

public void setProduttore(String produttore) {
	this.produttore = produttore;
}

public double getDurata() {
	return durata;
}

public void setDurata(double durata) {
	this.durata = durata;
}

public genere getGene() {
	return gene;
}

public void setGene(genere gene) {
	this.gene = gene;
}

public String getValue() {
	String ret="";
	if(gene ==  null)
		return null;
	switch(gene) {
	case horror:
		ret="h";
		break;
	case detective:
		ret="d";
		break;
	case giallo:
		ret="g";
		break;
	case romantico:
		ret="r";
		break;
	case comico:
		ret="c";
		default:
			System.out.println("Genere di film non previsto");
	}
	return ret;
}

}
