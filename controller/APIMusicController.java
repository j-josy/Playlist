package br.com.josseanevendetti.playlist.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.josseanevendetti.playlist.api.model.dto.MusicDTO;
import br.com.josseanevendetti.playlist.music.api.service.MusicService;
import br.com.josseanevendetti.playlist.util.MusicMapper;

@RestController

 
@RequestMapping("/api /musics")
  public class APIMusicController {
    @Autowired
    
 
   

    

private MusicService service;

    @PostMapping
 public ResponseEntity<MusicDTO>insert(@RequestBody MusicDTO musicDTO){
   
  var music = MusicService.insertOrUpdate(MusicMapper.toMusic(musicDTO)) ;
 

   if(music != null) 
      return new ResponseEntity<>(MusicMapper.fromMusic(music),HttpStatus.CREATED);
 
      return new ResponseEntity<>(new MusicDTO(),HttpStatus.NOT_FOUND);
 }
   @PutMapping
   public ResponseEntity<MusicDTO>update(@RequestBody MusicDTO musicDTO) { 
   
      var music = MusicService.insertOrUpdate(MusicMapper.toMusic(musicDTO));

      if(music != null)
         return new ResponseEntity<>(MusicMapper.fromMusic(music),HttpStatus.OK);
         return new ResponseEntity<>(new MusicDTO(), HttpStatus.NOT_FOUND);
      

   

   }

  @GetMapping("/{id}")
  public ResponseEntity< MusicDTO> findById(@PathVariable int id) {
   var music = service.findById(id);
   if(music.isPresent())
      return new ResponseEntity<>(MusicMapper.fromMusic(music.get()), HttpStatus.OK);
   return  new ResponseEntity<>(new MusicDTO(),HttpStatus.NOT_FOUND);

  }
   @DeleteMapping("/{id}")
   public ResponseEntity<String> delete(@PathVariable int id) {
      var isSuccess = service.delete(id);

      if(isSuccess)
         return new ResponseEntity<>("Music deletado com sucesso!!!", HttpStatus.OK);
      return new ResponseEntity<>("Não foi possível remover a música!!!", HttpStatus.NOT_FOUND);
   }
   


}

