package br.com.josseanevendetti.playlist.api.model.dto;

import br.com.josseanevendetti.playlist.model.Genre;

public class MusicDTO {

   public static final String NOT_FOUND = null;
private int id;
   private String name;
   private String singer;
   public Genre genre;

   public MusicDTO() { 

}

public MusicDTO(int id, String name, String singer, Object object) {
    this.id = id;
    this.name = name;
    this.singer = singer;
}

public int getId() {
    return this.id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return this.name;
}

public void setName(String name) {
    this.name = name;
}

public String getSinger() {
    return this.singer;
}

public void setSinger(String singer) {
    this.singer = singer;
}

public Object getGenre() {
    return null;
}

public void addAttribute(String string, MusicDTO music) {
}

}

