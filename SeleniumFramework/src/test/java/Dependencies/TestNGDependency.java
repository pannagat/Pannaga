package Dependencies;

import org.testng.annotations.Test;

public class TestNGDependency {
	
	@Test(dependsOnMethods="test2")
	public void test1()
	{
		System.out.println("Iam inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Iam inside Test2");
	}

}
