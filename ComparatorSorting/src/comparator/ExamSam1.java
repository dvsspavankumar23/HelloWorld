package comparator;

import java.util.Scanner;

public class ExamSam1 {
	public static void highest(int[][] a, int n) {
		int i,j,max=-1;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		System.out.println("The highest no in the matrix is: "+max);
	}
	public static void swapping(int[][] a, int n) {
		int fr=0,lr=n-1,i,j;
		for(i=0;i<n;i++) {
			int temp=a[fr][i];
			a[fr][i]=a[lr][i];
			a[lr][i]=temp;
		}
		System.out.println("Matrix after swapping is: ");
		System.out.println();
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,max=-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n for size of matrix");
		n= sc.nextInt();
		int a[][] = new int[n][n];
		int i,j;
		System.out.println("Enter values Into the matrix");
		for(i=0;i<n;i++) {
			System.out.println("Enter "+n+" values for row "+i);
			for(j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\t\tMENU");
		System.out.println("Enter 1 for finding highest number in the matrix");
		System.out.println("Enter 2 for swapping first and last row");
		int option = sc.nextInt();
		switch(option) {
		case 1: highest(a,n);
				break;
		case 2: swapping(a,n);
				break;
		}
	}

}
