package com.timbuchalka;

public class MOON extends HeavenlyBody {
    private final String bodyType;
    public MOON(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        this.bodyType = "MOON";
    }
}
