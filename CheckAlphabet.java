public class CheckAlphabet
{
     public static void main(String []args)
     {  
		char ch=1;
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
             System.out.print(ch+" is an Alphabet ");
        }
        else
        {
             System.out.print(ch+" is not an Alphabet ");
        }
     }   
}