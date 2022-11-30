package surcharge;

import java.util.List;

public class Vin {
    public static void main(String[] args) {
        List<Vin> vins = List.of(new Vin(), new VinPetillant(), new Champagne());
        Vin v = new Vin();
        for (Vin vin: vins)
            v.drink(vin);
        for (Vin vin: vins)
            vin.drink();
    }

    void drink(){ System.out.println(this.getClass());  }

    void drink(Vin vin){ System.out.println("vin"); }
    void drink(VinPetillant vin){ System.out.println("VinPetillant"); }
    void drink(Champagne vin){ System.out.println("Champagne"); }
}

class VinPetillant extends Vin {
    void drink(){ System.out.println(this.getClass());  }
    void drink(Vin vin){ System.out.println("toto");  }
    void drink(Champagne vin){ System.out.println(this.getClass());  }
    void drink(VinPetillant vin){ System.out.println(this.getClass());  }
}
class Champagne extends VinPetillant {void drink(){ System.out.println(this.getClass());  }}