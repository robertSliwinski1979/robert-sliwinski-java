package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum newListOfUsers = new Forum();

        Map<Integer, ForumUser> theMapOfUsers = newListOfUsers.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M' && Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() > 20 && forumUser.getNrOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + theMapOfUsers.size());
        theMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
