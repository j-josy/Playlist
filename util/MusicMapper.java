package br.com.josseanevendetti.playlist.util;
import br.com.josseanevendetti.playlist.api.model.dto.MusicDTO;
import br.com.josseanevendetti.playlist.model.Music;

public class MusicMapper {

    private MusicMapper() { 

    }
    public static MusicDTO fromMusic( Music music) {
    return new MusicDTO(music.getId(), music.getName(), music.getSinger(), music.getGenre());

}
        public static Music toMusic( MusicDTO dto) {    
    return new Music(dto.getId(), dto.getName(), dto.getSinger(), dto.getGenre());
    

        }
        
    
    }
    
