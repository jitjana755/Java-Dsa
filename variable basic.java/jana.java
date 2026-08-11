public class jana {

    public static void main(String[] args) {
        int x = 90;
        double o = 3.90000046;
        int jit = 9000;

        System.out.println(x - o);
        System.out.println(jit - x - o);

        hiralal h = new hiralal();
        h.display();
    }
}

class son {

    public son() {
        System.out.println("jana family");
    }
}

class hiralal extends son {

    public void display() {
        System.out.println("jit is good boy");
    }
}