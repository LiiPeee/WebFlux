package com.apirest.webflux.controller;

import com.apirest.webflux.document.PlayList;
import com.apirest.webflux.services.PlayListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
public class PlayListController {


    @Autowired
    private PlayListServiceImpl playListService;


    @GetMapping(value = "/playlists")
    public Flux<PlayList> getPlaylist() {
        return playListService.findAll();

    }
    @GetMapping(value = "/playlists/{id}")
    public Mono<PlayList> getPlaylistId(@PathVariable String id) {
        return playListService.findById(id);
    }

    @PostMapping("/playlists")
    public Mono<PlayList>save(@RequestBody PlayList playList){
        return playListService.save(playList);
    }




}
