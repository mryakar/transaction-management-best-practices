package com.mryakar.tmbp.example.entity;

import com.mryakar.tmbp.example.Constant;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = Constant.HOUSES_TABLE_NAME)
@SequenceGenerator(
        name = Constant.SEQUENCE_GENERATOR_NAME,
        sequenceName = Constant.HOUSES_SEQUENCE_NAME,
        allocationSize = 1
)
@Getter
@Setter
@RequiredArgsConstructor
public class HouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Constant.HOUSES_SEQUENCE_NAME)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy hibernateProxy ? hibernateProxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy hibernateProxy ? hibernateProxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        HouseEntity that = (HouseEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy hibernateProxy ? hibernateProxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}