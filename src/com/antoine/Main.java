package com.antoine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Client> ListeClient = new ArrayList<Client>();
	static ArrayList<Medicament> ListeMedicament = new ArrayList<Medicament>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Medicament m1 = new Medicament("Doliprane", 5.50, 10);
		Medicament m2 = new Medicament("Daliprune", 3.70, 15);
		ListeMedicament.add(m1);
		ListeMedicament.add(m2);
		Client c1 = new Client("Jean", 0);
		Client c2 = new Client("Louis", 0);
		ListeClient.add(c1);
		ListeClient.add(c2);
		

		System.out.println("Que voulez vous faire? \n 1 pour afficher \n 2 pour approvisionner \n 3 pour achat \n 4 pour quitter"
		+ "\n 5 pour verifier si un client est enregistré");
		
		int key = sc.nextInt();
		switch (key) {
		case 1 : 
			affichage();	//affiche clients et leurs crédits + médicaments et leurs stocks
			break;
		case 2 : 
			approvisionner();	//lire nom + quantité à ajouter en stock dans terminal
								//nom connu ? while
								//dans lireMedicament puis ajouter stock
			break;
		case 3 : 
			achat();
			break;
		case 4 :
			quitter();
			break;
		case 5 :
			lireClient();
			break;
			default:
			break;
	}

}
	//**************************************************************************************************************	
	
	public static void affichage()
	{
		System.out.println("Souhaitez vous afficher les informations concernant \n -un client (1) \n -un medicament (2) ?");
		int a = sc.nextInt();
		if(a == 1)
		{
			System.out.println("Vous avez choisi d'afficher les infos d'un client \n Saisissez son identifiant : ");
			int id = sc.nextInt();
			for(int i = 0; i < ListeClient.size(); i++)
			{
				if(ListeClient.get(i).getId() == id)
				{
					System.out.println("Voici les information du client avec l'identifiant : " + id + "\n " + ListeClient.get(i));
				}
			}
		}
		else if(a == 2)
		{
			System.out.println("Vous avez choisi d'afficher les infos d'un medicament \n Saisissez son identifiant : ");
			int id = sc.nextInt();
			for(int i = 0; i < ListeMedicament.size(); i++)
			{
				if(ListeMedicament.get(i).getId() == id)
				{
					System.out.println("Voici les information de l'employé avec l'identifiant : " + id + "\n " + ListeMedicament.get(i));
				}
			}
		}
		else
		{
			System.out.println("Souhaitez vous afficher les informations concernant \n -un client (1) \n -un medicament (2) ?");
		}
	}
	
	//**************************************************************************************************************
	
	
	public static void approvisionner()
	{
		System.out.println("Veuillez saisir l'identifiant du medicament à approvisionner : ");
		int id = sc.nextInt();
		for(int i = 0; i < ListeMedicament.size(); i++)
		{
			if(ListeMedicament.get(i).getId() == id)
			{
				System.out.println("Voici les information du medicament avec l'identifiant : " + id + "\n " + ListeMedicament.get(i));
				System.out.println("Veuillez saisir la quantité à ajouter au stock de " + ListeMedicament.get(i));
				ListeMedicament.get(i).appro(sc.nextInt());
				System.out.println("Voici les information du medicament avec l'identifiant : " + id + "\n " + ListeMedicament.get(i));
			}
		}
		
		
		
	}
	
	//**************************************************************************************************************	
	
	public static void achat()
	{
		System.out.println("Veuillez saisir l'identifiant du medicament acheté : ");
		int id = sc.nextInt();
		
		for(int i = 0; i < ListeMedicament.size(); i++)
		{
			if(ListeMedicament.get(i).getId() == id)
			{
				System.out.println("Voici les information du medicament avec l'identifiant : " + id + "\n " + ListeMedicament.get(i));
				System.out.println("Son stock est de " + ListeMedicament.get(i).getStock());
				System.out.println("Veuillez saisir la quantité achetée par le client ");
				ListeMedicament.get(i).achat(sc.nextInt());
				System.out.println("Le stock de" + ListeMedicament.get(i).getNom() + " est désormais à " + ListeMedicament.get(i).getStock());
				
				
				System.out.println("Veuillez saisir l'identifiant du client : ");
				int idC = sc.nextInt();
				
				for(int j = 0; j < ListeClient.size(); j++)
				{
					if(ListeClient.get(j).getId() == idC)
					{
						System.out.println("Le client paie l'intégralité du prix du medicament ? \n 1 pour Oui \n 2 pour Non");
						int a = sc.nextInt();
						if(a == 2)
						{
							System.out.println("Saisissez le montant payé par le client");
							double montant = sc.nextDouble();
							
							//ListeClient.get(j).setCredit() = ListeMedicament.get(i).getPrix() - montant;
						}
					}
				}
				
				
				
				
			}
		}
		
		
		
		
		
		System.out.println("Transaction terminée !");
	}
	
	//**************************************************************************************************************	
	
	public static void quitter()
	{
		System.out.println("Fin de l'application !");
	}

	//**************************************************************************************************************	
	
	public static void lireClient()
	{
		System.out.println("Saisissez le nom du client :");
		String nom = sc.next();
		for(int i = 0; i < ListeClient.size(); i++)
		{
			if(nom == ListeClient.get(i).getNom())
			{
				System.out.println("Le client " + ListeClient.get(i).getNom() + " existe bien");
			}
		}
		System.out.println("Il n'y a aucun client du nom de " + nom);
	
}
}