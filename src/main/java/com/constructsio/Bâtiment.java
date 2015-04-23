package com.constructsio;

public class Bâtiment {
	//Attributs
	int prix;
	String nom;
	boolean constructFini = false;
	boolean paiement = false;
	
	//création des options
	Option option1 = new Option();
	Option option2 = new Option();
	
	//Constructeur
	public Bâtiment(){
		
	}
	
	//Constructeur avec paramètres
	public Bâtiment(int prix,String nom,boolean constructFini,boolean paiement){
		this.nom = nom;
		this.prix= prix;
		this.constructFini = constructFini;
		this.paiement=paiement;
	}
	
	//Méthodes
	
	public int prixglobal(){
		int total = 0;
		if (prix > 0){
			total = prix + option1.prix + option2.prix;
		}
		else 
		{
			throw new RuntimeException("Erreur , le prix n'est pas valable");
		}
		return total;
	}
	
	//get et set
	
	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isConstructFini() {
		return constructFini;
	}

	public void setConstructFini(boolean constructFini) {
		this.constructFini = constructFini;
	}

	public boolean isPaiement() {
		return paiement;
	}

	public void setPaiement(boolean paiement) {
		this.paiement = paiement;
	}

	public Option getOption1() {
		return option1;
	}

	public void setOption1(Option option1) {
		this.option1 = option1;
	}

	public Option getOption2() {
		return option2;
	}

	public void setOption2(Option option2) {
		this.option2 = option2;
	}
	

}
