package tg.univkara.fast.marches.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "marches")
public class Marche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "Nom")
	private String Nom;
	
	@Column(name = "emplacement")
	private String emplacement;
	
	@Column(name = "superficie")
	private float superficie;
	
	@Column(name = "heure_ouverture")
	private String heure_ouverture;
	
	@Column(name = "heure_fermeture")
	private String heure_fermeture;
	
	@ManyToOne
	@JoinColumn(name = "ville_id", referencedColumnName = "id")
	private Ville ville;
	
	@ManyToMany
	@JoinTable(
			  name = "marche_jour_marche", 
			  joinColumns = @JoinColumn(name = "id_marche"), 
			  inverseJoinColumns = @JoinColumn(name = "id_jour_de_marche"))
	private List<JourDeMarche> jour_de_marche = new ArrayList<JourDeMarche>();
	 
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marche")
	private List<Vente_Produit> vente_produit = new ArrayList<Vente_Produit>();
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public String getHeure_ouverture() {
		return heure_ouverture;
	}

	public void setHeure_ouverture(String heure_ouverture) {
		this.heure_ouverture = heure_ouverture;
	}

	public String getHeure_fermeture() {
		return heure_fermeture;
	}

	public void setHeure_fermeture(String heure_fermeture) {
		this.heure_fermeture = heure_fermeture;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<JourDeMarche> getJour_de_marche() {
		return jour_de_marche;
	}

	public void setJour_de_marche(List<JourDeMarche> jour_de_marche) {
		this.jour_de_marche = jour_de_marche;
	}

	public List<Vente_Produit> getVente_produit() {
		return vente_produit;
	}

	public void setVente_produit(List<Vente_Produit> vente_produit) {
		this.vente_produit = vente_produit;
	}
	
	
	
}
