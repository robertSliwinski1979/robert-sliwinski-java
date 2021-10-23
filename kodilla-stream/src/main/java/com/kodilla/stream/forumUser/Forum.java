package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theListOfForumUser = new ArrayList<>();

    public Forum() {

        theListOfForumUser.add(new ForumUser(1, "Paul", "Green", 'M', 2012, 6, 4, 0));
        theListOfForumUser.add(new ForumUser(2, "Sarah", "Connor", 'F', 2005, 2, 14, 0));
        theListOfForumUser.add(new ForumUser(3, "Anna", "Sorrow", 'F', 1995, 4, 1, 4));
        theListOfForumUser.add(new ForumUser(4, "John", "Scary", 'M', 1980, 7, 29, 10));
        theListOfForumUser.add(new ForumUser(5, "Kate", "Bush", 'F', 2003, 5, 12, 3));
        theListOfForumUser.add(new ForumUser(6, "Brian", "Creed", 'M', 2003, 4, 23, 4));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theListOfForumUser);
    }
}
