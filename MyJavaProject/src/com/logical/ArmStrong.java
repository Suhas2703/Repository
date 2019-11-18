package com.logical;

class ArmStrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		System.out.println("ArmStrong number\n");
		while(num>0)
		{
			int l=num%10;
			sum=sum+(l*l*l);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("ArmStrong number "+temp);
		}
		else
		{
			System.out.println("Not ArmStrong number "+temp);
		}

	}

}
