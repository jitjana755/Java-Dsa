class grandfather {
    public void house(){
        System.out.println("3BHK house");
    }
}

class father extends grandfather {
    public void lend(){
        System.out.println("3 acres land");
    }
}

class son extends father {
    public void car(){
        System.out.println("own car audi");
    }
}

public class Main {
    public static void main(String args[]){
        son s = new son();
        s.house();
        s.lend();
        s.car();
    }
}