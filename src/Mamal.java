public class Mamal extends Animal {
    public static void main(String[] args) {
        Mamal m = new Mamal();
        Animal a = new Mamal();
        Animal aa = new Animal();
        m.talk(1);
        a.talk(1);
        aa.talk(1);
    }

    void talk(int i) {System.out.println("Mamal" + " int"); }
    void talk(Integer i) {System.out.println("Mamal" + " Integer"); }

}
