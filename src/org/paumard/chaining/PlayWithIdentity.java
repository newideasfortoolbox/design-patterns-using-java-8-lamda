package org.paumard.chaining;

import org.paumard.chaining.function.Function;

public class PlayWithIdentity {

    public static void main(String[] args) {

        Function<String , String> identity = Function.identity();

    }
}
