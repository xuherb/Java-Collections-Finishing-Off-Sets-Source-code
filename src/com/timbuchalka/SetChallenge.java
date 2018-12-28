package com.timbuchalka;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetChallenge {
    private static Scanner scan = new Scanner(System.in);
    private static final Set<String> bodyTypes = new HashSet<>();

    public static void main(String[] args) {
        addDefaultBodyTypes();


    }

    private static void addDefaultBodyTypes(){
        bodyTypes.add("STAR");
        bodyTypes.add("PLANET");
        bodyTypes.add("MOON");
    }
}
