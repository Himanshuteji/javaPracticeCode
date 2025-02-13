package out.production;

public class StringProgram2 {

	static void insertString(String str, String addStr, int index) {
		
		String str1=new String();
		
		for(int i=0;i<str.length();i++) {
			str1 =str1 + str.charAt(i);
			
			if(i==index) {
				str1 +=addStr;	
			}
		}
		System.out.print(str1);
		
	
		
	}
	public static void main(String[] args) {
		String str="taniya  Teji";
		String addStr="Himanshu";
		int index=6;
		insertString(str,addStr,index);
	}

}
