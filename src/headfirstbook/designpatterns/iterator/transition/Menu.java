package headfirstbook.designpatterns.iterator.transition;

import java.util.Iterator;

public interface Menu {
	public Iterator<?> createIterator();
}
