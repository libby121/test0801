package strings;

public class Strings {
	
	
	public static void main(String[] args) {
		
		String name= "daniella";
		String name3="daviella";
		String name2="";
		System.out.println(name.charAt(name.length()-1));//last one
		System.out.println(name.indexOf('l'));
		System.out.println(name.lastIndexOf('l'));
		System.out.println(name.contains("d"));//does it contain a string,boolean
		System.out.println(name.startsWith("r"));//boolean
		System.out.println(name.substring(2));
		System.out.println(name.substring(0,2));
		System.out.println(name.replace("dan","dav"));
		System.out.println(name.compareToIgnoreCase(name3));//dictionary order
		
		String sentance="good morning libby";
		String words[]=sentance.split(" " );
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			StringBuilder builder= new StringBuilder();
			
		String day="monday";
			for (int j =day.length()-1;j>=0; j--) {
				//for (int j2 = 0; j2 < name3.length(); j2++) {
					//String name3+=name.charAt(j);
					builder.append(day.charAt(j));//how can i do it with reg string
					name2+=day.charAt(j);
				}
				
			System.out.println(builder);
			System.out.println(name2);
		}}
	
	}


