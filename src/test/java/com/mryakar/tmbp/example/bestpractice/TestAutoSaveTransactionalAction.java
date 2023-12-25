package com.mryakar.tmbp.example.bestpractice;

import com.mryakar.tmbp.example.bestpractice.autosave.AutoSaveService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestAutoSaveTransactionalAction {

    @Autowired
    AutoSaveService autoSaveService;

    @Autowired
    SampleRepository repository;

    @Test
    void oldSample_update_success() {
        Long entityId = 1L;
        String oldSampleName = "old";
        SampleEntity entity = new SampleEntity();
        entity.setId(entityId);
        entity.setName(oldSampleName);
        repository.save(entity);

        String newSampleName = "new";
        autoSaveService.update(entityId, newSampleName);

        SampleEntity updatedEntity = repository.findById(entityId).orElseThrow();
        assertEquals(oldSampleName, updatedEntity.getName());
    }

}