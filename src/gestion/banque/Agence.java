package gestion.banque;

public class Agence {
    String numero;
    String adresse;
    
    public Agence() {
        	
    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Compte getCompte(int solde ) {
		return null;
	}
	
	public Client getClient() {
		return null;
	}
	
	public void addCompte(Compte c) {
		
	}
    
	public void addClient(Client cl) {
		
	}
	
	public int getNombreClient() {
		return 0;
	}
	
	public int getNombreCompte() {
		return 0;
	}
}
