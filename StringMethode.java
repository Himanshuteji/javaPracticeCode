package out.production;

public class StringMethode {

	public static void main(String[] args) {
		//concatenate
		String name="Aman";
		String name1="akku";
		String name2=name+" and "+name1;
		System.out.println(name2);
		
		//charAt()
		String name3="Aman";
		System.out.println("index 0 = "+name3.charAt(0));
		System.out.println("index 0 = "+name3.charAt(1));
		System.out.println("index 0 = "+name3.charAt(2));
		System.out.println("index 0 = "+name3.charAt(3));
		
		//length();
		System.out.println("lenght of the String = "+name.length());
		
		//Replace();
		String name4="Himanshu";
		System.out.println(name4 +", "+"H replace with ="+name4.replace('H','F'));
		
		//substring() String ka koi part index ki help se return kr skte hai
		String name5="don't forgot the fall in love it your self";
		System.out.println(name5.substring(0,10));
		
		// codePointAt()  method returns the Unicode value of the character at the specified index in a string.
		//character ka unicode bataeaga
		String name6="don't forgot love it your self";
		try {
		for(int i=0;i<=name6.length();i++) {
		int result=name6.codePointAt(i);
		System.out.println("index="+i+" "+result);
		}
		}
		 catch (StringIndexOutOfBoundsException e) {
			 System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds.");
		 }
		
		//codePointBefore jo index apn denge uske phle wale letter ka unicode bataega
		String name7="Mahaveer";
		int result=name7.codePointBefore(1);
		System.out.println(result);
		
		//codePointCount(); jo ki print kare gi Unicode values found in a string
		String name8="Hello ";
	int result1=name.codePointCount(0,4);
	System.out.println(result1);
	
	//compareTo do string ko compare kare ga barbar hai ya nhi unicode ki help se
	String name9="om";
	String name10="omi";
	System.out.println(name9.compareTo(name10));
	
	//compareToIgnoreCase  upper case , lower case ko ek saman man kae result dega
	String myStr1 = "HELLt";
	String myStr2 = "hello";
	System.out.println(myStr1.compareToIgnoreCase(myStr2));
	
	//equals    boolean  type , return true or flase
	String name11="Hello";
	String name12="Hello";
	String name13="joker";
	System.out.println(name11.equals(name12));
	System.out.println(name12.equals(name13));
	
	//copyValueOf();
	
	char[] mystr= {'h','e','l','l','o'};
	String mystr1="";
	mystr1=mystr1.copyValueOf(mystr,0,5);
	System.out.println(mystr1);
	
	
	//endWith()
	String myStr = "Hello";
	System.out.println(myStr.endsWith("Hel"));   // false
	System.out.println(myStr.endsWith("llo"));   // true
	System.out.println(myStr.endsWith("o"));     // true
	
	//equalsIgnoreCase();
	String myStr4 = "Hello";
	String myStr5 = "HELLO";
	String myStr6 = "Another String";
	System.out.println(myStr4.equalsIgnoreCase(myStr5)); // true
	System.out.println(myStr5.equalsIgnoreCase(myStr6)); // false
	
	//hashCode(); s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	String name14="Hello";
	System.out.println(name14.hashCode());
	
	//indexOf
	String name16="don't forgot love it your i self";
	System.out.println(name16.indexOf("love"));
	System.out.println(name16.indexOf("i",6));	//6 is staring index for searching next i
	
	//isEmpty()
	String name17="Hello";
	String name18="";
	System.out.println(name17.isEmpty());
	System.out.println(name18.isEmpty());
	
	//toString(); return itself
	String name19="Hello";
	System.out.println(name19.toString());
	
	
	//toUpperCase,toLowerCase
	String name20="Hello Taniya ";
	System.out.println(name20.toUpperCase());
	System.out.println(name20.toLowerCase());
	
	//trim() space ko trim kare ga aage piche se
	String name21="       hello    ";
	System.out.println(name21);
	System.out.println(name21.trim());
	
	
	
	}

}
