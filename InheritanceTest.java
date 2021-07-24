class Parent {
    void parent()
    {
        System.out.println("This is the Parent Class");
    }
}

class Child extends Parent {
    void child()
    {
        System.out.println("This is the Child Class");
    }
}

class InheritanceTest {
    public static void main(String args[])
    {
        Parent p=new Parent();
        Child c=new Child();
        p.parent();
        c.child();
        c.parent();
    }
}