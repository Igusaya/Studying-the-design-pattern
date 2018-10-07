package singleton.sumple;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start-----");
		System.out.println("getInstance 1回目");
		Singleton obj1 = Singleton.getInstance();
		System.out.println("getInstance 2回目");
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("obj1とobj2の参照先は同一");
		} else {
			System.out.println("obj1とobj2の参照先は異なる");
		}
		System.out.println("End-------");
	}
}
