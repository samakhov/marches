package tg.univkara.fast.marches.model;

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

@Entity
@Table(name = "marche")
public class Marche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int Id;
	
	@Column(name = "Nom")
	public String Nom;
	
	@Column(name = "emplacement")
	public String emplacement;
	
	@Column(name = "superficie")
	public String superficie;
	
	@Column(name = "heure_ouverture")
	public String heure_ouverture;
	
	@Column(name = "heure_fermeture")
	public String heure_fermeture;
	
	@ManyToOne
	@JoinColumn(name = "id")
	public Ville ville;
	
	@ManyToMany
	@JoinTable(
			  name = "marche_jour_marche", 
			  joinColumns = @JoinColumn(name = "id_marche"), 
			  inverseJoinColumns = @JoinColumn(name = "id_jour_de_marche"))
	public Set<JourDeMarche> jour_de_marche;
	 
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marche")
	public List<Vente_Produit> vente_produit;
	
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
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

	public Set<Jour_De_Marche> getJour_de_marche() {
		return jour_de_marche;
	}

	public void setJour_de_marche(Set<Jour_De_Marche> jour_de_marche) {
		this.jour_de_marche = jour_de_marche;
	}

	public List<Vente_Produit> getVente_produit() {
		return vente_produit;
	}

	public void setVente_produit(List<Vente_Produit> vente_produit) {
		this.vente_produit = vente_produit;
	}
	
	
	
}
