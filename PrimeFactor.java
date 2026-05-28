import java.util.*;

public class PrimeFactor{
/*  WAJP to take user input and print all the  prime factors of the number.
Eg: n=72
o/p: 2 2 2 3 
*/

public static void primeFactor(int a){
    
    for(int i=2; i<=a;i++){
        
        while(a % i == 0) {
        System.out.println(i);
        a = a / i;
      }
        
    }

}

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);    
        System.out.println("enter the Input");
        int n = sc.nextInt();
        System.out.println("the input is : "+n);
        primeFactor(n);
    }


}