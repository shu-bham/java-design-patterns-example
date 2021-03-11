package com.patterns.structural.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My Twitter Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
