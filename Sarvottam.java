import java.io.*;

import java.util.*;

import java.util.regex.*;

class Sarvottam
{ 
public static void main(String args[])

{ Scanner sc=new Scanner(System.in);
  
int n;

String text=sc.nextLine();

n=Integer.parseInt(sc.nextLine());

pass(text,n);

}

public static void pass(String t,int n)

{
String temp=t;
Scanner sc=new Scanner(System.in);
int i;
String a[]=new String[100];

ArrayList<Integer>res = new ArrayList<>();
	
for(i=0;i<n;i++)	
	
{ 
a[i]=sc.nextLine();
	
}

for(i=0;i<n;i++)
		
{ 
for(int j=-1;(j=temp.indexOf(a[i],j+1)) !=-1;)
		
{ 
res.add(j);
		
}
		
}
	
Collections.sort(res);

for(Integer k:res)
System.out.print(k+" ");

}

}