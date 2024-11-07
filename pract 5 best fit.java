
import java.io.*;
import java.util;

class PrepInsta
{
 	public static void main(String args[])throws IOException
 	{
 		//initialization and declaration of variables
 		int flag[]=new int[10];
 		int m_segments[]=new int[10];
 		int i,sr,memory;
 		int sp, loc=0;
 		int cntrl=1000;
 		DataInputStream in=new DataInputStream(System.in);
 		
 		// input memory segments

 		System.out.println(“Enter the no of memory segments\n”);
 		memory=Integer.parseInt(in.readLine());
 		
//input size of memory segments
//Scanning memory segments for best fit allocation
 		System.out.println(“Enter the size of memory segments\n”);
 		for(i=0;i<memory;i++)

 		sm[i]=Integer.parseInt(in.readLine());
 		for(i=0;i<memory;i++)
 		flag[i]=0;
 		
 		System.out.println(“Before best fit allocation\n”);
 		

System.out.println(“\nIndex\t\tMemory Segments\n”);

 		for(i=0;i<memory;i++)

 		System.out.println((i+1)+”\t\t”+m_segments[i]);

 		
 		//Input space for the process for memory allocation
 		System.out.println(“\nEnter the space requirement for new process\n”);
 		sr=Integer.parseInt(in.readLine());

 		//searching memory for best fit allocation
for(i=0;i<memory;i++)
 		{
 			if(flag[i]==0)
 			{
 			 	sp=m_segments[i];

 				if(sr<=sp) { if(cntrl>sp)
 					{
 						cntrl=sp;
 						loc=i;
 					}
 				}
 		 	}
 		}
  		if(cntrl==0)

 
		System.out.println(“\n Space not available”);
 		else
 		{
 			m_segments[loc]=sr;
 			flag[loc]=1;
 		}
 		// Best fit memory allocation
 	System.out.println(“\nAfter Bestfit Allocation\n”);

 		System.out.println(“Index \t\t Memory Segment\n”);
 		for(i=0;i<memory;i++)
 		{
 			System.out.println((i+1)+”\t\t”+m_segments[i]);
 		}
 		System.out.println(“\n The process allocated to the memory segments “+(loc+1));
 	}
}
 

O