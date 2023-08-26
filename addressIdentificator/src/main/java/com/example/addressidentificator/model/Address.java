package com.example.addressidentificator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@Setter
@SuperBuilder
public class Address {

    private String queryAddress;

    private TargetAddress[] targetAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(queryAddress, address.queryAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryAddress);
    }
}
