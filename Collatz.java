/** Class that prints the Collatz sequence starting from a given number.
 * e.g. if input 5, output is 5,16,8,4,2,1.
 */
public class Collatz {
    public static int nextNumber(int n){
        if (n==1) {
            n=n;
        }
        if (n%2==0){
           n=n/2;
        }
        else if(n%2==1){ /* use else if otherwise when n==1 this line will be proceed */
            n=3*n+1;
        }
        return n;
    }
    public static void main(String[] args) {
        int n = 7;
        while(n>=1){
            System.out.print(n+" ");
            if(n==1){
                break;
            }
            n=nextNumber(n);
        }
        }
    }

