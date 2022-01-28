package com.example.crudvideoapp.service;

import com.example.crudvideoapp.model.VideoCassette;
import com.example.crudvideoapp.repository.CassetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCassetteManager {

    private CassetteRepository cassetteRepository;


    @Autowired
    public VideoCassetteManager(CassetteRepository cassetteRepository) {
        this.cassetteRepository = cassetteRepository;
    }

    public Optional<VideoCassette> findById(Long id){
        return cassetteRepository.findById(id);
    }

    public Iterable<VideoCassette> findAll(){
        return cassetteRepository.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette){
        return cassetteRepository.save(videoCassette);
    }

    public void deleteById(Long id){
        cassetteRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb(){
        save(new VideoCassette(1L,"Titanic", LocalDate.of(1995,1,1)));
        save(new VideoCassette(2L,"Pulp Fiction", LocalDate.of(1992,3,15)));
    }

}
