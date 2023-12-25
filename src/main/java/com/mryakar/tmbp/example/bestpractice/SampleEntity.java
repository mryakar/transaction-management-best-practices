package com.mryakar.tmbp.example.bestpractice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sample")
@RequiredArgsConstructor
@Getter
@Setter
public class SampleEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sample_name", nullable = false)
    private String name;

}
