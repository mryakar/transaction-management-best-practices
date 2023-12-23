package com.mryakar.tmbp.example.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.mryakar.tmbp.example.entity.WizardEntity}
 */
public record WizardDto(Long id, String name, String surname, Long houseId) implements Serializable {
}