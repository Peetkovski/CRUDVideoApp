package com.example.crudvideoapp.repository;


import com.example.crudvideoapp.model.VideoCassette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface CassetteRepository extends JpaRepository<VideoCassette, Long> {
    VideoCassette findVideoCassetteById(Long id);
}
