package com.mryakar.tmbp.example.bestpractice.trycatch;

import org.springframework.stereotype.Service;

@Service
public class BrokenService {

    public void aBrokenTask() {
        throw new RuntimeException();
    }
}
