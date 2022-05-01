package tg.univkara.fast.marches.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tg.univkara.fast.marches.models.Marche;
import tg.univkara.fast.marches.repositories.MarcheDao;
import tg.univkara.fast.marches.services.dto.MarcheDto;
import tg.univkara.fast.marches.services.mapper.MarcheMapper;

@Service
public class MarcheServicesImpl implements MarcheServices {

	@Autowired
	private MarcheDao marcheDao;
	
	@Autowired
	private MarcheMapper marcheMapper;
	
	@Override
	public List<MarcheDto> getAllMarches() {
		List<Marche> marches = marcheDao.findAll();
		List<MarcheDto> marcheDtos = marches.stream().map(marcheMapper::toDto).collect(Collectors.toList());
		return marcheDtos;
	}

	@Override
	public MarcheDto save(MarcheDto marcheDto) {
		Marche marche = marcheMapper.fromDto(marcheDto);
		marche = marcheDao.save(marche);
		return marcheMapper.toDto(marche);
	}

}
