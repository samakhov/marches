package tg.univkara.fast.marches.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tg.univkara.fast.marches.services.MarcheServices;
import tg.univkara.fast.marches.services.dto.MarcheDto;

@RestController
public class MarcheController {

	@Autowired
	private MarcheServices marcheServices;
	
	@GetMapping("/marches/all")
	public List<MarcheDto> getMarches() {
		return marcheServices.getAllMarches();
	}
	
}
