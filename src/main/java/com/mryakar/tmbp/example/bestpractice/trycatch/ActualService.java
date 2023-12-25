package com.mryakar.tmbp.example.bestpractice.trycatch;

import com.mryakar.tmbp.example.bestpractice.SampleEntity;
import com.mryakar.tmbp.example.bestpractice.SampleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ActualService {

    private final BrokenService brokenService;
    private final SampleRepository repository;

    @Transactional(rollbackFor = RuntimeException.class)
    public void action() {
        SampleEntity entity = new SampleEntity();
        entity.setId(1L);
        entity.setName("sample");
        repository.save(entity);
        try {
            brokenService.aBrokenTask();
        } catch (Exception e) {
            System.out.println("Sshhhhh...");
        }
    }
}