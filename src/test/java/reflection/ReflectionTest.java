package reflection;

import notefive.oop.Animal;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {


	// get class name

	// 18~25ms
	@Test
	public void reflectionTest_getClassName() throws ClassNotFoundException {
		// instance을 생성하지 않고 Metaspace 영역의 Type 정보를 가져온다.

		long l = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			String name = Class.forName("notefive.oop.Animal").getSimpleName();
			System.out.println(name);
		}
		long t = System.currentTimeMillis();
		System.out.println(t - l);
	}

	// 17~22ms
	@Test
	public void reflectionTest_getName() {
		// 생성된 instance를 기반 즉 Heap 영역의 Type 정보를 가져온다.

		long l = System.currentTimeMillis();
		Animal animal = new Animal();
		for (int i = 0; i < 1000; i++) {
			String name = animal.getClass().getSimpleName();
			System.out.println(name);
		}
		long t = System.currentTimeMillis();
		System.out.println(t - l);
	}



	// method invoke

	// 34~46ms
	@Test
	public void reflectionTest_getClassAndGetMethod() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
		
		long l = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			Object o = Class.forName("notefive.oop.Animal").newInstance();
			Method getName = Class.forName("notefive.oop.Animal").getMethod("getName");
			String res = (String) getName.invoke(o);
		}
		long t = System.currentTimeMillis();
		System.out.println(t - l);
	}

	//27~32ms
	@Test
	public void reflectionTest_getMethod() {

		long l = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			String res = new Animal().getName();
		}
		long t = System.currentTimeMillis();
		System.out.println(t - l);
	}
}