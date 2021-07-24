public class Factorial {
    //method for factorial non-recursive design
    public static long factorialN(long number){
        long factorialNumber=1;
        if(number==0)
            return 1;
        for(long i =1; i<=number; i++){ //for loop 
            factorialNumber*=i;
        }
        return factorialNumber;
    }
    //method for factorial Recursive design
    public static long factorialR(long number){
        if(number==0) //return 1 if the number is equal 0
            return 1;
        else    
            return(number*factorialR(number-1)); //The function factorialR will minus 1 and rerun itself. 
                                                //calling the function from itself
    }
    public static void main(String[] args){
        System.out.println(factorialN(20));
        System.out.println(factorialR(20));
    }   
}