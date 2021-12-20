package br.com.josseanevendetti.playlist.music.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.josseanevendetti.playlist.MusicRepository;
import br.com.josseanevendetti.playlist.model.Music;

@Service
public class MusicService {
    @Autowired
private MusicRepository repository ;
    
public Music inSertOrUpdate( Music music ) {
   
return repository.save(music);

}

public List <Music> findAll(){
    return repository.findAll();
 }
    public Optional<Music> findById(int id) {
        return repository.findById(id);
    }
    public boolean delete(int id) {
       var existMusic = this.findById(id); 
       
       if(existMusic.isPresent()){
           repository.deleteById(id);
           existMusic = this.findById(id);
           return existMusic.isEmpty();
       }
       
       return false;

    }

    public static Music insertOrUpdate(Music music) {
        return null;
    }

    
    }

