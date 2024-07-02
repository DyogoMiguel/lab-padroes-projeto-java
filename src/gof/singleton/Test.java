package gof.singleton;

public class Test {
public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
}
}
