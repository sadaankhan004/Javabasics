import java.util.*;
public class javabasics{
        public static void checkPrime(int n){
            boolean isPrime=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
                if(isPrime==true){
                    System.out.println(n);
                }
        }
        public static void primeRange(int n){
            for(int i=1;i<=n;i++){
                checkPrime(i);
            }
        }
        public static void bintodec(int binN){
            int mynum= binN;
            int decN=0;
            int pow=0;
            while(binN>0){
            int ld=binN%10;
            decN=decN+(ld*(int)Math.pow(2,pow));
            pow++;
            binN=binN/10;
            }
            System.out.println("decimal number of "+mynum+" is "+decN);
        }
        public static void dectobin(int n){
            int mynum=n;
            int binN=0;
            int pow=0;
            while(n>0){
                int rem=n%2;
                binN=binN+(rem*(int)Math.pow(10,pow));
                pow++;
                n=n/2;
            }
            System.out.println("Binary number of "+mynum+" is "+binN);
        }
        public static void average(int a,int b,int c){
            int av=(a+b+c)/3;
            System.out.println("Average of three numbers is "+av);
        }
        public static boolean isEven(int a){
            boolean even=true;
            if(a%2!=0){
                even=false;
            }
            return even;
        }
        public static void isPalindrome(int a){
            int temp=a;
            int rev=0;
            while(temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
            }
            if (rev==a){
                System.out.println("Number is palindrome.");
            }
            else{
                System.out.println("Number is not palindrome.");
            }
        }
        public static void sumofdigit(int a){
            int sum=0;
            int mynum=a;
            while(a>0){
                int ld=a%10;
                sum=sum+ld;
                a=a/10;
            }
            System.out.println("The sum of digits of "+mynum+" is " +sum);
        }
        public static void hollowrect(int totrows,int totcols){
            for(int i=1;i<=totrows;i++){
                for(int j=1;j<=totcols;j++){
                    if(i==1 || i==totrows || j==1 ||j==totcols){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void halfinvtri(int n){
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                 System.out.println();
            }
        }
        public static void halfinvnumtri(int n){
            for (int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        public static void floydstri(int n){
            int counter=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(counter+" ");
                    counter++;
                }
                System.out.println();
            }
        }
        public static void tri01(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1"+" ");
                    }
                    else{
                        System.out.print("0"+" ");
                    }
                }
                System.out.println();
            }
        }
        public static void butterfly(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(); 
            }
        }
    public static void rhombus(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    if(j==1||j==n || i==1 ||i==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
    public static void diamond(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=((2*i)-1);j++){
                    System.out.print("*");
                }
                System.out.println(); 
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=((2*i)-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        butterfly(4);
    }
}
   