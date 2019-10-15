package edu.cgcc.cs160;

public class BinaryCount {
	public static String convert(int i) {
		String x = "";
		
		if(i == 0) {
			return "0\n0";
		}
		
		while(i > 0) {
			int a = i % 2;
			x = a + "" + x;
			i = i / 2;
		}
		return format(x);
	}
	
	private static String format(String s) {
		char[] cArray = s.toCharArray();
		String sTop = "";
		String sBottom = "";
		
		for(int i = 0; i < cArray.length; i++) {
			sTop = sTop + "\t" + cArray[i];
		}
		
		for(int i = cArray.length - 1; i >= 0; i--) {
			sBottom = sBottom + "\t" + (int)Math.pow(2, i);
		}
		
		return sTop.trim() + "\n" + sBottom.trim();
	}
}
