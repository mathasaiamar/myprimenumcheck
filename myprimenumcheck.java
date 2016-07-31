import java.util.Scanner;

public class myprimenumcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        
        myprimenumcheck primeNum = new myprimenumcheck();

        if ( primeNum.isPrime(num) ) {
            System.out.printf("\n Result: The number %d is Prime", num);
        } else {
            System.out.printf("\n Result: The number %d is not Prime", num);
        }
    }
    
    // Method to check whether the number is prime or not
    public boolean isPrime(int num) {
        if ( num < 2 ) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ( num % i == 0 ) {
                return false;
            }
        }
        return true;
}
}