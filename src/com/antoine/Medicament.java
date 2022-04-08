package com.antoine;

public class Medicament {
	//Attributs
	private static int compteurM = 0;
	protected int id;
	protected String nom;
	protected double prix;
	protected int stock;
	
	//Constructeur par défaut
		public Medicament()
		{
			compteurM++;
			this.id = compteurM;
		}
		
	//Constructeur surchargé
		public Medicament(String nom, double prix, int stock) {
			super();
			compteurM++;
			this.id = compteurM;
			this.nom = nom;
			this.prix = prix;
			this.stock = stock;
	}

	//Getters and Setters
		public String getNom() {
			return nom;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public double getPrix() {
			return prix;
		}

		public void setPrix(double prix) {
			this.prix = prix;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

	//toString
		@Override
		public String toString() {
			return "Medicament [nom=" + nom + ", prix=" + prix + ", stock=" + stock + "]";
		}
	
	//Fonctions
		public void appro(int quantite) {
			stock += quantite;
		}

		public void achat(int quantite)
		{
			stock -= quantite;
		}
		
}
