package com.patterns.creational.factory;

public class Blog extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentsPage());
        pages.add(new ContactPage());
    }
}
