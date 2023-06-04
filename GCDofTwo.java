import java.util.Scanner;

class GCDofTwo{
	
public static void main(String[] args){
	
int num1;
int num2;
	
Scanner sc=new Scanner(System.in);

System.out.print("Enter number 1: ");
num1=sc.nextInt();


System.out.print("Enter number 2: ");
num2=sc.nextInt();
	
for(int i=1 ; i<=num1 && i<=num2 ; i++){

if(num1%i==0 && num2%i==0){
	System.out.println(i+" is a gcd of "+num1+" and "+num2);

}
		
}




}
	
}
