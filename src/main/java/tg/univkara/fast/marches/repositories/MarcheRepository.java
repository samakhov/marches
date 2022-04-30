package tg.univkara.fast.marches.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tg.univkara.fast.marches.models.Jour;
import tg.univkara.fast.marches.models.Marche;

public interface MarcheRepository extends JpaRepository<Marche, Long>{
	List<Marche> findByJourDeMarche(Jour jour);
	
	List<Marche> findBySuperficie(float superficie);
}
