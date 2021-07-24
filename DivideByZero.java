public class DivideByZero {
    static int divideNumber(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Can't divide by Zero");
        }else {
            return a/b;
        }
    }
        public static void main(String args[]){
            DivideByZero c = new DivideByZero();
            System.out.println(c.divideNumber(1, 0));
        }
        
}
    

