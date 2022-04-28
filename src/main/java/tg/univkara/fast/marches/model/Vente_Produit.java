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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "prix_unitaire")
	private int prix_unitaire;
	
	@Column(name = "quantite")
	private int quantite;
	
	@ManyToOne
	@JoinColumn(name = "ville_id", referencedColumnName = "id")
	private Ville ville;
	
	@ManyToOne
	@JoinColumn(name = "marche_id", referencedColumnName = "id")
	private Marche marche;
	
	@ManyToOne
	@JoinColumn(name = "produit_id", referencedColumnName = "id")
	private Produit produit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(int prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
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
