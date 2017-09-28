
public class ControlStucture {
public static void main(String []args) {
	FooBarBaz();
	primePrinter();
	System.out.println("Complete");
	
}
public static void FooBarBaz() {
	int x;
	for (x=1;x<=500;x++) {
	
		if (x%3==0) {
			if (x%7==0) {
				if (x%10==0) {
					System.out.println("FooBarBaz");}
			if (x%10!=0) {
				System.out.println("FooBar");
			}
			}
		if (x%7!=0) {
			if(x%10==0) {
			System.out.println("FooBaz");
		}
		}
		if(x%7!=0) {
			if(x%10!=0) {
				System.out.println("Foo");
			}
		}
		}
		if(x%3!=0) {
			if(x%7==0) {
				if (x%10==0) {
					System.out.println("BarBaz");
				}
					if(x%10!=0) {
						System.out.println("Bar");
					}
			}
				if(x%7!=0) {
					if(x%10!=0) {
						System.out.println(x);
					}
						if(x%10==0) {
							System.out.println("Baz");
						}
				}
		}
	}
}

public static void primePrinter() {
	System.out.println("ChappedButtchecks");
}



public static boolean isPrime(int num) {
	if (num==2) 
		return true;
	if (2 > num) 
		return false;
	for (int x=3; num>x ; x+=2) {
		if (num%x==0)
			return false;	
	}
	return true;
	}
//public static int first50Primes() 
	

}






