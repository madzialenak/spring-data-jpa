package ie.cit.larkin.jpa.service;

import java.util.List;

import ie.cit.larkin.jpa.domain.Artist;

public interface ArtistService {

	void save(Artist artist);
	
	Artist get(int id);
	
	void remove(Artist artist);
	
	List<Artist> findAll();
}
