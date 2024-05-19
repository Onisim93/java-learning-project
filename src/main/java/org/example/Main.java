package org.example;

import org.example.patterns.observer.example1.Editor;
import org.example.patterns.observer.example1.Follower;

public class Main {
    public static void main(String[] args) {
        Editor editor1 = new Editor("Андрей");
        Editor editor2 = new Editor("Евгений");
        Editor editor3 = new Editor("Сергей");


        Follower follower1 = new Follower("Олег");
        Follower follower2 = new Follower("Максим");
        Follower follower3 = new Follower("Федор");
        Follower follower4 = new Follower("Петр");
        Follower follower5 = new Follower("Алексей");

        editor1.subscribe(follower1);
        editor1.subscribe(follower2);
        editor1.subscribe(follower3);

        editor2.subscribe(follower4);
        editor2.subscribe(follower5);

        editor3.subscribe(follower1);
        editor3.subscribe(follower2);
        editor3.subscribe(follower3);
        editor3.subscribe(follower4);
        editor3.subscribe(follower5);


        editor1.addPost("Post 1");

        editor2.addPost("Post 1");

        editor3.addPost("Post 1");
    }
}