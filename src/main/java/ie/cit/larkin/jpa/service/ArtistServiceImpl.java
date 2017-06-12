package ie.cit.larkin.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.cit.larkin.jpa.domain.Artist;
import ie.cit.larkin.jpa.repository.ArtistRepository;

@Service
public class ArtistServiceImpl implements ArtistService {

	ArtistRepository artistRepository;
	
	@Autowired
	public ArtistServiceImpl(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}

	@Override
	public void save(Artist artist) {
		artistRepository.save(artist);
	}

	@Override
	public Artist get(int id) {
		return artistRepository.get(id);
	}

	@Override
	public List<Artist> findAll() {
		return artistRepository.findAll();
	}

	@Override
	public void remove(Artist artist) {
		artistRepository.remove(artist);
	}

}

