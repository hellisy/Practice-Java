//Project #2
//Simple Shipping cost comparison application
//Coder is Hesham Ellisy

public class CostComparison {
	public static void main(String[] args) {
		int packageWeight1 = 49;
		int packageWeight2 = 50;
		// output the weights of the two packages
		System.out.println("The weight of package 1: "+packageWeight1+" lbs."); //display weight for package 1
		System.out.println("The weight the package 2: "+packageWeight2+" lbs"); //display weight for package 2
	if ((packageWeight1 >= 100 || packageWeight1 < 0) || (packageWeight2 >= 100 || packageWeight2 < 0)){ //if one of the boxes weight is above 100lbs the comparison is cancelled
		System.out.println("One of the packages can not be shipped, Please recheck the weight.\nComparison error..."); //if the above condition is met this statment will output
	}else
	{
		int costPerPound; //cost for package 1
		int costPerPound1; //cost for package 2
		if (packageWeight1 >= 25) //if statment to set the costperPound, if above 25lbs the cost is $10 per lbs
			costPerPound = 10;
		else
			costPerPound = 5; //costPerPound = 5
		System.out.println("Shipping cost of package 1 is $" + 
		costPerPound * packageWeight1); //Shuipping cost for package 1 formula
		if (packageWeight2 >= 25)  //if above 25lbs for package 2 cost is $10 per lb
			costPerPound1 = 10;
		else
			costPerPound1 = 5;//if less than 25lbs cost is $5 per lb
		System.out.println("Shipping cost of package 2 is $" +
			costPerPound1 * packageWeight2); //shipping cost for package 2
		if ((costPerPound * packageWeight1)>(costPerPound1 * packageWeight2)){
			System.out.println("It will cost $"+((costPerPound * packageWeight1)-(costPerPound1 * packageWeight2))+" more to ship package 1."); //if package 1 heavier than package 2 
		}else if ((costPerPound * packageWeight1)<(costPerPound1 * packageWeight2)){
			System.out.println("It will cost $"+((costPerPound1 * packageWeight2)-(costPerPound * packageWeight1))+" more to ship package 2."); //if package 2 heavier than package 1
		} else { //if both packages are the same weight
			System.out.println("There is no difference in shipping cost, both packages are the same weight."); 
		}
		  

	}


	
	}
}