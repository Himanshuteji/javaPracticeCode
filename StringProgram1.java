package out.production;

public class StringProgram1 {
	public static void printWord(String s) {
		// Split string into words 
		String[] w=s.split("");
		
		// Create an array to store the
        // length of each word
		int [] leg=new int[w.length];
		
		 // Calculate the length of each
        // word and store in the array
		for (int i=0;i<w.length;i++) {
			leg[i]=w[i].length();
		System.out.println(i+" "+w[i]);
		}
		
		 for (int i = 0; i < w.length; i++) {
	            if (leg[i] % 2 == 0) {
	                System.out.println(w[i]);
	            }
	        }
		
	}
	

	public static void main(String[] args) {
	String s= "i am Geeks for Geeks and a Geek";
	printWord(s);
	}

}
