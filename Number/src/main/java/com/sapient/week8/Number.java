package com.sapient.week8;

public class Number {

	 boolean checkPrime(int x) {
	 	boolean flag=false;
	 	for(int i=2;i<=x/2;i++) {
	 		if(x%i==0) {
	 			flag=true;
	 			break;
	 		}
	 	}
	 	if(!flag)
	 		return true;
	 	else
	 		return false;
	 }
	 boolean checkPalindrome(int x) {
	 	int revnum=0, rem,num=x;
	 	while(x!=0) {
	 		rem=x%10;
	 		revnum=revnum*10+rem;
	 		x/=10;
	 	}
	 	if(revnum==num)
	 		return true;
	 	else
	 		return false;
	 }
	 boolean checkArmstrong(int x) {
	 	int res=0,rem,num=x;
	 	while(x!=0) {
	 		rem=x%10;
	 		res+=rem*rem*rem;
	 		x/=10;
	 	}
	 	if(res==num)
	 		return true;
	 	else
	 		return false;
	 }
}