package ssj_3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ssj_7_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list=new int[100];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int num=input.nextInt();
		System.out.print("Enter the contents of the list: ");
		for(int i=0;i<num;i++)
			list[i]=input.nextInt();
		System.out.print("The list has "+num+" integers ");
		for(int i=0;i<num;i++)
			System.out.print(list[i]+" ");
		if(isSorted(list)) 
			System.out.print("\nThe list is already sorted\n");
		else
			System.out.print("\nThe list is not sorted\n");
	}
	public static boolean isSorted(int[] list) {
		for(int i=1;i<Array.getLength(list);i++)
			if(list[i]<list[i-1]) return false;
		return true;
	}
}
