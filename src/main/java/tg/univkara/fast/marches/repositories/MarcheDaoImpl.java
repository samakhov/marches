package tg.univkara.fast.marches.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tg.univkara.fast.marches.models.Marche;

@Service
public class MarcheDaoImpl implements MarcheDao {

	@Autowired
	private MarcheRepository marcheRepository;
	
	@Override
	public Marche save(Marche marche) {
		return marcheRepository.save(marche);
	}

	@Override
	public List<Marche> findAll() {
		return marcheRepository.findAll();
	}

}
