package com.timbuchalka;

public class PLANET extends HeavenlyBody{
    private final String bodyType;

    public PLANET(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        this.bodyType = "PLANET";
    }
}
