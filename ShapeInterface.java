interface Circle {
    void circle();
}

interface Rectangle {
    void rectanglee();
}

class Shapes implements Circle, Rectangle {
    public void circle(){
        System.out.println("This is circle shape");
    }
    public void rectangle(){
        System.out.println("This is Rectangle shape");
    }
}

class ShapeInterface {
    public static void main(String args[]){
        Shapes s = new Shapes();
        s.circle();
        s.rectangle();
    }
}
