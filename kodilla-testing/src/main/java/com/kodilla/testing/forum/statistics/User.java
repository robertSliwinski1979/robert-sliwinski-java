package com.kodilla.testing.forum.statistics;

public class User {
    String name;
    int posts;
    String comment;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosts() {
        return posts;
    }

    public void addPosts(int posts) {
        this.posts = posts;
    }

    public String addComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // calculateAdvStatistics(Statistics statistics)
    // showStatistics()
    //
}
