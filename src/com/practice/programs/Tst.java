package com.practice.programs;

public class Tst {
	public static void main(String[] args) {
		

	String str2="helleo";
	String str1="hello";
	String big,small;
	if(str1.length()>str2.length())
	{
	big=str1;
	small=str2;
	}else{
	big=str2;
	small=str1;
	}
	for(int i=0; i<big.length();i++)
	{
	if (!(big.contains(String.valueOf(small.charAt(i)))))
	{
		System.out.println("the unique letters are " +small.charAt(i));
		}
		}


		}


		}

