public class QueueFullException extends Exception {
	int size;
	QueueFullException(int s) {
		size = s;
	}
	public String toString() {
		return "\nОчередь переполнена. Максимальный размер: " + size + " элементов.";
	}
}
