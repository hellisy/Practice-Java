class Student {
    String name;
    int roll_no;
    int phoneNumber;
    String studentAddress;

    public static void main(String []args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.roll_no = 2;
        s1.name = "John";
        s1.phoneNumber = 666666666;
        s1.studentAddress = "1022 Riverside";
        s2.roll_no = 2;
        s2.name = "Sam";
        s2.phoneNumber = 99999999;
        s2.studentAddress = "1022 Sideriver";

        System.out.println(s1.name+" "+s1.roll_no+" "+s1.phoneNumber+" "+s1.studentAddress);
        System.out.println(s2.name+" "+s2.roll_no+" "+s2.phoneNumber+" "+s2.studentAddress);
    
    }



}

