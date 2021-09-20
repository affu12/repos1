package sampleapp;

public class BootClass {

	public static void main(String[] args) {
		System.out.println("Hello! from STS!");
		show();

	}
	
	public static void show() {
		int sum=0;
		int[] arr= {10,20,30,40};
		for(int i:arr) {
			sum+=i;
			System.out.println(i);
		}
		System.out.println("show method here!");
	}

}
