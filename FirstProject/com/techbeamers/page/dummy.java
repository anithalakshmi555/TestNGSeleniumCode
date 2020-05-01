package com.techbeamers.page;

public class dummy {

	public static	void main(String args[])
	{
		int[] a= {1,6,5,7,-1};
		int[] tr= {0,0,0,0};
	
		
		int sum=6,t=0,i,k=0,j=0;
		for (i=0;i<a.length;i++)
		{
			for (j=i+1;j<a.length;j++) {
			if (a[i]+a[j]==sum)
			{
				tr[k]=a[i];
				k=k+1;
				tr[k]=a[j];
				k=k+1;
			}}}
		
		for (i=0;i<tr.length;i++)
		{
			System.out.println(tr[i]);
		}
		
	}
	

}
