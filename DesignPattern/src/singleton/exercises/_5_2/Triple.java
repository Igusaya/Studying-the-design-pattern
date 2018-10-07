package singleton.exercises._5_2;

/**
 * インスタンスの上限が3個に限定されているクラス
 * @author Igusaya
 *
 */
public class Triple {
	/*
	 * 解答例では下記インスタンスを配列化してもたせる。
	 * そのほうがgetInstanceの実装がシンプルになる。
	 * エラーハンドリングも楽に実装できるかも
	 */
	private static Triple triple1 = new Triple(1);
	private static Triple triple2 = new Triple(2);
	private static Triple triple3 = new Triple(3);
	private int id;

	private Triple() {
		System.out.println("インスタンスが生成されました");
	}

	private Triple(int id) {
		System.out.println("インスタンスが生成されました id :" + id);
		this.id = id;
	}

	/**
	 * Tripleのインスタンスを返却<br>
	 * idが規定値外の場合、nullを返却
	 * @param id
	 * @return
	 */
	public static Triple getInstance(int id) {
		if (id == 1) {
			return triple1;
		} else if (id == 2) {
			return triple2;
		} else if (id == 3) {
			return triple3;
		}
		return null;
	}

	public int getId() {
		return id;
	}
}
