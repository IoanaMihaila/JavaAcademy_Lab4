package Tema4;

class Aa {
    public void doSomething() {
        System.out.println("Hello from A!");
    }
}

class Bb extends Aa {
    public void doSomething() {
        System.out.println("Hello from B!");
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Aa obj = new Bb();
        obj.doSomething();//Hello from B!
    }

}
