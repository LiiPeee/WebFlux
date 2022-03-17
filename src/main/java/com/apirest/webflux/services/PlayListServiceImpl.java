package com.apirest.webflux.services;

import com.apirest.webflux.document.PlayList;
import com.apirest.webflux.repository.PlayListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlayListServiceImpl implements PlayListService{
    @Autowired
    private PlayListRepository playListRepository;

    @Override
    public Flux<PlayList> findAll() {
        if(playListRepository!=null){
            return playListRepository.findAll();
        }
        return null;
    }

    @Override
    public Mono<PlayList> findById(String id) {
        if(playListRepository!=null){
            return playListRepository.findById(id);
        }
        return null;
    }

    @Override
    public Mono<PlayList> save(PlayList playList) {
        if (playListRepository!=null){
            return playListRepository.save(playList);
        }
        return null;
    }
}
