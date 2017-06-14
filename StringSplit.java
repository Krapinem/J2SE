import java.util.StringTokenizer;

public class StringSplit 
{
	public static void main(String args[])
	{
		/*
		String s1 = "a a s asds as asa sas as ds as d adadasd";
		//String all[] = s1.split(""); //2147483647
		
		//TokenMethode
		StringTokenizer st = new StringTokenizer(s1," ");
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(token);
			
		}
		*/
		
		//Program
		{
			String s1 = "you are engineer";
			String s2 = "are you engeneer";
			
			StringTokenizer st1 = new StringTokenizer(s1," ");
			StringTokenizer st2 = new StringTokenizer(s2," ");
			String sa[] = new String[s1.split(" ").length];
			String sb[] = new String[s2.split(" ").length];
			int i=0,count=0;
			if(sa.length==sb.length)
			{
				while(st1.hasMoreTokens())
				{
					sa[i] = st1.nextToken();
					sb[i] = st2.nextToken();
					i++;
				}
				for(int j=0;j<sa.length;j++)
				{
					for(int k=0;k<sb.length;k++)
					{
						if(sa[j].compareTo(sb[k])==0)
						{
							count++;
						}
					}
				}
				if(count==sa.length)
				{
					System.out.println("Anagram String");
				}
				else
				{
					System.out.println("Not Anagram String");
				}
			}
			else
			{
				System.out.println("Not Anagram String");
			}
			
			
		}		
	}

}
