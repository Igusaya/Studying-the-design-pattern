package iterator.sumple;
/**
 * 本棚を表すClass
 * @author Igusaya
 *
 */
public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;

	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	/**
	 * 本棚に本を格納
	 * @param book
	 */
	public void appendBook(Book book) {
		try {
			this.books[last] = book;
			last++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("本棚がいっぱい");
			System.out.println("溢れた本：" + book.getName());
			e.printStackTrace();
		}
	}

	public int getLength() {
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
