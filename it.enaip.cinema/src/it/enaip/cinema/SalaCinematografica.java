package it.enaip.cinema;

import java.util.ArrayList;
import java.util.List;

public class SalaCinematografica {

private	Film film;
Spettatore spetta;
List<Spettatore> spta; // serve per aggiungere spettatori alla lista.

public SalaCinematografica(Film film, Spettatore spetta) {
	super();
	this.film = film;
	this.spetta = spetta;
	spta=new ArrayList<Spettatore>();
}


public SalaCinematografica() {
}


public SalaCinematografica(Film film) {
	super();
	this.film = film;
}


public Film getFilm() {
	return film;
}

public void setFilm(Film film) {
	this.film = film;
}
	
public Spettatore getSpetta() {
	return spetta;
}


public void setSpetta(Spettatore spetta) {
	this.spetta = spetta;
}	
}
