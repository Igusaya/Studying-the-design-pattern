package iterator.exercises._1_1;

/**
 * このClassのwhileで使用されるのはIteratorのみ。<br>
 * つまりBookShelf Classの実装が変更されてもIterator IFを適用されてれば修正の必要がない。<br>
 * 練習問題ではBookShelfをArrayListに変更したけど、他Classに影響はなかった
 * @author Igusaya
 *
 */
public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("ABC"));
		bookShelf.appendBook(new Book("BOOK2"));
		bookShelf.appendBook(new Book("Class3"));
		bookShelf.appendBook(new Book("Dinosauls4"));
		bookShelf.appendBook(new Book("EndOf5"));
		bookShelf.appendBook(new Book("FaceBooooo6"));

		Iterator it = bookShelf.iterator();

		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
