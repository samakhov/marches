package tg.univkara.fast.marches.services;

import java.util.List;

import tg.univkara.fast.marches.services.dto.MarcheDto;

public interface MarcheServices {
	
	List<MarcheDto> getAllMarches();
	
	MarcheDto save(MarcheDto marche);

}
