
public class Demo1 {
	public static void main1(String[] args){
		System.out.println("hello world!");//字符串常量
		System.out.println(100);           //整形常量
		System.out.println(3.14);          //浮点数据常量
		System.out.println('A');           //字符类型常量
		System.out.println(true);          //布尔类型常量
		System.out.println(false);
	}
	public static void main2(String[] args){
		int a=10;
		double d=3.14;
		char c='A';
		boolean b=true;
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		a=100;
		System.out.println(a);
		//注意：在一行可以定义多个相同类型的变量
		int a1=10,a2=20,a3=30;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
	//整型变量
	public static void main3(String[] args){
		//1.在定义时给出初始值
		int a=10;
		System.out.println(a);
		//2.在定义时没有给初始值，但使用前必须设置初值
		int b;
		b=10;
		System.out.println(b);
		//3.使用方式二定义后，在使用前如果没有赋值，则编译期间会报错
		//int c;
		//System.out.println(c);
		//c=100;
		//int型变量所能表示的范围：
		//System.out.println(Integer.Min_VALUE);
		//System.out.println(Integer.MAX_VALUE);
		//注意：在定义int型变量时，所赋值不能超过int的范围
		//int d=12345678901234;//编译时报错，初值超过了int的范围
	}
	//长整型变量
	public static void main(String[] args){
		int a=10;
		long b=10;//long定义的长整型变量
		long c=10L;//为了区分int和long类型，一般建议：long类型变量的初始化之后加L或者l。
		long d=10l;//一般更多写L，因为l和1不好区分。
		//long型变量所能表示的范围：这个数据范围远超过int的表示范围，足够绝大部分的工程场景使用
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		short e=10;
		System.out.println(e);
		//short型变量所能表示的范围：
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		byte f=10;
		System.out.println(f);
		//byte型变量所能表示的范围
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}	
}