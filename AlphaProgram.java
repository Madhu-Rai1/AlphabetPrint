public class AlphaProgram 
{
   
    public static void main(String[] args) 
    {
        int i,j,k;
    
         char ch='A';
        for(i=1;i<6;i++)
	{
	    for(j=6;j>i;j--)
	     {
		System.out.print("  ");
	     }
	    for(k=1;k<=i;k++)
	     {
		System.out.print(ch + " ");
                ch++;
	     }
	  System.out.println();
        }
    }
}