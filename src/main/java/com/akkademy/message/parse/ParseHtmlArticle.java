package com.akkademy.message.parse;

public class ParseHtmlArticle {

    private final String url;
    private final String body;

    public ParseHtmlArticle(String url, String body) {
        this.url = url;
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public String getBody() {
        return body;
    }
}
