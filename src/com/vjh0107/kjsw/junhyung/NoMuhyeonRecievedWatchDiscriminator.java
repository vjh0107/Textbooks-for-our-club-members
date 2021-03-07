package com.vjh0107.kjsw.junhyung;

import com.vjh0107.kjsw.junhyung.interfaces.NoMuhyeon;

public class NoMuhyeonRecievedWatchDiscriminator implements NoMuhyeon {


/* //<--- UnComment code ( option + enter )
    public NoMuhyeonRecievedWatchDiscriminator() {
        noMuhyeonRecievedClock = false; // final 이기 때문에 변경할 수가 없다, 에러발생
    } //생성자는 생략 가능
*/


    @Override
    public void isNoMuhyeonRecievedClock() {
        printTruthOfNoMuhyen(aWhiteLie);
    }

    @Override
    public void isNoMuhyeonRecievedClock(Boolean iWantKnowTruthOfNoMuhyeon) {
        if (iWantKnowTruthOfNoMuhyeon == true) {
            printTruthOfNoMuhyen(noMuhyeonRecievedClock);
        }
    }


}
