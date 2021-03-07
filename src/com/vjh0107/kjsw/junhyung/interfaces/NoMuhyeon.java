package com.vjh0107.kjsw.junhyung.interfaces;

public interface NoMuhyeon {

    Boolean noMuhyeonRecievedClock = true; // final 선언은 불필요
    Boolean aWhiteLie = false;

    default void printTruthOfNoMuhyen(Boolean iNR) {
        System.out.println(iNR);
    }

    void isNoMuhyeonRecievedClock();
    void isNoMuhyeonRecievedClock(Boolean iWantKnowTruthOfNoMuhyeon);

    static void truthCantBeChanged() {
        String nmrc;
        if (noMuhyeonRecievedClock) {
            nmrc = "Desperately, he took someone's watch as a bribe.";
        } else {
            nmrc = "History is constantly glorified. But this time it's different."; // noMuhyeonRecievedClock 필드는 Final이기에 변경할 수 없다.
        }
        System.out.println(nmrc);
    }

}
