import java.io.*;
class pass1
{
	public static void main (String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i;
		String a[][]={
		{"","START","101",""},
		{"","MOVER","BREG","=1"},
		
		{"N","DS","2",""},
		{"RESULT","DS","2",""},
		{"ONE","DC","1",""},
		{"END","","",""},
		};
int lc=Integer.parseInt(a[0][2]);
String st[][]=new String[3][2];
String lt[][]=new String[3][2];
int stcnt=0,ltcnt=0,l;
for(i=1;i<11;i++)
{
	if (a[i][0]!="")
		{
			st[stcnt][0]=a[i][0];
			st[stcnt][1]=Integer.toString(lc);
			stcnt++;
	if(a[i][1]=="DS")
	{l=Integer.parseInt(a[i][2]);
	lc=lc+l;
	}
	else{
	lc++;
	}
}
	else{
	lc++;
	}
if(a[i][3].startsWith("="))
{lt[ltcnt][0]=a[i][3];
lt[ltcnt][1]=Integer.toString(lc);
ltcnt++;} 
}
System.out.println("SYMBOL\t\tVALUE\n");
for(i=0;i<stcnt;i++)
{
System.out.println(st[i][0]+"\t\t"+st[i][1]);

}
System.out.println("literal\t\tVALUE\n");
for(i=0;i<ltcnt;i++)
{
System.out.println(lt[i][0]+"\t\t"+lt[i][1]);
}
}
}





