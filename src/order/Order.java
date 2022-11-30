package order;

public class Order {
    public static void main(String[] args) {
        Father toto = new Father();
        System.out.println(toto.getClass());

    }
}

class GrandFather{
    GrandFather(){ System.out.println("GrandFather");
        System.out.println(this.getClass());}
    static { System.out.println("static1"); }
    { System.out.println("instance1"); System.out.println(super.getClass());}
}

class Father extends GrandFather{
    Father(){ System.out.println("Father");  }
    static { System.out.println("static2"); }
    { System.out.println("instance2"); }
}
