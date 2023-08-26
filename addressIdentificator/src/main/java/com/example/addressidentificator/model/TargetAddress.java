package com.example.addressidentificator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class TargetAddress {
    private String[] targetAddresses;

    public TargetAddress() {}
}
