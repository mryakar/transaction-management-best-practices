package com.mryakar.tmbp.example.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.mryakar.tmbp.example.entity.HouseEntity}
 */
public record HouseDto(Long id, String name) implements Serializable {
}