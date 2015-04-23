package com.constructsio;

import junit.framework.Assert;

import org.junit.Test;

public class BâtimentTest {
	
	//deffinition de l'environement de test
	
	Bâtiment maison1 = new Maison(150000,"maison1",false,false,false);
	Bâtiment imm1 = new Immeuble(1000000, "immeuble1",false,false,5);
	
	//test pour terminer la construction
	@Test
	public void changerEtatConstruction(){
		maison1.constructFini = true;
		Assert.assertEquals(true, maison1.constructFini);
	}
	
	//test pour effectuer le paiement
	@Test
	public void changerEtatPaiementMaison(){
		maison1.paiement = true;
		Assert.assertEquals(true, maison1.paiement);
	}
	
	//test pour changer le nom de la maison
	@Test
	public void changementNomMaison(){
		maison1.nom="MaisonTest";
		Assert.assertEquals("MaisonTest",maison1.nom);
	}
	
	//test pour changer le prix d'une maison
	@Test
	public void changementPrixMaison1(){
		maison1.prix=123000;
		Assert.assertEquals(123000, maison1.prix);
	}
	
	//test pour affecter une option 1 a une maison
	@Test
	public void affecterOption1AMaison1(){
		maison1.option1.prix=250;
		maison1.option1.description = "Sécurité";
		Assert.assertEquals(250, maison1.option1.prix);
		Assert.assertEquals("Sécurité", maison1.option1.description);
		}
	
	//test pour affecter une option 2 a une maison
	@Test
	public void affecterOption2AMaison1(){
		maison1.option2.prix=2500;
		maison1.option2.description = "Entretient";
		Assert.assertEquals(2500, maison1.option2.prix);
		Assert.assertEquals("Entretient", maison1.option2.description);
		}
	
	//test pour calculer le prix total d'une maison
	@Test
	public void calculerPrixMaison1(){
		maison1.prix = 100000;
		maison1.option1.prix=250;
		maison1.option1.description="Sécurité";
		int total = maison1.prixglobal();
		Assert.assertEquals(100250,total);
	}
	
	//test qui relever une exception lorsqu'un prix est < a 0
	@Test(expected = RuntimeException.class)
	public void calculerPrixMaison1AvecErreur(){
		maison1.prix = -1000;
		maison1.prixglobal();
	}
}
