public class PrimeNumberTest {
    /**
	 * This method shall evaluate whether input number is
	 * a prime number or not.
	 * It shall return false if not and true if the input number
	 * is a prime number.
	 * @param n die zu testende nichtnegative Zahl
	 */
    public void primeNumber(long n){
        //check if input is a negative/ 0 or 1
        if(n <= 0 || n == 1){
            System.out.println("No");
        }
        // Check if input is two
        if(n == 2){
            System.out.println("Yes");
        }
        // Go through each number from 2 .. n and see if modulo != 0
        for(long i=2;i<n; i++){
            long remainder = n%i;
            if(remainder == 0){
                System.out.println("No");
                break;
            }
             // No divider was found, that means the input number is a prime number
            if(i == n-1){
                System.out.println("Yes");
                break;
            }else {
                continue;
            }
        }
    }
}
