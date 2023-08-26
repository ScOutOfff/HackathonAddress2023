package com.example.addressidentificator.model;

import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@Setter
@SuperBuilder
public class Address {

    private Long targetBuildingId;

    private String address;

    @Embedded
    private TargetAddress targetAddress;

    public Address() {
    }

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
