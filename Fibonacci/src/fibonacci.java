
public class fibonacci {

public static void main(String[] args) {
	int t1=0;
	int t2=1;
	int sum=0;
	int num=20; 
	for(int i=1;i<num;i++) {
		System.out.println(t1);
		sum= t1+ t2;
		t1=t2;
		t2= sum;
	}		
  }
}