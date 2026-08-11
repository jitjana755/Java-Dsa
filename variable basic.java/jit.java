class Father {
    public void show() {
        System.out.println("father is the best");
    }
}

class Son extends Father {
    @Override
    public void show() {
        System.out.println("son has own car");
    }
}

public class jit {
    public static void main(String[] args) {
        Father f = new Father();
        f.show();

        Son s = new Son();
        s.show();

        Father p = new Son(); // polymorphism
        p.show();
    }
}