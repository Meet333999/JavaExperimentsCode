public class commandLineArguments {
   public static void main(String args[]) 
{
    for(String str : args)
     {
      int arguments=Integer.parseInt(str);
      System.out.println(arguments);       
      }
   }
}
