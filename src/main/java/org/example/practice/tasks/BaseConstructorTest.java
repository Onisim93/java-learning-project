package org.example.practice.tasks;

public class BaseConstructorTest {


    public static void main(String[] args) {
        Base ext = new Extension();
        ext.add(8);
        ext.printCounter();
    }

    public static class Base {

        protected int counter;

        public Base() {
            add(1);
        }

        public void add(int v) {
            counter += v;
        }

        public void printCounter() {
            System.out.println(counter);
        }

    }

    public static class Extension extends Base {

        public Extension() {
            super();
            add(2);
        }

        @Override
        public void add(int v) {
            counter += v*2;
        }
    }
}
