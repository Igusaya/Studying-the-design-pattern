package iterator.exercises._1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 本棚を表すClass
 * @author Igusaya
 *
 */
public class BookShelf implements Aggregate {
	private List<Book> books;

	public BookShelf() {
		this.books = new ArrayList<Book>();
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	/**
	 * 本棚に本を格納
	 * @param book
	 */
	public void appendBook(Book book) {
		this.books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
