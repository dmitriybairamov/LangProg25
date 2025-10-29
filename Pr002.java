// Обобщённые типы огранаичивания только теми классами, которые расширяют класс Number 
class NumFns<T extends Number> {
	T num;
	NumFns(T n) {
		num = n;
	}
	//получение обратной величины num
	double inverse () {
		return 1/num.doubleValue();
	}
	//
	int whole() {
		return num.intValue();
	}
	//
	double dr() {
		return num.doubleValue() - num.intValue();
	}
	//Использование шаблонов аргументов
	boolean absEqual (NumFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}

}
	// При помощи конструкции T, V extends T можно выполнять проверку совместимости типов при создании новых объектов
	class A <T, V extends T> {
		T first;
		V second;
		
		A( T a, V b) {
			first = a;
			second = b;
		}
	}
//Использование ограниченных шаблонов
class B{
	//Родительский класс для B_A B_B B_C
}
class B_A extends B {
}
class B_B extends B {
}
class B_C extends B {
}
class BA {
	//Самостоятельный класс, не имеющий роджств связей с В
}

class Gen1<T> {
	T ob;

	Gen1(T o) {
		ob = o;
	}
}
class Test {
	//Передаваемый обобщенный параметр типа ограничивается классом В и его потомками
	static void test(Gen1<? extends B> o) {
	}
	//Передаваемый обобщённый параметр типа ограничивается классом В_А и его родителями
	static void test2(Gen1<? super B_A> o) {
	}
}
class GenMeth {
	// метод определяющий совпадаюет ли содержимое двух массивов
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x , V[] y) {
		//сравнение длины массивов
		if(x.length != y.length)
			return false;
		for(int i=0; i < x.length; i++)
			if(!x[i].equals(y[i]))
				return false;
		return true;
	}
}

class Pr002 {
	public static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("Обратная величина iOb -" +iOb.inverse());
		
		System.out.println("Целая часть iOb - " + iOb.whole());

		System.out.println("Дробная часть iOb - " + iOb.dr());

		NumFns<Double> dOb = new NumFns<Double>(10.14);

		System.out.println("Обратная величина dOb - " + dOb.inverse());

		System.out.println("Целая часть dOb - " + dOb.whole());

		System.out.println("Дробная часть dOb - " + dOb.dr());
	
		A<Integer, Integer> x = new A<Integer, Integer>(1,2);
		A<Number, Integer> y = new A<Number, Integer>(1.1,2);
		//A<Number, String> z = new A<Number, String>(1.1, "2");
		//Типы Number и String несовместимы, поэтому строка не пройдёт компиляцию
		
		//Демонстрация вызова метода absEqual() с использованием шаблонов аргументов<?>
		NumFns<Integer> intOb = new NumFns<Integer>(6);
		NumFns<Double> doubleOb = new NumFns<Double>(-6.0);
		NumFns<Long> longOb = new NumFns<Long>(5L);

		System.out.println();
		System.out.println("Сравненеи абсолютных значений intOb и doubleOb");
		if(intOb.absEqual(doubleOb))
			System.out.println("Абсолютные значения величин совпадают");
		else
			System.out.println("Абсолютные значения величин не совпадают");
		System.out.println("Сравнение абсолютных значений intOb и longOb");
		if(intOb.absEqual(longOb))
			System.out.println("Абсолютные значения величин совпадают");
		else
			System.out.println("Абсолютные значения величин не совпадают");

		//Демонстрация использования ограниченных шаблонов
		B bb1 = new B();
		B_A b2 = new B_A();
		B_B b3 = new B_B();
		B_C b4 = new B_C();
		BA ba1 = new BA();
		Gen1<B> w1 = new Gen1<B>(bb1);
		Gen1<B_A> v2 = new Gen1<B_A>(b2);
		Gen1<B_B> v3 = new Gen1<B_B>(b3);
		Gen1<B_C> v4 = new Gen1<B_C>(b4);
		Gen1<BA> v5 = new Gen1<BA>(ba1);

		//Тип параметра при Вызове статического метода test() ограничивается шаблоном
		Test.test(w1);
		Test.test(v2);
		Test.test(v3);
		Test.test(v4);
		//Test.test(v5); - не скомпилируется в связи с тем, что в5 имеет тип не являющийся родственным классу б
		
		//демонстрация использования обобщенного метод arraysEqual(), определенного в классе GenMeth
		Integer nums[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1,2,3,4,5};
		Integer nums3[] = {1,2,7,4,5};
		Integer nums4[] = {1,2,7,4,5,6};

		System.out.println("\n Вызов обобщенного метода для сравнения массивов");
		if(GenMeth.arraysEqual(nums, nums))
			System.out.println("Массивы nums совпадает сам с собой");
		if(GenMeth.arraysEqual(nums, nums2))
			System.out.println("Массив намс совпадает с нам2");
		if(GenMeth.arraysEqual(nums, nums3))
			System.out.println("Массив намс совпадает с намс3");
		if(GenMeth.arraysEqual(nums, nums4))
			System.out.println("Массив намс совпадает с намс 4");

	}
}
