import java.util.Scanner;

public class PrimeFactorSum {

 /* WAJP to take user input to get sum of all the  prime factors of the number.
Eg: n=72
o/p: 2+2+2+3+3= 12
    */

public static int addPrimeFactor(int n){
int sumofPfactor = 0;
    for(int i=2;i<=n;i++){
        while (n%i==0) {
         sumofPfactor  = sumofPfactor +i;
         n =n/i;
        }
 }
    return sumofPfactor;
}


public static void main(String[] args){

    System.out.println("enter the value : ");

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println("the output is :"+ n);
   int sum =  addPrimeFactor(n);

   System.out.println("the Sum of prime factors is : "+ sum);


}



}
