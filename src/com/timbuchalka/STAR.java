package com.timbuchalka;

public class STAR extends HeavenlyBody {
    private final String bodyType;
    public STAR(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        this.bodyType = "STAR";
    }
}
