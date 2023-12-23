package com.mryakar.tmbp.example.mapper;

import com.mryakar.tmbp.example.dto.HouseDto;
import com.mryakar.tmbp.example.entity.HouseEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HouseMapper {
    HouseEntity toEntity(HouseDto houseDto);

    HouseDto toDto(HouseEntity houseEntity);

    List<HouseDto> toDto(List<HouseEntity> entities);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HouseEntity partialUpdate(HouseDto houseDto, @MappingTarget HouseEntity houseEntity);
}