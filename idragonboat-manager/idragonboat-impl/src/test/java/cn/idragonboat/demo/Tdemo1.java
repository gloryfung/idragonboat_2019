package cn.idragonboat.demo;

import org.junit.Test;

public class Tdemo1 {
	
	public void excute(MyLambdaInterface m, String s) {
		m.doSomething(s);
	}
	
	@Test
	public void test_01() {
		MyLambdaInterface m = new MyLambdaInterfaceImp();
		String aa = "aa";
		excute(m, aa);
	}
	
	@Test
	public void test_02() {
		excute(s -> System.out.println(s),  "bb");
	}
}


interface MyLambdaInterface {
	void doSomething(String s);
}


class MyLambdaInterfaceImp implements MyLambdaInterface  {
	
	
	@Override
	public void doSomething(String s) {
		System.out.println("打印结果：" + s);
	}

	
}

