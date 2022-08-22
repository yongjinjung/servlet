package sample.em;

public enum SearchSite {
    NAVER("https://www.naver.com"),
    DAUM("https://www.daum.net"),
    GOOGLE("https://www.google.com"),
    BING("https://www.bing.com");

    private final String url;

    SearchSite(String url) {
        this.url = url;
    }

    public String getUrl(){
        return url;
    }
}
