class GenQueueDemo {
	public static void main (String[] args) {
		//Создаём очередь из integer
		Integer[] iArray = new Integer[4];
		GenQueue<Integer> q = new GenQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("Оерации с очередью из integer");
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Добавляем " + i + " элемент в очередь q");
				q.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Извлечение элемента Integer из q: ");
				iVal = q.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
		
		//Создаем очередь из стринг
		String[] sArray = new String[10];
		GenQueue<String> q1 = new GenQueue<String> (sArray);
		String sVal;
		System.out.println("Операции с очередью из стринг");
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Добавлям строку " + i + " в очередь q1");
				q1.put("Строка " + i);
			}
		}
		catch(QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i=0; i<5; i++) {
				System.out.println("Извлечение строки из q1: ");
				sVal = q1.get();
				System.out.println(sVal);;
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		//Создаём кольцевую очеедь из интегер
		Integer[] iArray1 = new Integer[4];
		GenCircQueue<Integer> q = new GenCircQueue<Integer>(iArray1);
		System.out.println("Операции с кольцевой очередью из интегер");
		try {
			for(int i=0; i < 4; i++) {
				System.out.println("Извлечение элемента интегер из q2: ");
				iVal = q2.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
	
	}
}
