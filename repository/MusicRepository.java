package br.com.josseanevendetti.playlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.josseanevendetti.playlist.model.Music;
@Repository
public interface MusicRepository  extends JpaRepository<Music,Integer>{
    
}

