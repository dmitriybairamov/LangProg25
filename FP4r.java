import java.util.List;
import java.util.ArrayList;
class TCalc {
	private List<string> items = new ArrayList<>();
	private int tPercentage = 0;

	public List<String> addPerson (List<String> names, String name) {
		List<String> updated = new ArrayList<>(names);
	updated.add(name);
	return updated;
	}

	public List<String> getNames(0 {
		return new ArrayList<>(names);
	}
	public int getPercentage() {
		return tPercentage;
	}

	public int getPercentage(List<String> names) {
		if(names.size() > 5) {
		return 20;
	}

	else if (names.size() > 0) {
		return 10;
	}

	return 0;
	}
}
class FP4r {
	public satic void ain (String[] args) {
		Tcalc list1 = new TCalc();
		List<string> 11 = new ArrayList<>();
		l1 = list1.addPerson(l1, name: "Ренат");
		System.out.println("Размер чаевых для l1: " + list1.getTPercentage(l1));
		List <String> l2 = l1;
		l2 = l1 = list1.addPerson(l2, name: "Юрий");
	}
}


