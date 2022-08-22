package sample.em;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchSiteTest {

    @Test
    void getUrl() {
        String url = SearchSite.NAVER.getUrl();
        System.out.println("url = " + url);
    }
}