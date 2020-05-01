package Test;

public class PyramidExample {  
	
public static void main(String[] args) {  
	int  k=0,flag=1;
for(int i=1;i<=5;i++){  
	flag=1;
for(int j=1;j<=i;j++){  
	
	if (flag==1)
	{
		if(i==1)
			 k=5;
		else if(i==2) k=4;
		else if(i==3) k=3;
		else if(i==4) k=2;
		else  k=1;
	}
	/*else if (i==2)
		k=5;
	if (i==1)
		k=5;
	if (i==1)
		k=5;*/
		
	do {
		System.out.print(" ");
		k=k-1;
	}
	while (k>0);
        System.out.print("* "); 
        flag=0;
}  
System.out.println();//new line  
}  
}  
}  