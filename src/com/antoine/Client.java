package com.antoine;

public class Client {
	//Attributs
	private static int compteurC = 0;
	protected int id;
	protected String nom;
	protected double credit;
	
	//Constructeur par défaut
		public Client()
		{
			compteurC++;
			this.id = compteurC;
		}
	
	//Constructeur surchargé
		public Client(String nom, double credit) {
			super();
			compteurC++;
			this.id = compteurC;
			this.nom = nom;
			this.credit = credit;
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

		public double getCredit() {
			return credit;
		}

		public void setCredit(double aCrediter) {
			this.credit += aCrediter;
		}
		
	//toString
		@Override
		public String toString() {
			return "Client [nom=" + nom + ", credit=" + credit + "]";
		}
	
	//Fonctions

		

	
}
