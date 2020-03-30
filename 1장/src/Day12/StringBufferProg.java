package Day12;

public class StringBufferProg {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java Programming");
		StringBuffer str2;
		
		str2 = str.insert(5, "JSP "); //5번째에 끼워넣음
		System.out.println(str);
		System.out.println(str2);
		
		str.append(" Good ");
		str.append('A');
		System.out.println(str);
		
		str2.reverse();
		System.out.println(str2);	//뒤집음 뒤집음
		
		str.setLength(10);
		System.out.println(str); //10글자만 가지고 오게함 (위에 같은주소) 
	}
}
