package com.example.crudvideoapp.rest;

import com.example.crudvideoapp.model.VideoCassette;
import com.example.crudvideoapp.repository.CassetteRepository;
import com.example.crudvideoapp.service.VideoCassetteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kasety")
public class VideoCassetteApi {



    private VideoCassetteManager videoCassettes;

    public VideoCassetteApi(VideoCassetteManager videoCassettes) {
        this.videoCassettes = videoCassettes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll(){

        return videoCassettes.findAll();
    }
    @GetMapping
    public Optional<VideoCassette> getById(@RequestParam Long index){


        return videoCassettes.findById(index);
    }



    @PostMapping
    public VideoCassette addVideoCassette(@RequestBody VideoCassette videoCassette){

        return videoCassettes.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateVideoCassette(@RequestBody VideoCassette videoCassette){

        return videoCassettes.save(videoCassette);
    }
    @DeleteMapping
    public void deleteVideoCassette(@RequestParam Long index){

        videoCassettes.deleteById(index);
    }

}
