package com.apirest.webflux;

import com.apirest.webflux.document.PlayList;
import com.apirest.webflux.repository.PlayListRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

//@Component
//public class DummyData implements CommandLineRunner {
//    private final PlayListRepository playListRepository;
//
//    DummyData(PlayListRepository playListRepository){
//        this.playListRepository = playListRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        playListRepository.deleteAll()
//        .thenMany(
//                Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
//                           "GITHUB" , "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
//                            .map(nome -> new PlayList(UUID.randomUUID().toString(), nome))
//                            .flatMap(playListRepository::save))
//                .subscribe(System.out::println);
//
//    }
//}
