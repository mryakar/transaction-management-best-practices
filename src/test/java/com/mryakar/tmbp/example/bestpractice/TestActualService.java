package com.mryakar.tmbp.example.bestpractice;

import com.mryakar.tmbp.example.bestpractice.trycatch.ActualService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class TestActualService {

    @Autowired
    ActualService service;

    @Autowired
    SampleRepository repository;

    @Test
    void actualService_action_success()  {
        service.action();
        assertEquals(0L, repository.count());
    }
}
