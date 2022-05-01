package tg.univkara.fast.marches.services.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import tg.univkara.fast.marches.models.Marche;
import tg.univkara.fast.marches.services.dto.MarcheDto;

@Component
public class MarcheMapper {

	public Marche fromDto(MarcheDto marcheDto) {
		if (marcheDto == null)  {
			return null;
		}
		Marche marche = new Marche();
		BeanUtils.copyProperties(marcheDto, marche);
		return marche;
	}
	
	public MarcheDto toDto(Marche marche) {
		if (marche == null)
			return null;
		
		MarcheDto marcheDto = new MarcheDto();
		BeanUtils.copyProperties(marche, marcheDto);
		return marcheDto;
	}
}
