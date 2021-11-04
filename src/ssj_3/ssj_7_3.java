package ssj_3;

import java.util.Scanner;

public class ssj_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num;
		int numcount[]=new int[101];
		for(i=0;i<101;i++)
			numcount[i]=0;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		while(true) {
			 num=input.nextInt();
			if(num==0) break;
			numcount[num]++;
		}
		for( i=1;i<=100;i++) {
		if(numcount[i]==1)
			System.out.print(i+" occurs 1 time\n");
		else if(numcount[i]>1)
			System.out.print(i+" occurs "+numcount[i]+" times\n");
		}
	}

}
