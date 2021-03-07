package com.vjh0107.kjsw.junhyung;

import com.vjh0107.kjsw.junhyung.interfaces.NoMuhyeon;

class main {
    public static void main(String[] args){
        NoMuhyeonRecievedWatchDiscriminator noMuhyeonRecievedWatchDiscriminator = new NoMuhyeonRecievedWatchDiscriminator();
        noMuhyeonRecievedWatchDiscriminator.isNoMuhyeonRecievedClock(); // false
        noMuhyeonRecievedWatchDiscriminator.isNoMuhyeonRecievedClock(true); // true

        NoMuhyeon.truthCantBeChanged(); //불변의 진리 true
    }
}