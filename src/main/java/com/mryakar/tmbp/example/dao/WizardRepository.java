package com.mryakar.tmbp.example.dao;

import com.mryakar.tmbp.example.entity.WizardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WizardRepository extends JpaRepository<WizardEntity, Long> {
}
