package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator {

    private Statistics statistics;
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double avPostsPerUser;
    private double avCommentsPerUser;
    private double avCommentsPerPost;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public double getAvCommentsPerUser() {
        return avCommentsPerUser;
    }

    public double getAvCommentsPerPost() {
        return avCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if(numberOfUsers==0){
            avCommentsPerUser = 0;
            avPostsPerUser = 0;
            avCommentsPerPost = 0;
        }

        if(numberOfPosts==0){
            avCommentsPerUser = 0;
            avPostsPerUser = 0;
            avCommentsPerPost = 0;
        }else{
            avCommentsPerPost = numberOfComments/numberOfPosts;
            avCommentsPerUser = numberOfComments/numberOfUsers;
            avPostsPerUser = numberOfPosts/numberOfUsers;
        }
    }
    public void showStatistics() {
        System.out.println("Average post per user:" + avPostsPerUser + ", average comments per user: " + avCommentsPerUser + ", average comments per post: " + avCommentsPerPost);
    }
}
