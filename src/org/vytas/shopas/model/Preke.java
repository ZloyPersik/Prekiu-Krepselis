package org.vytas.shopas.model;

public class Preke {
	
	
	private double plotis;
	private double aukstis;
	private double gylis;
	private double svoris;
	
	private String pavadinimas;
	private String serijosNr;
	
	
	
	public Preke(double plotis, double aukstis, double gylis, double svoris, String pavadinimas, String serijosNr) {
		this.plotis = plotis;
		this.aukstis = aukstis;
		this.gylis = gylis;
		this.svoris = svoris;
		this.pavadinimas = pavadinimas;
		this.serijosNr = serijosNr;
	}
	public double getPlotis() {
		return plotis;
	}
	public void setPlotis(double plotis) {
		this.plotis = plotis;
	}
	public double getAukstis() {
		return aukstis;
	}
	public void setAukstis(double aukstis) {
		this.aukstis = aukstis;
	}
	public double getGylis() {
		return gylis;
	}
	public void setGylis(double gylis) {
		this.gylis = gylis;
	}
	public double getSvoris() {
		return svoris;
	}
	public void setSvoris(double svoris) {
		this.svoris = svoris;
	}
	public String getPavadinimas() {
		return pavadinimas;
	}
	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}
	public String getSerijosNr() {
		return serijosNr;
	}
	public void setSerijosNr(String serijosNr) {
		this.serijosNr = serijosNr;
	}
	
}
