package Tema4;

class A {//clasa de baza

    public A() {//constructorul clasei A
        System.out.println("Hello from A!");
    }
}

class B extends A {//clasa B extinde clasa A

    public B() {//constructorul clasei B care apeleaza implicit si constructorul clasei de baza,A
        System.out.println("Hello from B!");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        A obj = new B();
        //Hello from A!
        //Hello from B!
    }

}
