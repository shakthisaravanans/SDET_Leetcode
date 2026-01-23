package Demo5;

public class fibnoseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
		int temp = 1;
		for (int i = 1; i <=n; i++) {
			
			temp=temp*i;
			
		}
		
		System.out.println("Factorial"+temp);
		
		
		System.out.println("-----------fibnokiseries---");
		
		int firtnum = 0,secnum=1,sum =0;
		
		for (int i = 0; i < 11; i++) {
			
			sum = firtnum+secnum;
			firtnum=secnum;
			secnum=sum;
			
		}
System.out.println(sum);

System.out.println("-----------Primeno---");


int P = 10;// check this is prime or not
boolean prime =true;
for (int i = 2; i < n; i++) {
	if(P%i==0) {
		//return prime
		System.out.println(P+"this not a primeno");
		prime=false;
		break;
	}
	
}

if(prime) {
	System.out.println(P+"this is prime no");
}

	}

}
