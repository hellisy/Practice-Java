class MemberInfo {
     String name;
     int age;
     int phoneNumber;
     String address;
     int salary;
    
     void printSalary(){
         System.out.println(salary);
     }
    
}

class Employee extends MemberInfo {
    String specialization;
}

class Manager extends MemberInfo {
    String department;
}

class EmployeeInfo {
    public static void main(String args[]){
        Employee e=new Employee();
        Manager m=new Manager();
        e.name = "John";
        e.age = 27;
        e.phoneNumber = 613613613;
        e.address= "200 Riverside";
        e.salary = 12000;
        e.printSalary();
        m.name = "Nhoj";
        m.age = 72;
        m.phoneNumber = 316316431;
        m.address= "edisrever 002";
        m.salary = 21000;
        m.printSalary();

    }
}
