package packageBanque;

import java.util.Arrays;

public class Agence {
    private String numero;
    private String adresse;
    private Client lesClients[];
	private Compte lesComptes[];
    
    
   
    
    public Agence(int numero) {
    	this.numero = this.getClass().getSimpleName()+":"+numero;
    	
    	System.out.println(this.numero);
    }

     
	public Agence(String numero, String adresse, Client[] lesClients, Compte[] lesComptes) {
		
		this.numero = numero;
		this.adresse = adresse;
		this.lesClients = lesClients;
		this.lesComptes = lesComptes;
	}
  
	
	

	//La méthode ToString
   @Override
	public String toString() {
		return "Agence [numero=" + numero + ", adresse=" + adresse + ", lesClients=" + Arrays.toString(lesClients)
				+ ", lesComptes=" + Arrays.toString(lesComptes) + "]";
	}


	//Getter Setter
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
	
	
	public Client[] getLesClients() {
		return lesClients;
	}


	public void setLesClients(Client[] lesClients) {
		this.lesClients = lesClients;
	}


	public Compte[] getLesComptes() {
		return lesComptes;
	}


	public void setLesComptes(Compte[] lesComptes) {
		this.lesComptes = lesComptes;
	}

	
	
	//les méthodes
	
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
