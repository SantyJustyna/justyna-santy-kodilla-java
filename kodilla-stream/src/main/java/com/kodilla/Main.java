package com.kodilla;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMap = forum.getUserList().stream()
                .filter(user->user.getSex()=='M')
                .filter(user-> LocalDate.now().getYear() - user.getBirthDate().getYear() >= 20)
                .filter(user->user.getPostsNumber()!=0)
                .collect(Collectors.toMap(ForumUser::getIdNumber, user->user));

        System.out.println("# elements: " + theResultMap.size());
        theResultMap.entrySet().stream()
                .map(entry->entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}