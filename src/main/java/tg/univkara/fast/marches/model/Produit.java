package tg.univkara.fast.marches.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produits")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@Enumerated(EnumType.STRING)
	private TypeProduit type;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit")
	private List<Vente_Produit> ventes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Vente_Produit> getVentes() {
		return ventes;
	}

	public void setVentes(List<Vente_Produit> ventes) {
		this.ventes = ventes;
	}
	
	public List<Vente_Produit> addVente(Vente_Produit vente) {
		this.ventes.add(vente);
		return this.ventes;
	}
	
	
	
}
