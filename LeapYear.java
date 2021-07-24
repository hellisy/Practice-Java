class LeapYear
{
   public static void main(String[] args){
      int year = 2000; //the variable for the year
      boolean leap = false;//false until proven opposite by if
      //checking if the year is divisible by 4
      if (year % 4 == 0){
          //check if its a century year
          if (year % 100 == 0) {
              //check if it is divisbile by 400
              if (year % 400 == 0)
                leap = true;
              else
                leap = false;
          }else
            leap = true;
      }else
         leap = false;

      if (leap)
         System.out.println(year + " is a leap year.");
      else
         System.out.println(year + " is not a leap year.");
       

    }
   
}
