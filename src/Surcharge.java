public class Surcharge {
    public static void main(String[] args) {
        Surcharge sut = new Surcharge();
        sut.surcharge(1, (short)1);
    }

    void surcharge(long i, short i2){
        System.out.println("int int");
    }
    void surcharge(int i, Short... i2){
        System.out.println("int int");
    }
}
