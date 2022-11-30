package surcharge;

public class Personnage {
    int age = 18;
    static String type = "Personnage";
    static String shout(){ return "arme"; }
    int grow() { return ++age;}
}

class Archer extends Personnage {
    int age = 25;
    static String type = "Archer";
    static String shout(){ return "arme"; }
    int grow() { return ++age;}

    public static void main(String[] args) {
        Archer a = new Archer();
        Personnage a2 = new Archer();
        Personnage p = new Personnage();
        System.out.println(a.age);      // 25
        System.out.println(a.type);     // Archer
        System.out.println(a.shout());  // arme
        System.out.println(a.grow());   // 26

        System.out.println(a2.age);     // 18
        System.out.println(a2.type);    // Personnage
        System.out.println(a2.shout()); // arme
        System.out.println(a2.grow());  // 26

        System.out.println(p.age);      // 18
        System.out.println(p.type);     // Personnage
        System.out.println(p.shout());  // arme
        System.out.println(p.grow());   // 19
    }

}


