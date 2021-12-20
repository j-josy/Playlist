package br.com.josseanevendetti.playlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.josseanevendetti.playlist.api.model.dto.MusicDTO;

@Controller
@RequestMapping("/musics")
public class MusicController {
   @GetMapping
   public String formInsert(Model model) {
       MusicDTO music = new MusicDTO() ;
       music.addAttribute("objMusic", music);
       return "faixas/register";
   }

}
