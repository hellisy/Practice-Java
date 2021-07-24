class Vehicle
{
   int noofseats;
   int noofwheels;
   public static void main(String args[]){
      Vehicle car = new Vehicle();
      Vehicle motorcycle = new Vehicle();
      car.noofseats = 4;
      car.noofwheels = 4;
      motorcycle.noofseats = 2;
      motorcycle.noofwheels = 2;
      System.out.println("Car has " + car.noofseats +"\n"+"seats.");
      System.out.println("Car has " + car.noofwheels +" wheels.");
      System.out.println("Motorcycle has " +  motorcycle.noofseats +" seats.");
      System.out.println("Motorcycle has " + motorcycle.noofwheels +" wheels.");
   }
}