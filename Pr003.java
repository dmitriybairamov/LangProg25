class ExcTest {
	//генерация исключительной ситуации
	static void genException() {
		int nums[] = new int[4];
		System.out.println("До исключительной ситуации");
		nums [8] = 10;
		System.out.println("Строка после исключительной ситации внутри блока");		
	}
}

class Pr003 {
	public static void main(String args[]) {
		int nums[] = new int[4];
		//блок, вкотором может возникнуть исключительная ситуация
		int number [] = {4, 8, 16, 32, 64, 128};
		int denom[] = {2, 0, 4, 4, 0, 8};
		for (int i=0; i<number.length; i++) {
			try {
				/* генерация исключительной ситуации внутри метода мейд
				System.out.println("Do iskluchitelnoi situaion");
				num[8] = 10;
				System.out.println("Строка после исклюительной ситуации внутри блока трай");
				*/
				//Генерация исключительной ситуации при вызове статич метод genException()
				System.out.println(number[i] + " / " + denom[i] + " равно " + number[i]/denom[i]);
				//ExcTest.genException();
			}

		//exc - переменная, содержащая ссылку на объект исключения
		//AIOOBE - класс исключительной ситуации
		//catch - блок перехвата исключения
		
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("Исключительная ситуация: выход за границы");
			}
		
		//Обработка событий класс ArithmeticException
			catch(ArithmeticException exc2) {
				System.out.println("Исключительная ситуация: неверная арифметическая операция");
			}
			System.out.println("После оператора catch");
		}

	}
}

