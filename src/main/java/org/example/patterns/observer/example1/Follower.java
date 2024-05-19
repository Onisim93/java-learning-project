package org.example.patterns.observer.example1;

public class Follower {

    private String name;

    public Follower(String name) {
        this.name = name;
    }

    public void update(Editor editor) {
        System.out.println("Уведомление для подписчика " + name);
        System.out.println("Редактор " + editor.getName() + " добавил новый пост! Спеши прочесть!");
    }



}
