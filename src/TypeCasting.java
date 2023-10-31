
public class TypeCasting {

	public static void main(String[] args) {
		
		// Byte to Int converison
		// implicit conversion 
		byte b1=10;
		int i=b1;
		System.out.println(i);
		
		//float to double conversion
		float f1=89.9f;
		double d1=f1;
		System.out.println(d1);
		
		//char to int conversion
		
		char ch='I';
		int	v=ch;
		System.out.println(v);
		
	
		// Explicit conversion 
		float val2=9087.89f;
		int i2=(int)val2;
		System.out.println(i2);
		
		// while explicitly converting use same datatype in braces in which intended to convert 
		double d2=876543.897;
		long l1 =(long)d2;
		System.out.println(l1);
		
		
	}

}
