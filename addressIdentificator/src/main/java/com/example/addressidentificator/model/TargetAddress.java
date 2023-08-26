package com.example.addressidentificator.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Embeddable
@Setter
@Getter
@SuperBuilder
public class TargetAddress {
    private String[] address;

    public TargetAddress() {

    }
}
