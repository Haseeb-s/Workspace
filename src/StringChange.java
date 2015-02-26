
public class StringChange {

	public static void main(String[] args) {
		String sample = "This is a sample";
		String sample2 = "This is a second sample";
		System.out.println("The Sample Message is " + sample);
		System.out.println("The CharAt index 3 is" + sample.charAt(3) );
		System.out.println(sample.compareTo(sample2));
		System.out.println(sample.concat(sample2));
		System.out.println(sample.equals(sample2));
		System.out.println(sample.equalsIgnoreCase(sample));
		System.out.println(sample.indexOf("a"));
		System.out.println(sample.lastIndexOf("ample"));
		System.out.println(sample.length());
		System.out.println(sample.toLowerCase());
		System.out.println(sample.toUpperCase());
		System.out.println(sample.replace("I", "X"));
		System.out.println(sample.substring(9));
		System.out.println(sample.substring(0,6));
		
		System.out.println(sample.trim());
	}

}
