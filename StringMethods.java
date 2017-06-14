
public class StringMethod 
{
   public static void main(String[] args) {
	
/*	   String s1 = "Krapinem";
	   //6  toCharArray() : public char[] toCharArray()
	   
	   char all[]   =  s1.toCharArray();
	   for(int i=0;i<all.length;i++)
	   {
		   System.out.print(all[i]+" ");
	   }
	   for(char ch  :  all)
	   {
		   System.out.println(ch);
	   }
	   int count=0;
	   for(int i=0;i<all.length;i++)
	   {
		   	if(all[i]=='O')
		   	{
		   		count++;
		   		System.out.println(all[i]+" : "+i);
		   	}
	   }
	   System.out.println("Count  : "+count);
	   
	  String e1 = "praveencsindia@gmail.com";
	  if(e1.indexOf("@")==e1.lastIndexOf("@"))
	  {
		  System.out.println("@ present one time");
	  }
	  else
	  {
		  System.out.println("@ present more than one time");
	  }
	  
	  //split :  public String[] split(String delimiter)
	  
	  String email = "pc@gmail.com:java@core.com:javaJ2SE@gmail.com";
	  
	  String allemail [] =   email.split(":");
	  for(String a :  allemail)
	  {
		  System.out.println(a);
	  }
	  */
	  
	  /*String s1 = "ANKIT";
	  String s2  = "ANKITA";
	  //concat :  public String concat(String s)
	  
	  String s3  =   s1.concat(s2);
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s3);
	  */
	  
	   /*String s1 = "ANKIT JAIN";
	   System.out.println(s1);
	   s1 =   s1.replace("A", "P");
	 
	   System.out.println(s1);
	   */
	   
	 /* String s1 = "ABCD";
	  String s2= "ZBCD";
	  char all[] = s2.toCharArray();
	  for(int i=0;i<all.length;i++)
	  {
		  System.out.println(all[i]+":" +s2.codePointAt(i));
	  }
	  
	  if(s1.compareTo(s2)==0)
	  {
		  System.out.println("s1 eql s2");
	  }
	  else if(s1.compareTo(s1)>0)
	  {
		  System.out.println("s1 is big");
	  }
	  else 
	  {
		  System.out.println("s2 is big");
	  }
	   
	 String s1 ="YOGESH";  
	 String s2 ="yogesh";
	 System.out.println(s1.equals(s2));
	 System.out.println(s1.equalsIgnoreCase(s2));
	 
	 String all[]= {"Amit","Anu","Ana","Anoop","Ankit","Sumit","Jay"};
	 int count=0;
	 for(int i=0;i<all.length;i++)
	 {
		 if(all[i].startsWith("An"))
		 {
			 count++;
		 }
	 }
	 System.out.println("Count :"+count);
	 //endsWith
	 
	 s1.toLowerCase();
	 s1.toUpperCase();
	 //hashCode();
	 System.out.println(s1.hashCode());
	  
	 */
	  
	   String s1 = " java  java java    java   ";
	   //trim()
	  String s2  = s1.trim();
	   System.out.println(s1.length());
	   System.out.println(s2.length());
	   byte all []  =s1.getBytes();
	   for(byte a : all)
	   {
		   System.out.println(a);
	   }
	   
	   
}
}
