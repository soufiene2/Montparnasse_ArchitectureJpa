package com.infotel.presentation;

import java.util.ArrayList;
import java.util.List;

import com.infotel.metier.Client;
import com.infotel.metier.Employe;
import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		
		Iservice services = new ServiceImpl();
//		Personne p = new Personne();
//		p.setNom("ZEC");
//		p.setPrenom("UNION");
//		p.setAge(20);
//		
//		
//		
//		Employe e = new Employe();
//		e.setNom("toto");
//		e.setPrenom("tata");
//		e.setAge(34);
//		e.setSalaire(2000);
//
//		
//		Client c = new Client();
//		c.setNom("TR");
//		c.setPrenom("SR");
//		c.setAge(22);
//		c.setNumeroAdherent(67);
//		
//		services.ajouterPersonne(p);
//		services.ajouterPersonne(e);
//		services.ajouterPersonne(c);
		
		// visualiser une personne
//		System.out.println(services.affichagePersonne(2));
		
		// supprimer une personne
//		Personne p = new Personne();
//		p = services.getPersonne(3);
//		
//		services.supprimerPersonne(p);
//		
//		// modifier une personne
//		
//		Personne a = new Personne();
//		a = services.affichagePersonne(2);
//		a.setNom("La");
//		services.modifierPersonne(a); 
		
		//Solution 1System.out.println(services.findAllPersonnes());
		
		//for(Personne p : services.findAllPersonnes()) {
		//	System.out.println(p)}
		
		
		//for(Personne p : services.rechercheParMC("TR")) {
		//	System.out.println(p);}
	
	
	//findAllPersonnesConnexions()
//	for (Personne pers : services.findAllPersonnesConnexions()) {
//		System.out.println(pers + " " + pers.getConnexion());
//	}

	//findAllPersonnesAdresses()
	for (Personne pers : services.findAllPersonnesAdresses()) {
		System.out.println(pers + " " + pers.getAdresse());
	}

}
}
