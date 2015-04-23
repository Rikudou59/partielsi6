package com.constructsio;

public class Immeuble extends Bâtiment {

	//Attribluts
	int nbEtage;
	
	public Immeuble() {
		
	}

	public Immeuble(int prix, String nom, boolean constructFini,
			boolean paiement,int nbEtage) {
		super(prix, nom, constructFini, paiement);
		// TODO Auto-generated constructor stub
		this.nbEtage=nbEtage;
	}

	public int getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}

}
