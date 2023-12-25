package com.mryakar.tmbp.example.bestpractice.autosave;

import com.mryakar.tmbp.example.bestpractice.SampleEntity;
import com.mryakar.tmbp.example.bestpractice.SampleRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class AutoSaveService {

    private final SampleRepository repository;

    @Transactional
    public void update(Long id, String newSampleName) {
        SampleEntity entity = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        entity.setName(newSampleName);
    }



}