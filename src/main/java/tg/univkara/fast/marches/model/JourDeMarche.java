package tg.univkara.fast.marches.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Jour_De_Marche")
public class JourDeMarche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "heure_debut")	
	private String heureDebut;
	
	@Column(name = "heure_fin")
	private String heureFin;
	
	@Enumerated(EnumType.STRING)
	private Jour jour;
	
	@Enumerated(EnumType.STRING)
	private FrequenceMarche frequence;
	
	@ManyToMany(mappedBy = "jour_de_marche")
	public Set<Marche> marches = new HashSet<Marche>();

	public JourDeMarche(String heureDebut, String heureFin, Jour jour, FrequenceMarche frequence) {
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.jour = jour;
		this.frequence = frequence;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	public String getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}

	public Jour getJour() {
		return jour;
	}

	public void setJour(Jour jour) {
		this.jour = jour;
	}

	public FrequenceMarche getFrequence() {
		return frequence;
	}

	public void setFrequence(FrequenceMarche frequence) {
		this.frequence = frequence;
	}
	
	public Set<Marche> getMarches() {
		return marches;
	}
	
	public void setMarches(Set<Marche> marches) {
		this.marches = marches;
	}
}
