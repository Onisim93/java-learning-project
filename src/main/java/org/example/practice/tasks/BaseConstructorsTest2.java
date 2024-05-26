package org.example.practice.tasks;

public class BaseConstructorsTest2 {

    public static void main(String[] args) {
        A d = new B();
        d.incrementCounter(5);
        d.printCounter();
    }



    static class A {

        int counter;

        A() {
            incrementCounter(1);
        }

        public void incrementCounter(int i) {
            counter += i;
        }


        public void printCounter() {
            System.out.println(counter);
        }

    }

    static class B extends A {

        B() {
            incrementCounter(2);
        }

        @Override
        public void incrementCounter(int i) {
            counter += i * 2;
        }
    }

    static class C extends B {
        C() {
            incrementCounter(3);
        }


    }

    static class D extends C{

        D() {
            incrementCounter(4);
        }
    }


}
