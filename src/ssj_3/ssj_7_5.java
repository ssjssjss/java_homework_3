package ssj_3;

import java.util.Scanner;

public class ssj_7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[10];
		int i,j,num,count=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for(i=0;i<10;i++) {
			num=input.nextInt();
			for(j=0;j<count;j++)
				if(num==numbers[j]) break;
			if(j==count) {
				numbers[count++]=num;
			}
		}
		System.out.print("The number of distinct numbers is "+count+"\nThe distinct numbers are: ");
		for(j=0;j<count;j++)
			System.out.print(numbers[j]+" ");
	}

}
