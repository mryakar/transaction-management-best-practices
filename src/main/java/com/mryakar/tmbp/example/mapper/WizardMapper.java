package com.mryakar.tmbp.example.mapper;

import com.mryakar.tmbp.example.dto.WizardDto;
import com.mryakar.tmbp.example.entity.WizardEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface WizardMapper {
    @Mapping(source = "houseId", target = "house.id")
    WizardEntity toEntity(WizardDto wizardDto);

    @Mapping(source = "house.id", target = "houseId")
    WizardDto toDto(WizardEntity wizardEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "houseId", target = "house.id")
    WizardEntity partialUpdate(WizardDto wizardDto, @MappingTarget WizardEntity wizardEntity);
}