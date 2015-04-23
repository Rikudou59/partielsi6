package com.constructsio;

public class Maison extends Bâtiment {
	public Maison() {
	}

	public Maison(int prix, String nom, boolean constructFini, boolean paiement,boolean etage){
		this.prix = super.prix;
		this.nom = super.nom;
		this.constructFini=super.constructFini;
		this.paiement=super.paiement;
		this.etage = etage;
	}

	//Attributs
	boolean etage;
	

	public boolean isEtage() {
		return etage;
	}

	public void setEtage(boolean etage) {
		this.etage = etage;
	}
}
