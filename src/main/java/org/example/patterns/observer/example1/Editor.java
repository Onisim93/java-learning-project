package org.example.patterns.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private List<String> posts;
    private List<Follower> followers;

    private String name;

    public Editor(String name) {
        this.name = name;
        posts = new ArrayList<>();
        followers = new ArrayList<>();
    }

    public void subscribe(Follower follower) {
        followers.add(follower);
    }

    public void addPost(String newPost) {
        posts.add(newPost);
        notifyFollowers();
    }

    private void notifyFollowers() {
        followers.forEach((follower -> follower.update(this)));
    }

    public String getName() {
        return name;
    }

}
