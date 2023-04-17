
public class BasicsOfJava {
	
	public static void main (String s[]) {
	
	Long var1 = Long.valueOf(123);
	Long var2 = Long.valueOf("123");
	System.out.println(var1 == var2);
	
	/*
	 * Wrapper classes Byte, Short, Integer, and Long cache objects with values in
	 * the range of -128 to 127.
	 */
	
	Long var3 = Long.valueOf(223);
	Long var4 = Long.valueOf("223");
	System.out.println(var3 == var4);
	
	
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	Integer i3 = Integer.valueOf("10");
	Integer i4 = Integer.valueOf(10);
	Integer i5 = 10;
	Integer i6 = 10;
	
	System.out.println(i1 == i2);
	System.out.println(i3 == i4);
	System.out.println(i4 == i5);
	System.out.println(i5 == i6);
	
	}
}
