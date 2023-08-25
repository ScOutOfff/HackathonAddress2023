package com.example.addressidentificator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Entity
@Getter
@Setter
@SuperBuilder
public class Address {

    @Id
    private Long targetBuildingId;

    private String address;

    private String targetAddress;

    public Address() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(targetBuildingId, address.targetBuildingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetBuildingId);
    }
}
