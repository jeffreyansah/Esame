package it.enaip.cinema;

public class SalaCinematografica {

private	Film film;
Spettatore spetta;


public SalaCinematografica(Film film, Spettatore spetta) {
	super();
	this.film = film;
	this.spetta = spetta;
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
