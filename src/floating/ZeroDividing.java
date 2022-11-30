package floating;

public class ZeroDividing {
    public static void main(String[] args) {

        System.out.println((0.1 + 0.1+ 0.1) / 3);
        System.out.println((0.1 + 0.1+ 0.1) / 3 == 0.1);
        System.out.println(avg(0.1, 0.2, 0));
        System.out.println(avg(0.1, 0.1, 0.1) == 0.1);

    }

    static double avg(double... numbers){
        double sum = 0.0;
        for (double d : numbers) {
            sum += d;
        }
        return sum / numbers.length;
    }
}
