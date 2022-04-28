package tg.univkara.fast.marches.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int Id;
	
	@Column(name = "nom")
	public String nom;
	
	@Column(name = "type")
	public TypeProduit type;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit")
	public List<Vente_Produit> vente_produit;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeProduit getType() {
		return type;
	}

	public void setType(TypeProduit type) {
		this.type = type;
	}

	public List<Vente_Produit> getVente_produit() {
		return vente_produit;
	}

	public void setVente_produit(List<Vente_Produit> vente_produit) {
		this.vente_produit = vente_produit;
	}
	
	
	
}
