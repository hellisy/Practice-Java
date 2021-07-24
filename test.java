class Base {
    public void Printee() {
    System.out.println("Base");
    }         
    }
    
class Derived extends Base {    
    public void Printe() {
        System.out.println("Derived");
    }
    }
    
class MainClass{
    static void DoPrinte(Base o) {
       System.out.println(o);
    }
public static void main(String[] args) {
    Base x = new Base();
    Base y = new Derived();
    Derived z = new Derived();
    DoPrinte(x);
    DoPrinte(y);
    DoPrinte(z);
    }
    }
    