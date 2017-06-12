package ie.cit.larkin.jpa.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ie.cit.larkin.jpa.LarkinJpaApplication;
import ie.cit.larkin.jpa.domain.Artist;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=LarkinJpaApplication.class)
@SpringBootTest
public class ArtistRepositoryTests {

	@Autowired
	ArtistRepository artistRepository;
	
	@Test
	public void findAll() {
		assertEquals(5, artistRepository.findAll().size());
	}

	@Test
	public void get() {
		Artist artist = artistRepository.get(1);
		assertEquals("Chadwick, Lynn", artist.getName());
	}
}
