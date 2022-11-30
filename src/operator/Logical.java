package operator;

public class Logical {
    public static void main(String[] args) {
        isOk();
    }

    private static void isOk() {
        System.out.println(whatToDoToday(true, false, 45));
        System.out.println(whatToDoToday(true, false, 28));
        System.out.println(whatToDoToday(true, true, 28));
        System.out.println(whatToDoToday(true, true, 45));
        System.out.println(whatToDoToday(false, true, 25));
    }

    private static String whatToDoToday2(boolean isGoodFilm, boolean isRainyDay, int wind) {
        if (isGoodFilm && isParaglidingNotPossible(isRainyDay, wind)){
            return "go to cinema";
        }else {
            return "go paragliding";
        }
    }

    private static boolean isParaglidingNotPossible(boolean isRainyDay, int wind) {
        return isWindTooStrong(wind) || isRainyDay;
    }

    private static boolean isWindTooStrong(int wind) {
        return wind > 30;
    }

    private static String whatToDoToday (boolean isGoodFilm, boolean isRainyDay, int wind) {
        if (wind <= 30 & !isRainyDay ^ isGoodFilm){
            return "go paragliding";
        }else {
            return "go to cinema";
        }
    }
}
