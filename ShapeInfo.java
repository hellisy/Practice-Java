class Shape {
    void printShape(){
        System.out.println("This is This is shape");
    }
    
}

class Rectanglee extends Shape {
    void printRectangle(){
        System.out.println("This is rectangualar shape");
    }
}

class Circlee extends Shape {
    void printCircle(){
        System.out.println("This is circle shape");
    }
}

class Square extends Rectanglee {
    void printSquare(){
        System.out.println("Square is a rectangle");
    }
}

class ShapeInfo {
    public static void main(String args[]){
        Square s=new Square();
        s.printShape();
        s.printRectangle();
    }
}




