class Apattern41
{
public static void main(String [] args)
{
for(int i=1;i<=6;i++)
{
for(int j=6;j>=i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
if(i==6 || k==1 || k==i)
System.out.print("* ");
else
System.out.print("  ");	
}
System.out.println();
}
}
}