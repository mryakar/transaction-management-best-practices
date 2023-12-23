package com.mryakar.tmbp.example.propagation.required;


import com.mryakar.tmbp.example.dto.HouseDto;

import java.util.List;

public interface HouseService {
    List<HouseDto> read();
}