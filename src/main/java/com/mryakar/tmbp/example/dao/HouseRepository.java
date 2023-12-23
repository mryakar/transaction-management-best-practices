package com.mryakar.tmbp.example.dao;

import com.mryakar.tmbp.example.entity.HouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<HouseEntity, Long> {
}
