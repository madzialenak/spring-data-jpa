package ie.cit.larkin.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ie.cit.larkin.jpa.domain.Artist;
import ie.cit.larkin.jpa.service.ArtistService;

@Controller
@RequestMapping("/artist")
public class ArtistController {

	@Autowired
	ArtistService artistService;
	
    @RequestMapping("/")
    String list(Model model) {

    	List<Artist> artists = artistService.findAll();
    
    	model.addAttribute("artists", artists);
    	
    	return "artist/list";
    }
}
