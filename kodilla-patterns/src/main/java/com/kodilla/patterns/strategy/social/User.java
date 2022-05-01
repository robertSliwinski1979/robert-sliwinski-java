package com.kodilla.patterns.strategy.social;

public class User {
    private final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String publish (){
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
    public void sharePost(){
        System.out.println("Don't know, what this method should supposed to do");
    }
}
