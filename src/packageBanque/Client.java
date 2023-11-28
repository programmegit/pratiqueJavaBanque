package packageBanque;

import java.util.Arrays;

public class Client {

	private int code;
	private String nom;
	private String prenom;
	private String adresse;
	private Agence monAgence;
	private Compte mesCompte[];
	
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Agence getMonAgence() {
		return monAgence;
	}

	public void setMonAgence(Agence monAgence) {
		this.monAgence = monAgence;
	}

	public Compte[] getMesCompte() {
		return mesCompte;
	}

	public void setMesCompte(Compte[] mesCompte) {
		this.mesCompte = mesCompte;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Compte getCompte(int c){
		return null;
	}
	
	

	@Override
	public String toString() {
		return "Client [code=" + code + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", monAgence="
				+ monAgence + ", mesCompte=" + Arrays.toString(mesCompte) + "]";
	}

	
	//Les méthodes
	
	public void addCompte (Compte c){
		
	}
	
	public  void deposer(int solde) {
		
	}
	
	public void  retirer(int solde){
		
	}
	
	public int getNbComptes() {
		return 0;
	}

	public int getCode() {
		return code;
	}

	
	
}
