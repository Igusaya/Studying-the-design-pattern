package singleton.sumple;

public class Singleton {
	/**
	 * static変数として定義することによって、<br>
	 * 当クラスのロード時に一度だけインスタンス生成される。
	 */
	private static Singleton singleton = new Singleton();

	/**
	 * コンストラクタ<br>
	 * 外部からのインスタンス生成を禁止するため、privateを宣言する。
	 */
	private Singleton() {
		System.out.println("インスタンスを生成しました");
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
