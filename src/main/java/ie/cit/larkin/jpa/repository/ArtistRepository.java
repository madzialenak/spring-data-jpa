package ie.cit.larkin.jpa.repository;

import java.util.List;

import ie.cit.larkin.jpa.domain.Artist;

public interface ArtistRepository {

	public Artist get(int id);
	
	public void save(Artist artist);

	public void remove(Artist artist);
	
	public List<Artist> findAll();
	
}

