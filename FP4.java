import java.util.List;
import java.util.ArrayList;
class TCalc {
    private List<String> names = new ArrayList<>();
    private int tPercentage = 0;

    public List<String> addPerson(List<String> names, String name) {
	    List<String> updated = new ArrayList<>(names);
	    updated.add(name);
	    return updated;
    }
   /* 
    public int getDiscountPercentage(List<String> items1) {
	    if(items1.contains("Книга")) 
		    return 5;
	    else 
		    return 0;
    }
    */

    public List<String> getNames() {
        return names;
    }

    public int getTPercentage(List<String> names) {
	if(names.size() > 5) {
		return 20;
	}
	else if (names.size() > 0) {
		return 10;
	}
    	return 0;
    }	    
}
class FP4 {
	public static void main(String[] args) {
		TCalc list1 = new TCalc();
		List<String> l1 = new ArrayList<>();
		l1 = list1.addPerson(l1, "Ринат");
		System.out.println("Размер чаевых для l1: " + list1.getTPercentage(l1));
		List<String> l2 = new ArrayList<>();
		for (int i=0; i<10; i++)
			l2 = list1.addPerson(l1, "Юрий");
		System.out.println("Размер чаевых для l1: " + list1.getTPercentage(l2));
		//Тестирование чистой функции gePercentage() для 3 вариантов
		//Пустой список:
		List<String> l3 = new ArrayList<>();

		if (list1.getTPercentage(l3) == 0)
			System.out.println("Работает правильно");
		else
			System.out.println("Ошибка");
		
		//Список от 1 о 5 чел
		if (list1.getTPercentage(l1) == 0)
			System.out.println("Работает правильно");
		else
			System.out.println("Ошибка");

		//Список больше 5 чел
		System.out.println("\nПроверка списка l2");
		if (list1.getTPercentage(l2) == 20)
			System.out.println("Работает правильн");
		else
			System.out.println("Ошибка");
	}
}
