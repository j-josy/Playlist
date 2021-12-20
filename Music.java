package br.com.josseanevendetti.playlist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.josseanevendetti.playlist.api.model.dto.MusicDTO;

@Entity
@Table(name = "musics")
public class Music {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(columnDefinition = "varchar(40) not null")
    private String name;
    @Column(columnDefinition = "varchar(80) not null")
    private String singer;
    @Column(nullable = false)
    private Genre genre;

    public Music (){

    }

    
        

    

    public Music(int id, String name, String singer, String genre) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public Music(int id2, String name2, String singer2, Object genre2) {
    }






    public  int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getSinger() {
        return this.singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Genre getGenre() {
        return this.genre;
    }






    public Music toMusic(MusicDTO musicDTO) {
        return null;
    }
}

