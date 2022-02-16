package com.programs;
import java.util.*;
public class VowelOrConsonant {
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	char val=sc.next( ).charAt(0);	 
	//char val=sc.nextChar();
	System.out.println("Enter a character : " + val);

	switch(val)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Entered character "+val+" is  Vowel");
	else 
		if((val>='a'&&val<='z')||(val>='A'&&val<='Z'))
		System.out.println("Entered character "+val+" is Consonent");
		else
		System.out.println("Not an alphabet");		
	}
}