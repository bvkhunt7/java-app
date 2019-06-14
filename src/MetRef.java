


interface parser
{
	String parse(String str);
}

class StringParser
{
   public static String convert(String s)
   {
        if(s.length() < 3)
        	  s=s.toUpperCase();
        else
        	 s=s.toLowerCase();
        return s;
   }
}
class MyPrinter
{
   public void print(String str,parser p)
   {    
	   str = p.parse(str);
	   System.out.println(str);
	  
   }


}

public class MetRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "khunt bhautik "; 
		
		MyPrinter mp = new MyPrinter();
		mp.print(str,new parser()
		{
			public String parse(String s)
			{
			   return	StringParser.convert(s);
			}
		});
		
	}

}
