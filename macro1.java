import java.io.*;
import java.util.*;
class macro1
{
 public static void main(String args[]) 
 {
  Scanner src=new Scanner(System.in);
  String mn[]=new String[50];
  String md[]=new String[50];
  int mdti[]=new int[50];
  String ala[]=new String[50];
  int c=0,a=0;
  System.out.println("**************INPUT***************");
  System.out.println("Enter the name of file with format");
  String f=src.next();
  try
  {
        FileReader fr=new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String x;
  while((x=br.readLine())!=null)
  { 
   if(x.equals("MACRO"))
   {
    x=br.readLine();
    int i = x.indexOf(" ");
    mn[c]=x.substring(0,i);
    mdti[c]=c+1;    
    ala[a++]=x.substring(i+1,x.length());
    md[c]="";
    while(!x.equals("MEND"))
    { 
     md[c]=md[c]+x+'\n'+"\t";
     x=br.readLine();
    }
    md[c]+="MEND\n";
    c++;   
   }
  }
  
 }
 catch(Exception e){ System.out.println(e);}
 System.out.println("\n");
 System.out.println("**************OUTPUT**************");
 System.out.println("----------------------------------");
 System.out.print("1.");
 System.out.println("MNT");
 System.out.println("----------------------------------");
 System.out.println("Index\tMacroname\tMDT index");
 for(int j=0;j<c;j++)
 {
  System.out.println((j+1)+"\t"+mn[j]+"\t\t"+mdti[j]);
 }
 System.out.println();
 System.out.println("----------------------------------");
 System.out.print("2.");
 System.out.println("MDT");
 System.out.println("----------------------------------");
 System.out.println("Index\tMacrodefinition");
 for(int j=0;j<c;j++)
 {
  System.out.print((j+1)+"\t"+md[j]);
 }
 System.out.println();
 System.out.println("----------------------------------");
 System.out.print("3.");
 System.out.println("ALA with formal parameters");
 System.out.println("----------------------------------");
 System.out.println("Index\tArguments");
 for(int j=0;j<a;j++)
 {
  System.out.println((j+1)+"\t"+ala[j]);
 }
 System.out.println();
}
}
