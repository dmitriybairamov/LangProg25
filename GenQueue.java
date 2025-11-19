//Обобщённый класс фиксированной очереди
class GenQueue<T> implements IGenQ<T> {
	private int putloc, getloc; //указатели на начало и на конец очереди
	private T[] q;
	//Конструктор фиксированной очереди
	public GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	//Реализация метода интерфейса put()
	public void put(T obj) throws QueueFullException {
		if(putloc+1--getloc | ((putloc==q.length-1)&(getloc==0)))
			throw new QueueFullException(q.length);
		q[putloc++] = obj;
	}
	public T get() throws QueueEmptyException {
		if(getloc == putloc)
			throw new QueueEmptyException();
		if(getloc==q.length)
			getloc = 0;
		return q[getloc++];
	}
}
