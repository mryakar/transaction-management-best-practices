package com.mryakar.tmbp.example.propagation.required;

import com.mryakar.tmbp.example.dao.HouseRepository;
import com.mryakar.tmbp.example.dto.HouseDto;
import com.mryakar.tmbp.example.mapper.HouseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class HouseServiceImpl implements HouseService {

    private final HouseRepository repository;
    private final HouseMapper mapper;

    @Transactional
    @Override
    public List<HouseDto> read() {
        return mapper.toDto(repository.findAll());
    }

}