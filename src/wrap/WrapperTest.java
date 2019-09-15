package wrap;

public class WrapperTest {

	public static void main(String[] args) {
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		System.out.println("one == two 的结果：" + (one == two));//1
		Integer three = 100;//自动装箱
		//Integer three = Integer.valueOf(100);
		System.out.println("three == 100 的结果：" + (three == 100));//2 自动拆箱
		//Integer four = 100;
		Integer four = Integer.valueOf(100);
		System.out.println("three == four 的结果：" + (three == four));//3
		//↑指向缓存区同一空间
		Integer five = 200;
		System.out.println("five == 200 的结果：" + (five == 200));
		Integer six = 200;
		System.out.println("five == six 的结果：" + (five == six));
		//↑-128~127以外的数值实例化Integer，不指向同一空间
		Double d1 = Double.valueOf(100);
		System.out.println("d1 == 100的结果：" + (d1 == 100));
		Double d2 = Double.valueOf(100);
		System.out.println("d1 == d2的结果：" + (d1 == d2));
		//Double和Float不具备对象常量池 
	}
}
