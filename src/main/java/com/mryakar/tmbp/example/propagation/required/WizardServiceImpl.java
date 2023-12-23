package com.mryakar.tmbp.example.propagation.required;

import com.mryakar.tmbp.example.dao.WizardRepository;
import com.mryakar.tmbp.example.dto.WizardDto;
import com.mryakar.tmbp.example.mapper.WizardMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@AllArgsConstructor
public class WizardServiceImpl implements WizardService {

    private final WizardRepository repository;
    private final WizardMapper mapper;
    private final HouseService houseService;

    @Transactional
    @Override
    public Long create(WizardDto dto) {
        return null;
    }
}
