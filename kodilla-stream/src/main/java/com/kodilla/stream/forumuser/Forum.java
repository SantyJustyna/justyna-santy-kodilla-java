package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(001, "User1", 'M', 1982, 7, 20, 10));
        forumUserList.add(new ForumUser(002, "User2", 'M', 1972, 4, 2, 9));
        forumUserList.add(new ForumUser(003, "User3", 'M', 1990, 5, 30, 87));
        forumUserList.add(new ForumUser(004, "User4", 'F', 1989, 1, 20, 77));
        forumUserList.add(new ForumUser(005, "User5", 'F', 2005, 6, 12, 2));
        forumUserList.add(new ForumUser(006, "User6", 'M', 2009, 7, 20, 1));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
