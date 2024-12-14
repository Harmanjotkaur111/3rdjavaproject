package string;

public class lastindex {
	public static void main(String[] args) {
		 
		String text = "Java is a CAse SEnsitIVE LANGuAGe";
		int lastIndex = text.lastIndexOf("CAse");
		System.out.println("Last occurrence of 'CAse': " + lastIndex);
}
}