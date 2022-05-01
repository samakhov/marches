package tg.univkara.fast.marches.repositories;

import java.util.List;

import tg.univkara.fast.marches.models.Marche;

public interface MarcheDao {

	public Marche save(Marche marche);
	
	public List<Marche> findAll();
	
}
