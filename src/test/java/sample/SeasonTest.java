package sample;

import org.junit.jupiter.api.Test;
import sample.em.Season;

class SeasonTest {

    @Test
    void seasonTest(){
        String name = Season.AUTUMN.name();
        System.out.println("name = " + name);
    }
}