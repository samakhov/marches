package tg.univkara.fast.marches.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vente_produit")

public class Vente_Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int Id;
	
	@Column(name = "prix_unitaire")
	public int prix_unitaire;
	
	@Column(name = "origine")
	public String origine;
	
	@Column(name = "quantite")
	public int quantite;
	
	@ManyToOne
	@JoinColumn(name = "ville_id", referencedColumnName = "id")
	public Ville ville;
	
	@ManyToOne
	@JoinColumn(name = "ville_id", referencedColumnName = "id")
	public Marche marche;
	
	@ManyToOne
	@JoinColumn(name = "produit_id", referencedColumnName = "id")
	public Produit produit;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(int prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Marche getMarche() {
		return marche;
	}

	public void setMarche(Marche marche) {
		this.marche = marche;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}
